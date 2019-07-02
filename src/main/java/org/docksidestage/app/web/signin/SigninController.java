package org.docksidestage.app.web.signin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author jflute
 */
@Controller
@RequestMapping("/signin")
public class SigninController {
    @Autowired
    private SigninValidator signinValidator;

    @InitBinder("signinForm")
    public void initBinder(WebDataBinder binder) {
        binder.addValidators(signinValidator);
    }

    @GetMapping
    public String index(@ModelAttribute SigninForm signinForm) {
        return "signin/signin";
    }

    @PostMapping
    public String indexPost(@Validated @ModelAttribute SigninForm signinForm, BindingResult br) {
        return "signin/signin";
    }
}
