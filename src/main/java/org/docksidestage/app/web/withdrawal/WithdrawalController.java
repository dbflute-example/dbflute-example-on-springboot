package org.docksidestage.app.web.withdrawal;

import org.docksidestage.dbflute.allcommon.CDef;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author y.shimizu
 */
@Controller
@RequestMapping("/withdrawal")
public class WithdrawalController {

    // ===================================================================================
    //                                                                     Request Mapping
    //                                                                     ===============
    @GetMapping("/")
    public String showEntry(Model model, WithdrawalForm form) {
        model.addAttribute("withdrawalReasons", CDef.WithdrawalReason.values());
        model.addAttribute("errors");

        return "withdrawal/entry";
    }
}
