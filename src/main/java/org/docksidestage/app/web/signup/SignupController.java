package org.docksidestage.app.web.signup;

import org.docksidestage.dbflute.exbhv.MemberBhv;
import org.docksidestage.dbflute.exbhv.MemberSecurityBhv;
import org.docksidestage.dbflute.exbhv.MemberServiceBhv;
import org.docksidestage.dbflute.exentity.Member;
import org.docksidestage.dbflute.exentity.MemberSecurity;
import org.docksidestage.dbflute.exentity.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author subaru
 * @author jflute
 */
@Controller
@RequestMapping("/signup")
public class SignupController {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Autowired
    private MemberBhv memberBhv;
    @Autowired
    private MemberSecurityBhv memberSecurityBhv;
    @Autowired
    private MemberServiceBhv memberServiceBhv;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private SignupValidator signupValidator;

    // ===================================================================================
    //                                                                          Initialize
    //                                                                          ==========
    @InitBinder("signupForm")
    public void initBinder(WebDataBinder binder) {
        binder.addValidators(signupValidator);
    }

    // ===================================================================================
    //                                                                     Request Mapping
    //                                                                     ===============
    @GetMapping
    public String indexGet(Model model) {
        model.addAttribute("signupForm", new SignupForm());
        return "signup/signup";
    }

    @PostMapping
    @Transactional
    public String indexPost(Model model, @Validated SignupForm signupForm, BindingResult br) {
        if (br.hasErrors()) {
            model.addAttribute("signupForm", signupForm);
            return "signup/signup";
        }
        insertMember(signupForm);
        return "redirect:/member/list";
    }

    // ===================================================================================
    //                                                                              Update
    //                                                                              ======
    private void insertMember(SignupForm form) {
        Member member = new Member();
        member.setMemberName(form.getMemberName());
        member.setMemberAccount(form.getMemberAccount());
        member.setMemberStatusCode_Provisional();
        memberBhv.insert(member); // #simple_for_example same-name concurrent access as application exception

        MemberSecurity security = new MemberSecurity();
        security.setMemberId(member.getMemberId());
        security.setLoginPassword(passwordEncoder.encode(form.getPassword()));
        security.setReminderQuestion(form.getReminderQuestion());
        security.setReminderAnswer(form.getReminderAnswer());
        security.setReminderUseCount(0);
        memberSecurityBhv.insert(security);

        MemberService service = new MemberService();
        service.setMemberId(member.getMemberId());
        service.setServicePointCount(0);
        service.setServiceRankCode_Plastic();
        memberServiceBhv.insert(service);
    }
}
