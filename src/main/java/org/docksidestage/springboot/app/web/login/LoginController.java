package org.docksidestage.springboot.app.web.login;

import javax.naming.NamingException;
import javax.validation.Valid;

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

    @RequestMapping("")
    public String index(LoginForm loginForm, Model model) throws ParseException, NamingException {
        // exception try
        return "/xxx/login/";
    }

    @RequestMapping("/doLogin")
    public String doLogin(@Valid LoginForm loginForm, BindingResult result, Model model) throws ParseException, NamingException {
        if (result.hasErrors()) {
            return "login.html";
        }
        // TODO jflute example: SpringBoot no login check for now
        // return "redirect:/member/3/"
        return "redirect:/member/";
    }
}
