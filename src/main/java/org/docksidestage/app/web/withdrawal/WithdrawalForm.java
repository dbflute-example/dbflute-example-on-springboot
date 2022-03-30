package org.docksidestage.app.web.withdrawal;

/**
 * @author y.shimizu
 */
public class WithdrawalForm {
    /** 退会理由コード */
    private String reasonCode;
    /** 退会理由 */
    private String reasonInput;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    public String getReasonCode() {
        return reasonCode;
    }
    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }
    public String getReasonInput() {
        return reasonInput;
    }
    public void setReasonInput(String reasonInput) {
        this.reasonInput = reasonInput;
    }
}