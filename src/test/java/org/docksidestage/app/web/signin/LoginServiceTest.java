/*
 * Copyright 2014-2022 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.docksidestage.app.web.signin;

import org.docksidestage.unit.UnitContainerTestCase;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * @author jflute
 */
public class LoginServiceTest extends UnitContainerTestCase {

    public void test_loadUserByUsername() {
        // ## Arrange ##
        SigninService service = new SigninService();
        inject(service);

        // ## Act ##
        UserDetails details = service.loadUserByUsername("Pixy");

        // ## Assert ##
        log(details);
        assertEquals("Pixy", details.getUsername());
    }
}
