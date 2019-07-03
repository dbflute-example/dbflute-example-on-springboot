package org.docksidestage.app.web.signin;

import org.docksidestage.app.application.security.MemberUserDetail;
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
public class SigninService implements UserDetailsService {

    @Autowired
    private MemberBhv memberBhv;

    @Override
    public UserDetails loadUserByUsername(String memberAccount) throws UsernameNotFoundException {
        return memberBhv.selectEntity(cb -> {
            cb.setupSelect_MemberSecurityAsOne();
            cb.query().setMemberAccount_Equal(memberAccount);
        }).map(member -> new MemberUserDetail(member)).orElseTranslatingThrow(cause -> {
            throw new UsernameNotFoundException("Not found the account: " + memberAccount, cause);
        });
    }
}
