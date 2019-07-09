package org.docksidestage.app.bean;

import org.docksidestage.dbflute.exentity.Member;

/**
 * @author subaru
 */
public class UserBean {
    private Integer memberId;
    private String memberName;
    private String memberAccount;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public UserBean(Member member) {
        memberId = member.getMemberId();
        memberName = member.getMemberName();
        memberAccount = member.getMemberAccount();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public Integer getMemberId() {
        return memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public String getMemberAccount() {
        return memberAccount;
    }
}
