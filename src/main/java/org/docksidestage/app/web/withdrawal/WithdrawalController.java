package org.docksidestage.app.web.withdrawal;

import java.time.LocalDateTime;

import org.docksidestage.app.application.security.MemberUserDetail;
import org.docksidestage.dbflute.allcommon.CDef;
import org.docksidestage.dbflute.exbhv.MemberBhv;
import org.docksidestage.dbflute.exbhv.MemberWithdrawalBhv;
import org.docksidestage.dbflute.exentity.Member;
import org.docksidestage.dbflute.exentity.MemberWithdrawal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
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
    //                                                                           Attribute
    //                                                                           =========
    @Autowired
    private MemberBhv memberBhv;
    @Autowired
    private MemberWithdrawalBhv memberWithdrawalBhv;

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
        // TODO WithdrawalForm#getReasonCodeが不正な場合はクライアントエラー
        model.addAttribute("selectedReasonText", CDef.WithdrawalReason.of(form.getReasonCode()).orElseThrow().alias());
        model.addAttribute("reasonInput", form.getReasonInput());

        return "withdrawal/withdrawal_confirm";

    }

    @PostMapping("/done")
    public String done(WithdrawalForm form, @AuthenticationPrincipal MemberUserDetail memberUserDetail) {
        // TODO WithdrawalForm#getReasonInputの長さエラーなど、クライアントエラーがありそう

        Integer memberId = memberUserDetail.getMember().getMemberId();
        insertWithdrawal(form, memberId);
        updateStatusWithdrawal(memberId);

        return "redirect:/signin";
    }

    private void insertWithdrawal(WithdrawalForm form, Integer memberId) {
        MemberWithdrawal withdrawal = new MemberWithdrawal();
        withdrawal.setMemberId(memberId);
        withdrawal.setWithdrawalReasonCodeAsWithdrawalReason(CDef.WithdrawalReason.of(form.getReasonCode()).get());
        withdrawal.setWithdrawalReasonInputText(form.getReasonInput());
        // TODO 時間の操作を統一したり、テストをするために、LastaFluteのTimeManagerに当たるものがあった方がいいかも
        withdrawal.setWithdrawalDatetime(LocalDateTime.now());
        memberWithdrawalBhv.insert(withdrawal);
    }

    private void updateStatusWithdrawal(Integer memberId) {
        Member member = new Member();
        member.setMemberId(memberId);
        member.setMemberStatusCode_Withdrawal();
        memberBhv.updateNonstrict(member);
    }

}
