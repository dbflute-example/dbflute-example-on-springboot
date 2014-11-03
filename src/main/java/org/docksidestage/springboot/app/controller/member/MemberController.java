package org.docksidestage.springboot.app.controller.member;

import javax.naming.NamingException;
import javax.validation.Valid;

import org.docksidestage.springboot.app.base.ExampleBaseController;
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
public class MemberController extends ExampleBaseController {

    private static final Logger LOG = LoggerFactory.getLogger(MemberController.class);

    @Autowired
    private MemberBhv memberBhv;

    @RequestMapping("")
    public String index(MemberForm memberForm, Model model) throws ParseException, NamingException {
        // TODO jflute example: springboot example making now 
        int count = memberBhv.selectCount(cb -> {
            cb.query().setMemberStatusCode_Equal_Formalized();
        });
        LOG.debug("count: " + count);
        return "index";
    }

    @RequestMapping("/add")
    public String add(@Valid MemberForm memberForm, BindingResult result, Model model) throws ParseException, NamingException {
        throw new RuntimeException("aaa");
        //        if (result.hasErrors()) {
        //            return "index";
        //        }
        //        return "index";
    }
}
