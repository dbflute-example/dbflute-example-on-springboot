package org.docksidestage.app.web.login;

import org.dbflute.optional.OptionalEntity;
import org.docksidestage.app.application.MemberUserDetail;
import org.docksidestage.dbflute.exbhv.MemberBhv;
import org.docksidestage.dbflute.exentity.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author inoue on 2016/12/18.
 */
@Service
public class LoginService implements UserDetailsService {

    @Autowired
    private MemberBhv memberBhv;
    @Override
    public UserDetails loadUserByUsername(String memberName) throws UsernameNotFoundException {
        OptionalEntity<Member> optMember = memberBhv.selectEntity(cb -> {
            cb.query().setMemberAccount_Equal(memberName);
        });
        return optMember.map(MemberUserDetail::new)
                .orElseThrow(() -> new IllegalArgumentException());
    }
}
