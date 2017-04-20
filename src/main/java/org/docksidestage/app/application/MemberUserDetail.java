package org.docksidestage.app.application;

import java.util.Collection;

import org.docksidestage.dbflute.exentity.Member;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * @author inoue on 2016/12/18.
 */
public class MemberUserDetail implements UserDetails {

    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    public Member member;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public MemberUserDetail(Member member) {
        this.member = member;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    public String toString() {
        return member.toString();
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
        return null;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
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
}
