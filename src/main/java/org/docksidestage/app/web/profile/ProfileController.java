package org.docksidestage.app.web.profile;

import java.util.List;
import java.util.stream.Collectors;

import org.docksidestage.app.application.security.MemberUserDetail;
import org.docksidestage.dbflute.exbhv.MemberBhv;
import org.docksidestage.dbflute.exentity.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author y.shimizu
 */
@Controller
@RequestMapping("/profile")
public class ProfileController {

    @Autowired
    private MemberBhv memberBhv;

    @GetMapping({"", "/"})
    public String show(Model model) {

        model.addAttribute("bean", mappingToBean(selectMember()));

        return "profile/profile.html";
    }

    private Member selectMember() {
        Integer memberId = getUserBean().getMemberId();
        Member member = memberBhv.selectEntity(cb -> {
            cb.setupSelect_MemberStatus();
            cb.setupSelect_MemberServiceAsOne().withServiceRank();
            cb.query().setMemberId_Equal(memberId);
        }).get();
        memberBhv.loadPurchase(member, purCB -> {
            purCB.setupSelect_Product();
            purCB.query().addOrderBy_PurchaseDatetime_Desc();
        });
        return member;
    }

    private Member getUserBean() {
        MemberUserDetail user = (MemberUserDetail) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        return user.getMember();
    }

    private ProfileBean mappingToBean(Member member) {
        ProfileBean bean = new ProfileBean(member);
        List<ProfileBean.PurchasedProductBean> purchaseList = member.getPurchaseList().stream().map(purchase -> {
            return new ProfileBean.PurchasedProductBean(purchase);
        }).collect(Collectors.toList());

        bean.setPurchaseList(purchaseList);
        return bean;
    }
}

