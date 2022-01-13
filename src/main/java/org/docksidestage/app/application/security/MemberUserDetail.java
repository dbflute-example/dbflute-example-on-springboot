package org.docksidestage.app.application.security;

import java.util.Collection;
import java.util.Collections;

import org.docksidestage.app.bean.UserBean;
import org.docksidestage.dbflute.exentity.Member;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * @author inoue on 2016/12/18.
 * @author jflute
 * @author subaru
 */
public class MemberUserDetail implements UserDetails {

    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    // #thinking jflute Exampleだから割り切りstaticにしてる？でもちゃんとしたセッションに入れたい (2022/01/08)
    // (とにもかくにも、いま同時に一人しかログインできないね。というか別の人がログインすると上書きログインになるはず^^)
    public static UserBean userBean; // null allowed when no login

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // #thinking jflute UserDetailsのライフサイクルは？Memberまるごとじゃなくて必要最低限の情報だけの方が良いかも？ (2022/01/08)
    private final Member member; // not null

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * DBFluteのEntityを受け取ってユーザー情報を保持するConstructor.
     * @param member 会員テーブルのDBFlute Entity, ログイン情報のある関連テーブルが紐付いてることが前提 (NotNull)
     */
    public MemberUserDetail(Member member) {
        if (member == null) {
            throw new IllegalArgumentException("The argument 'member' should not be null.");
        }
        this.member = member;
        userBean = new UserBean(member);
    }

    // ===================================================================================
    //                                                                    Details Override
    //                                                                    ================
    @Override
    public String getUsername() {
        return member.getMemberAccount();
    }

    @Override
    public String getPassword() {
        return member.getMemberSecurityAsOne().get().getLoginPassword();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.emptyList();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        // #thinking jflute 退会会員だったらfalseとかの方が良い？でも退会会員だったらそもそもここに来ないか？ (2022/01/08)
        return true;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    public String toString() {
        return member.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public Member getMember() {
        return member;
    }
}
