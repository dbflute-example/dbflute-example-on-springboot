package org.docksidestage.springboot.app.web.member;

import javax.naming.NamingException;
import javax.validation.Valid;

import org.docksidestage.springboot.dbflute.exbhv.MemberBhv;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.ParseException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author jflute
 */
@Controller
@RequestMapping("/member")
public class MemberController {

    private static final Logger LOG = LoggerFactory.getLogger(MemberController.class);

    @Autowired
    private MemberBhv memberBhv; // #dbflute: you can use DBFlute behaviors like this

    @RequestMapping("")
    public String index(Model model, MemberForm memberForm) throws ParseException, NamingException {
        // TODO jflute example: SpringBoot example making now 
        // ControllerClassNameHandlerMapping
        int count = memberBhv.selectCount(cb -> {
            cb.query().setMemberStatusCode_Equal_Formalized();
        });
        LOG.debug("count: " + count);
        return "index";
    }

    @RequestMapping("/add")
    public String add(Model model, @Valid MemberForm memberForm, BindingResult result) throws ParseException, NamingException {
        throw new RuntimeException("aaa");
        //        if (result.hasErrors()) {
        //            return "index";
        //        }
        //        return "index";
    }
}
