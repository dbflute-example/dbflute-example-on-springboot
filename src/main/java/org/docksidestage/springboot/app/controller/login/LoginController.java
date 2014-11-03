package org.docksidestage.springboot.app.controller.login;

import javax.naming.NamingException;
import javax.validation.Valid;

import org.docksidestage.springboot.app.base.ExampleBaseController;
import org.docksidestage.springboot.app.controller.member.MemberController;
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
public class LoginController extends ExampleBaseController {

    @RequestMapping("")
    public String index(LoginForm loginForm, Model model) throws ParseException, NamingException {
        // exception try
        return "/xxx/login/";
    }

    @RequestMapping("/doLogin")
    public String doLogin(@Valid LoginForm loginForm, BindingResult result, Model model) throws ParseException,
            NamingException {
        if (result.hasErrors()) {
            return render(path_Login_LoginHtml);
        }
        // TODO jflute no login check for now
        // return "redirect:/member/3/"
        return redirect(MemberController.class);
    }
}
