package org.docksidestage.app.web.member;

import java.time.LocalDateTime;
import java.util.List;

import org.docksidestage.dbflute.allcommon.CDef;
import org.docksidestage.dbflute.exbhv.MemberBhv;
import org.docksidestage.dbflute.exentity.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author subaru
 */
@Controller
@RequestMapping("/member/add")
public class MemberAddController {
    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Autowired
    private MemberBhv memberBhv; // #dbflute: you can use DBFlute behaviors like this

    @ModelAttribute
    public List<CDef.MemberStatus> memberStatusList() {
        return CDef.MemberStatus.listAll();
    }

    // ===================================================================================
    //                                                                             Routing
    //                                                                             =======
    @GetMapping
    public String addGet(@ModelAttribute(name = "addForm") MemberAddForm addForm) {
        return "member/member_add";
    }

    @PostMapping
    public String addPost(@ModelAttribute(name = "addForm") @Validated MemberAddForm addForm, BindingResult br) {
        if (br.hasErrors()) {
            return "member/member_add";
        }
        insertMember(addForm);
        return "redirect:/member/list";
    }

    private void insertMember(MemberAddForm form) {
        Member member = new Member();
        member.setMemberName(form.getMemberName());
        member.setMemberAccount(form.getMemberAccount());
        member.setBirthdate(form.getBirthdate());
        member.setMemberStatusCodeAsMemberStatus(CDef.MemberStatus.codeOf(form.getMemberStatus()));
        if (member.isMemberStatusCodeFormalized()) {
            member.setFormalizedDatetime(LocalDateTime.now());
        }
        memberBhv.insert(member);
    }
}
