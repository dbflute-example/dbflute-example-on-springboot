package org.docksidestage.app.web.signin;

import org.dbflute.optional.OptionalEntity;
import org.docksidestage.app.util.ExampleStringUtils;
import org.docksidestage.dbflute.exbhv.MemberBhv;
import org.docksidestage.dbflute.exentity.Member;
import org.docksidestage.dbflute.exentity.MemberSecurity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * @author subaru
 */
@Component
public class SigninValidator implements Validator {
    @Autowired
    private MemberBhv memberBhv;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public boolean supports(Class<?> clazz) {
        return SigninForm.class.isAssignableFrom(clazz);
    }
    @Override
    public void validate(Object target, Errors errors) {
        SigninForm form = (SigninForm) target;
        if (ExampleStringUtils.isEmpty(form.getAccount()) || ExampleStringUtils.isEmpty(form.getPassword())) {
            return;
        }

        OptionalEntity<Member> optMember = memberBhv.selectEntity(cb -> {
            cb.setupSelect_MemberSecurityAsOne();
            cb.query().setMemberAccount_Equal(form.getAccount());
        });
        if (!optMember.isPresent()) {
            errors.rejectValue("account", "errors.signin.account.notfound");
            return;
        }

        MemberSecurity security = optMember.get().getMemberSecurityAsOne().get();
        if (!security.getLoginPassword().equals(passwordEncoder.encode(form.getPassword()))) {
            errors.rejectValue("password", "errors.signin.password.incorrect");
            return;
        }
    }
}
