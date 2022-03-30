package org.docksidestage.app.web.withdrawal;

import java.util.Optional;

import org.dbflute.optional.OptionalThing;
import org.docksidestage.dbflute.allcommon.CDef;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
    public String showEntry(Model model) {
        // 表示する退会区分は区分値から取得する。
        // 区分値はデータベース上管理されたコードなので、画面表示用には本来専用のコードに詰め替えた方がいいのかもしれない
        model.addAttribute("withdrawalReasons", CDef.WithdrawalReason.values());

        return "withdrawal/withdrawal_entry";
    }

    @PostMapping("/confirm")
    public String showConfirm(Model model, WithdrawalForm form) {
        model.addAttribute("selectedReason", form.getReasonCode());
        model.addAttribute("selectedReasonText", CDef.WithdrawalReason.of(form.getReasonCode()).orElseThrow().alias());
        model.addAttribute("reasonInput", form.getReasonInput());

        return "withdrawal/withdrawal_confirm";

    }

    @PostMapping("/done")
    public String done(WithdrawalForm form) {
        // TODO 退会処理
        return "redirect:/signin";
    }
}
