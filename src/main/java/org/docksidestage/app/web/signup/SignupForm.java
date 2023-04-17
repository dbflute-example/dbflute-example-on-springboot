package org.docksidestage.app.web.signup;

import jakarta.validation.constraints.NotEmpty;

/**
 * @author subaru
 * @author jflute
 */
public class SignupForm {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // member
    @NotEmpty
    private String memberName;
    @NotEmpty
    private String memberAccount;

    // security
    @NotEmpty
    private String password;
    @NotEmpty
    private String reminderQuestion;
    @NotEmpty
    private String reminderAnswer;

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberAccount() {
        return memberAccount;
    }

    public void setMemberAccount(String memberAccount) {
        this.memberAccount = memberAccount;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getReminderQuestion() {
        return reminderQuestion;
    }

    public void setReminderQuestion(String reminderQuestion) {
        this.reminderQuestion = reminderQuestion;
    }

    public String getReminderAnswer() {
        return reminderAnswer;
    }

    public void setReminderAnswer(String reminderAnswer) {
        this.reminderAnswer = reminderAnswer;
    }
}
