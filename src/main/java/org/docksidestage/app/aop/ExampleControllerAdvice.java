package org.docksidestage.app.aop;

import org.docksidestage.app.bean.HeaderBean;
import org.docksidestage.app.bean.UserBean;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 * @author subaru
 */
@ControllerAdvice
public class ExampleControllerAdvice {
    @ModelAttribute
    public HeaderBean headerBean(UserBean userBean) {
        if (userBean != null) {
            return new HeaderBean(userBean);
        }
        return HeaderBean.empty();
    }
}
