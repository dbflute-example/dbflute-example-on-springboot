package org.docksidestage.app.web.login;

import org.docksidestage.app.application.MemberUserDetail;
import org.docksidestage.dbflute.exbhv.MemberBhv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author inoue on 2016/12/18.
 * @author jflute
 */
@Service
public class LoginService implements UserDetailsService {

    @Autowired
    private MemberBhv memberBhv;

    @Override
    public UserDetails loadUserByUsername(String memberAccount) throws UsernameNotFoundException {
        return memberBhv.selectEntity(cb -> {
            cb.query().setMemberAccount_Equal(memberAccount);
        }).map(MemberUserDetail::new).orElseThrow(() -> new IllegalArgumentException());
    }
}
