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
 */
public class MemberUserDetail implements UserDetails {

    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private final Member member;
    public static UserBean userBean;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public MemberUserDetail(Member member) {
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
