package org.docksidestage.app.web.login;

import org.docksidestage.unit.UnitContainerTestCase;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * @author jflute
 */
public class LoginServiceTest extends UnitContainerTestCase {

    public void test_loadUserByUsername() {
        // ## Arrange ##
        LoginService service = new LoginService();
        inject(service);

        // ## Act ##
        UserDetails details = service.loadUserByUsername("Pixy");

        // ## Assert ##
        log(details);
        assertEquals("Pixy", details.getUsername());
    }
}
