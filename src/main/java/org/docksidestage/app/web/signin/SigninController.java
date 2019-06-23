package org.docksidestage.app.web.signin;

import org.docksidestage.app.bean.HeaderBean;
import org.docksidestage.app.bean.UserBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author jflute
 */
@Controller
@RequestMapping("/signin")
public class SigninController {

    private static final Logger logger = LoggerFactory.getLogger(SigninController.class);

    @GetMapping
    public String index(Model model, SigninForm signinForm) {
        logger.debug("#form: {}", signinForm);
        model.addAttribute("loginForm", signinForm);
        model.addAttribute("headerBean", HeaderBean.empty());
        return "signin/signin";
    }
}
