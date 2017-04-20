package org.docksidestage.app.application.security;

import java.util.Collection;
import java.util.Collections;

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

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public MemberUserDetail(Member member) {
        this.member = member;
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
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
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
