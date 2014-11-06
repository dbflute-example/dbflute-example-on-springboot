package org.docksidestage.springboot.app.web.login;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author jflute
 */
public class LoginForm {

    @NotEmpty
    @Length(max = 50)
    private String memberAccount;
    @NotEmpty
    @Length(max = 20)
    private String password;

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
}
