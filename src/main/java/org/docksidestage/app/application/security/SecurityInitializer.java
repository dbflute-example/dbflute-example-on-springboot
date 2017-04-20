package org.docksidestage.app.application.security;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

/**
 * @author inoue on 2016/12/18.
 * @author jflute
 */
public class SecurityInitializer extends AbstractSecurityWebApplicationInitializer {

    public SecurityInitializer() {
        super(SecurityConfig.class, SecurityConfig.class);
    }
}
