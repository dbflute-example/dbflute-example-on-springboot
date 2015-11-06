package org.docksidestage.app.web.login;

import javax.naming.NamingException;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.expression.ParseException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author jflute
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @RequestMapping("")
    public String index(LoginForm loginForm, Model model) throws ParseException, NamingException {
        logger.debug("#form: {}", loginForm);
        return "login/login";
    }

    @RequestMapping("/doLogin")
    public String doLogin(@Valid LoginForm loginForm, BindingResult result, Model model) throws ParseException, NamingException {
        logger.debug("#form: {}", loginForm);
        if (result.hasErrors()) {
            return "login/login";
        }
        // TODO jflute example: SpringBoot no login check for now
        // return "redirect:/member/3/"
        return "redirect:/member/";
    }
}
