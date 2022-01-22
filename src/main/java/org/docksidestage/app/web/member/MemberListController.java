package org.docksidestage.app.web.member;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.dbflute.cbean.result.PagingResultBean;
import org.dbflute.util.DfTypeUtil;
import org.docksidestage.bizfw.utils.ExampleStringUtils;
import org.docksidestage.dbflute.allcommon.CDef;
import org.docksidestage.dbflute.exbhv.MemberBhv;
import org.docksidestage.dbflute.exentity.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author jflute
 */
@Controller
@RequestMapping("/member/list")
public class MemberListController {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Autowired
    private MemberBhv memberBhv; // #dbflute: you can use DBFlute behaviors like this

    @ModelAttribute
    public List<CDef.MemberStatus> memberStatusList() {
        return CDef.MemberStatus.listAll();
    }

    // ===================================================================================
    //                                                                             Routing
    //                                                                             =======
    @GetMapping
    public String list(Model model, @ModelAttribute(name = "searchForm") @Valid MemberSearchForm searchForm, BindingResult br) {
        if (br.hasErrors()) {
            model.addAttribute("beans", Collections.emptyList()); // #for_now avoid error
            // #hope change type failure message
            // _/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/
            // Failed to convert property value of type
            // java.lang.String to required type java.lang.Integer for property pageNumber;
            // nested exception is java.lang.NumberFormatException: For input string: "sea"
            // _/_/_/_/_/_/_/_/_/_/
            return "member/member_list";
        }
        PagingResultBean<Member> page = selectMemberPage(searchForm);
        model.addAttribute("beans", convertToResultBeans(page));
        return "member/member_list";
    }

    private PagingResultBean<Member> selectMemberPage(MemberSearchForm form) { // #dbflute: you can select like this
        return memberBhv.selectPage(cb -> {
            cb.setupSelect_MemberStatus();
            cb.specify().derivedPurchase().count(purchaseCB -> {
                purchaseCB.specify().columnPurchaseId();
            }, Member.ALIAS_purchaseCount);
            if (ExampleStringUtils.isNotEmpty(form.getMemberName())) {
                cb.query().setMemberName_LikeSearch(form.getMemberName(), op -> op.likeContain());
            }
            if (ExampleStringUtils.isNotEmpty(form.getPurchaseProductName()) || form.isUnpaid()) {
                cb.query().existsPurchase(purchaseCB -> {
                    if (ExampleStringUtils.isNotEmpty(form.getPurchaseProductName())) {
                        purchaseCB.query().queryProduct().setProductName_LikeSearch(form.getPurchaseProductName(), op -> op.likeContain());
                    }
                    if (form.isUnpaid()) {
                        purchaseCB.query().setPaymentCompleteFlg_Equal_False();
                    }
                });
            }
            if (ExampleStringUtils.isNotEmpty(form.getMemberStatus())) {
                cb.query().setMemberStatusCode_Equal_AsMemberStatus(CDef.MemberStatus.codeOf(form.getMemberStatus()));
            }
            if (form.getFormalizedDateFrom() != null || form.getFormalizedDateTo() != null) {
                LocalDateTime fromTime = form.getFormalizedDateFrom() != null ? form.getFormalizedDateFrom().atStartOfDay() : null;
                LocalDateTime toTime = form.getFormalizedDateTo() != null ? form.getFormalizedDateTo().atStartOfDay() : null;
                cb.query().setFormalizedDatetime_FromTo(fromTime, toTime, op -> op.compareAsDate().allowOneSide());
            }
            cb.query().addOrderBy_UpdateDatetime_Desc();
            cb.query().addOrderBy_MemberId_Asc();
            cb.paging(4, form.getPageNumber());
        });
    }

    private List<MemberSearchRowBean> convertToResultBeans(PagingResultBean<Member> page) {
        List<MemberSearchRowBean> beanList = page.stream().map(member -> {
            MemberSearchRowBean bean = new MemberSearchRowBean();
            bean.setMemberId(member.getMemberId());
            bean.memberName = member.getMemberName();
            member.getMemberStatus().alwaysPresent(status -> {
                bean.memberStatusName = status.getMemberStatusName();
            });
            bean.formalizedDate = DfTypeUtil.toStringDate(member.getFormalizedDatetime(), "yyyy/MM/dd");
            bean.updateDatetime = DfTypeUtil.toStringDate(member.getUpdateDatetime(), "yyyy/MM/dd");
            bean.withdrawalMember = member.isMemberStatusCodeWithdrawal();
            bean.purchaseCount = member.getPurchaseCount();
            return bean;
        }).collect(Collectors.toList());
        return beanList;
    }
}
