package org.docksidestage.app.web.signin;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author jflute
 * @author inoue
 */
public class SigninForm {

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
