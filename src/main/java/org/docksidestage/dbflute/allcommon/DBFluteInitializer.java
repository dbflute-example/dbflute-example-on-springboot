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
package org.docksidestage.dbflute.allcommon;

import org.dbflute.dbway.DBDef;
import org.dbflute.jdbc.DataSourceHandler;
import org.dbflute.system.DBFluteSystem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author DBFlute(AutoGenerator)
 */
public class DBFluteInitializer {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The logger instance for this class. (NotNull) */
    private static final Logger _log = LoggerFactory.getLogger(DBFluteInitializer.class);

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final String _dataSourceFqcn;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor, which initializes various components.
     * @param dataSource The instance of data source. (NotNull)
     */
    public DBFluteInitializer(javax.sql.DataSource dataSource) {
        if (dataSource == null) {
            String msg = "The argument 'dataSource' should not be null!";
            throw new IllegalArgumentException(msg);
        }
        _dataSourceFqcn = dataSource.getClass().getName();
        announce();
        prologue();
        standBy();
    }

    // ===================================================================================
    //                                                                             Curtain
    //                                                                             =======
    /**
     * DBFlute will begin in just a few second.
     */
    protected void announce() {
        _log.info("...Initializing DBFlute components");
    }

    /**
     * This is the story for ... <br>
     * You can override this to set your DBFluteConfig settings
     * with calling super.prologue() in it.
     */
    protected void prologue() {
        setupDataSourceHandler(_dataSourceFqcn);
        adjustDBFluteSystem();
    }

    /**
     * Enjoy your DBFlute life.
     */
    protected void standBy() {
        if (!DBFluteConfig.getInstance().isLocked()) {
            DBFluteConfig.getInstance().lock();
        }
        if (!DBFluteSystem.isLocked()) {
            DBFluteSystem.lock();
        }
    }

    // ===================================================================================
    //                                                                            Contents
    //                                                                            ========
    /**
     * Set up the handler of data source to the configuration of DBFlute. <br>
     * If it uses commons-DBCP, it needs to arrange some for transaction.
     * <ul>
     *     <li>A. To use DataSourceUtils which is Spring Framework class.</li>
     *     <li>B. To use TransactionConnection that is original class and doesn't close really.</li>
     * </ul>
     * If you use a transaction library which has a data source which supports transaction,
     * It doesn't need these arrangement. (For example, the framework 'Atomikos') <br>
     * This method should be executed when application is initialized.
     * @param dataSourceFqcn The FQCN of data source. (NotNull)
     */
    protected void setupDataSourceHandler(String dataSourceFqcn) { // for Spring
        final DBFluteConfig config = DBFluteConfig.getInstance();
        final DataSourceHandler dataSourceHandler = config.getDataSourceHandler();
        if (dataSourceHandler != null) {
            return;
        }
        if (needsSpringTransactionalDataSource(dataSourceFqcn)) {
            config.unlock();
            config.setDataSourceHandler(new DBFluteConfig.SpringTransactionalDataSourceHandler());
        }
    }

    protected boolean needsSpringTransactionalDataSource(String dataSourceFqcn) {
        return dataSourceFqcn.startsWith("org.apache.commons.dbcp.")
            || dataSourceFqcn.startsWith("org.apache.commons.dbcp2.")
            || dataSourceFqcn.startsWith("org.apache.tomcat.jdbc.pool.")
            || dataSourceFqcn.startsWith("com.zaxxer.hikari.");
    }

    /**
     * Adjust DBFlute system if it needs.
     */
    protected void adjustDBFluteSystem() {
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    protected boolean isCurrentDBDef(DBDef currentDBDef) {
        return DBCurrent.getInstance().isCurrentDBDef(currentDBDef);
    }

    // ===================================================================================
    //                                                                      General Helper
    //                                                                      ==============
    protected String ln() {
        return DBFluteSystem.ln();
    }
}
