/*
 * Copyright 2014-2015 the original author or authors.
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

import java.io.File;
import java.io.IOException;

import org.dbflute.util.DfReflectionUtil;
import org.dbflute.util.DfResourceUtil;
import org.springframework.beans.factory.FactoryBean;

/**
 * The bean for resolving a path to a database of H2 Database. <br>
 * This is NOT an important class as example. So you don't need to read this.
 * @author jflute
 */
public class EmbeddedH2UrlFactoryBean implements FactoryBean<Object> {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private String urlSuffix;
    private String referenceClassName;

    // ===================================================================================
    //                                                                                Main
    //                                                                                ====
    public Object getObject() throws Exception {
        return getUrl();
    }

    public Class<?> getObjectType() {
        return String.class;
    }

    public boolean isSingleton() {
        return true;
    }

    private String getUrl() {
        try {
            final File f = getBuildDir();
            final String canonicalPath = f.getCanonicalPath();
            final String url = "jdbc:h2:file:" + canonicalPath.replace('\\', '/') + urlSuffix;
            return url;
        } catch (final IOException e) {
            throw new RuntimeException(e);
        }
    }

    private File getBuildDir() {
        final Class<?> clazz = DfReflectionUtil.forName(referenceClassName);
        return DfResourceUtil.getBuildDir(clazz);
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public void setReferenceClassName(final String referenceClassName) {
        this.referenceClassName = referenceClassName;
    }

    public void setUrlSuffix(final String urlSuffix) {
        this.urlSuffix = urlSuffix;
    }
}
