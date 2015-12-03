package org.docksidestage.app.web.login;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author jflute
 */
public class LoginForm {

    @NotEmpty
    @Length(max = 50)
    public String memberAccount;
    @NotEmpty
    @Length(max = 20)
    public String password;

    @Override
    public String toString() {
        return "login:{" + memberAccount + ", " + password + "}";
    }
}
