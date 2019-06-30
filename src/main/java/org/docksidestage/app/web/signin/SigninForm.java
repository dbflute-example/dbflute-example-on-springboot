package org.docksidestage.app.web.signin;

import javax.validation.constraints.NotEmpty;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

/**
 * @author jflute
 * @author inoue
 */
@Data
public class SigninForm {

    @NotEmpty
    @Length(max = 50)
    private String account;

    @NotEmpty
    @Length(max = 20)
    private String password;
}
