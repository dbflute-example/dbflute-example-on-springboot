/*
 * Copyright 2014-2017 the original author or authors.
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
package org.docksidestage.unit;

import java.util.List;

import org.dbflute.utflute.spring.ContainerTestCase;
import org.dbflute.util.DfCollectionUtil;
import org.docksidestage.dbflute.allcommon.DBFluteBeansJavaConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * The test case with container for unit test.
 * @author jflute
 */
public abstract class UnitContainerTestCase extends ContainerTestCase {

    // ===================================================================================
    //                                                                            Settings
    //                                                                            ========
    @Override
    protected ApplicationContext provideDefaultApplicationContext() {
        List<Class<?>> configList = DfCollectionUtil.newArrayList();
        configList.add(JdbcBeansJavaConfig.class);
        configList.add(DBFluteBeansJavaConfig.class);
        configList.add(LogicBeansJavaConfig.class);
        readyConfigs(configList);
        return new AnnotationConfigApplicationContext(configList.toArray(new Class<?>[] {}));
    }

    /**
     * Ready configurations of your unit test. <br>
     * You can add your own configurations. <br>
     * (several configurations are already registered as default)
     * @param configList The list of java configuration type for Spring Framework. (NotNull, Mutable)
     */
    protected void readyConfigs(List<Class<?>> configList) { // you can override
    }
}
