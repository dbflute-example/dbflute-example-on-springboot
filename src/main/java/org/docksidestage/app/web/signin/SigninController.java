package org.docksidestage.app.web.signin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author jflute
 */
@Controller
@RequestMapping("/signin")
public class SigninController {

    @GetMapping
    public String index(@ModelAttribute SigninForm signinForm) {
        return "signin/signin";
    }
}
