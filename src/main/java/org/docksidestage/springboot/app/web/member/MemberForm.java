package org.docksidestage.springboot.app.web.member;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author jflute
 */
public class MemberForm {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @NotEmpty
    @Length(max = 8)
    private String memberName;
    @NotEmpty
    private String birthdate;

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    public String toString() {
        return "{" + memberName + ", " + birthdate + "}";
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }
}
