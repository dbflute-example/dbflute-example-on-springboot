package org.docksidestage.app.web.member;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import javax.naming.NamingException;
import javax.sql.DataSource;
import javax.validation.Valid;

import org.dbflute.cbean.result.PagingResultBean;
import org.dbflute.util.DfTypeUtil;
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
    @Autowired
    private DataSource dataSource;

    // ===================================================================================
    //                                                                              Entry
    //                                                                             =======
    @RequestMapping("")
    @Transactional
    public String index(Model model, MemberForm memberForm) throws ParseException, NamingException {
        int count = memberBhv.selectCount(cb -> {
            cb.query().setMemberStatusCode_Equal_Formalized();
        });
        logger.debug("count: {}", count);
        return "index";
    }

    // ===================================================================================
    //                                                                           Show List
    //                                                                           =========
    @RequestMapping("/list")
    public String list(Model model, @Valid MemberSearchForm memberSearchForm, BindingResult result) throws ParseException, NamingException {
        PagingResultBean<Member> page = selectMemberPage(memberSearchForm);
        model.addAttribute("beans", convertToResultBeans(page));
        return "member/member_list";
    }

    protected PagingResultBean<Member> selectMemberPage(MemberSearchForm memberSearchForm) { // #dbflute: you can select like this
        return memberBhv.selectPage(cb -> {
            cb.ignoreNullOrEmptyQuery();
            cb.setupSelect_MemberStatus();
            cb.specify().derivedPurchase().count(purchaseCB -> {
                purchaseCB.specify().columnPurchaseId();
            }, Member.ALIAS_purchaseCount);

            cb.query().setMemberName_LikeSearch(memberSearchForm.memberName, op -> op.likeContain());
            final String purchaseProductName = memberSearchForm.purchaseProductName;
            final boolean unpaid = memberSearchForm.unpaid;
            if ((purchaseProductName != null && purchaseProductName.trim().length() > 0) || unpaid) {
                cb.query().existsPurchase(purchaseCB -> {
                    purchaseCB.query().queryProduct().setProductName_LikeSearch(purchaseProductName, op -> op.likeContain());
                    if (unpaid) {
                        purchaseCB.query().setPaymentCompleteFlg_Equal_False();
                    }
                });
            }
            cb.query().setMemberStatusCode_Equal_AsMemberStatus(CDef.MemberStatus.codeOf(memberSearchForm.memberStatus));
            LocalDateTime formalizedDateFrom = DfTypeUtil.toLocalDateTime(memberSearchForm.formalizedDateFrom);
            LocalDateTime formalizedDateTo = DfTypeUtil.toLocalDateTime(memberSearchForm.formalizedDateTo);
            cb.query().setFormalizedDatetime_FromTo(formalizedDateFrom, formalizedDateTo, op -> op.compareAsDate());

            cb.query().addOrderBy_UpdateDatetime_Desc();
            cb.query().addOrderBy_MemberId_Asc();

            int pageSize = 4;
            cb.paging(pageSize, memberSearchForm.pageNumber);
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
