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

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.docksidestage.dbflute.allcommon.DBCurrent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

/**
 * @author DBFlute(AutoGenerator)
 */
@Configuration
public class JdbcBeansJavaConfig {

    @Autowired
    protected DataSource dataSource;

    @Resource(name = "maihamaDbUrl")
    protected String maihamaDbUrl;

    @Bean(name = "dataSource")
    public DataSource createDataSource() {
        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName("org.h2.Driver");
        ds.setUrl(maihamaDbUrl);
        ds.setUsername("sa");
        ds.setPassword("");
        ds.setMaxActive(20);
        return ds;
    }

    @Bean(name = "transactionManager")
    public PlatformTransactionManager createTransactionManager() {
        DataSourceTransactionManager manager = new DataSourceTransactionManager();
        manager.setDataSource(dataSource);
        return manager;
    }

    @Bean(name = { "maihamaDbUrl" })
    public EmbeddedH2UrlFactoryBean createEmbeddedH2UrlFactoryBean() {
        EmbeddedH2UrlFactoryBean bean = new EmbeddedH2UrlFactoryBean();
        bean.setUrlSuffix("../../../etc/database/maihamadb");
        bean.setReferenceClassName(DBCurrent.class.getName());
        return bean;
    }
}
