package org.docksidestage.app.web.member;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import javax.naming.NamingException;
import javax.validation.Valid;

import org.dbflute.cbean.result.PagingResultBean;
import org.dbflute.util.DfTypeUtil;
import org.docksidestage.app.bean.HeaderBean;
import org.docksidestage.app.bean.UserBean;
import org.docksidestage.dbflute.allcommon.CDef;
import org.docksidestage.dbflute.exbhv.MemberBhv;
import org.docksidestage.dbflute.exentity.Member;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.ParseException;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author jflute
 */
@Controller
@RequestMapping("/member")
public class MemberController {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    private static final Logger logger = LoggerFactory.getLogger(MemberController.class);

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Autowired
    private MemberBhv memberBhv; // #dbflute: you can use DBFlute behaviors like this

    // ===================================================================================
    //                                                                              Entry
    //                                                                             =======
    @RequestMapping("")
    @Transactional
    public String index(Model model, MemberForm memberForm) {
        int count = memberBhv.selectCount(cb -> {
            cb.query().setMemberStatusCode_Equal_Formalized();
        });
        logger.debug("count: {}", count);
        model.addAttribute("memmberForm", memberForm);
        return "index";
    }

    // ===================================================================================
    //                                                                           Show List
    //                                                                           =========
    // http://localhost:8080/member/list?pageNumber=1
    // http://localhost:8080/member/list?pageNumber=sea
    @RequestMapping("/list")
    public String list(Model model, @Valid MemberSearchForm form, BindingResult result, UserBean userBean) {
        logger.debug("#form: {}", form);
        if (result.hasErrors()) {
            logger.debug("has error:" + result.getFieldErrors());
            model.addAttribute("headerBean", HeaderBean.empty());
            model.addAttribute("beans", Collections.emptyList()); // #for_now avoid error
            // #hope change type failure message
            // _/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/
            // Failed to convert property value of type
            // java.lang.String to required type java.lang.Integer for property pageNumber;
            // nested exception is java.lang.NumberFormatException: For input string: "sea"
            // _/_/_/_/_/_/_/_/_/_/
            return "member/member_list";
        }
        PagingResultBean<Member> page = selectMemberPage(form);
        model.addAttribute("headerBean", HeaderBean.empty());
        model.addAttribute("beans", convertToResultBeans(page));
        return "member/member_list";
    }

    protected PagingResultBean<Member> selectMemberPage(MemberSearchForm form) { // #dbflute: you can select like this
        return memberBhv.selectPage(cb -> {
            cb.ignoreNullOrEmptyQuery();
            cb.setupSelect_MemberStatus();
            cb.specify().derivedPurchase().count(purchaseCB -> {
                purchaseCB.specify().columnPurchaseId();
            }, Member.ALIAS_purchaseCount);

            cb.query().setMemberName_LikeSearch(form.getMemberName(), op -> op.likeContain());
            final String purchaseProductName = form.purchaseProductName;
            final boolean unpaid = form.unpaid;
            if ((purchaseProductName != null && purchaseProductName.trim().length() > 0) || unpaid) {
                cb.query().existsPurchase(purchaseCB -> {
                    purchaseCB.query().queryProduct().setProductName_LikeSearch(purchaseProductName, op -> op.likeContain());
                    if (unpaid) {
                        purchaseCB.query().setPaymentCompleteFlg_Equal_False();
                    }
                });
            }
            cb.query().setMemberStatusCode_Equal_AsMemberStatus(CDef.MemberStatus.codeOf(form.memberStatus));
            LocalDateTime formalizedDateFrom = DfTypeUtil.toLocalDateTime(form.getFormalizedDateFrom());
            LocalDateTime formalizedDateTo = DfTypeUtil.toLocalDateTime(form.formalizedDateTo);
            cb.query().setFormalizedDatetime_FromTo(formalizedDateFrom, formalizedDateTo, op -> op.compareAsDate());

            cb.query().addOrderBy_UpdateDatetime_Desc();
            cb.query().addOrderBy_MemberId_Asc();

            int pageSize = 4;
            cb.paging(pageSize, form.getPageNumber());
        });
    }

    protected List<MemberSearchRowBean> convertToResultBeans(PagingResultBean<Member> page) {
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

    // ===================================================================================
    //                                                                          Add Member
    //                                                                          ==========
    @RequestMapping("/add")
    public String add(Model model, @Valid MemberForm memberForm, BindingResult result) throws ParseException, NamingException {
        throw new RuntimeException("not implemented yet");
    }
}
