package org.docksidestage.app.web.signup;

import javax.validation.constraints.NotEmpty;

import lombok.Data;

/**
 * @author subaru
 */
@Data
public class SignupForm {

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
}

