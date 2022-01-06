package org.docksidestage.app.web.signup;

import org.docksidestage.bizfw.utils.ExampleStringUtils;
import org.docksidestage.dbflute.exbhv.MemberBhv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * @author subaru
 */
@Component
public class SignupValidator implements Validator {
    @Autowired
    private MemberBhv memberBhv;

    @Override
    public boolean supports(Class<?> clazz) {
        return SignupForm.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        SignupForm form = (SignupForm) target;
        if (ExampleStringUtils.isEmpty(form.getMemberName())) {
            return;
        }
        if (ExampleStringUtils.isEmpty(form.getMemberAccount())) {
            return;
        }
        if (ExampleStringUtils.isEmpty(form.getPassword())) {
            return;
        }
        if (ExampleStringUtils.isEmpty(form.getReminderQuestion())) {
            return;
        }
        if (ExampleStringUtils.isEmpty(form.getReminderAnswer())) {
            return;
        }

        memberBhv.selectEntity(cb -> {
            cb.query().setMemberAccount_Equal(form.getMemberAccount());
        }).ifPresent(member -> {
            errors.rejectValue("memberAccount", "errors.signup.account.already.exists");
        });
    }
}
