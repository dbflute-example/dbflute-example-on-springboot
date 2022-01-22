package org.docksidestage.app.bean;

import org.docksidestage.dbflute.exentity.Member;

/**
 * ログインしているユーザーの情報を保持するクラス。<br>
 * ログインセッション中はインスタンスが維持される。(セッション実現方法は問わず)
 * 
 * <p>Spring の UserDetails を直接は使わず、アプリケーションではフレームワーク非依存のこのクラスを使う。
 * そうする必要性はあまりないかもだが、ひとまずLastaFluteのやり方と似せてこのようにしている。</p>
 * 
 * @author subaru
 * @author jflute
 */
public class UserBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private final Integer memberId;
    private final String memberName;
    private final String memberAccount;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public UserBean(Member member) {
        memberId = member.getMemberId();
        memberName = member.getMemberName();
        memberAccount = member.getMemberAccount();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public Integer getMemberId() {
        return memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public String getMemberAccount() {
        return memberAccount;
    }
}
