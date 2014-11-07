/*
 * Copyright 2014-2014 the original author or authors.
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
package org.docksidestage.springboot.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import org.docksidestage.springboot.dbflute.allcommon.*;
import org.docksidestage.springboot.dbflute.exentity.*;

/**
 * The DB meta of SUMMARY_WITHDRAWAL. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SummaryWithdrawalDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SummaryWithdrawalDbm _instance = new SummaryWithdrawalDbm();
    private SummaryWithdrawalDbm() {}
    public static SummaryWithdrawalDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((SummaryWithdrawal)et).getMemberId(), (et, vl) -> ((SummaryWithdrawal)et).setMemberId(cti(vl)), "memberId");
        setupEpg(_epgMap, et -> ((SummaryWithdrawal)et).getMemberName(), (et, vl) -> ((SummaryWithdrawal)et).setMemberName((String)vl), "memberName");
        setupEpg(_epgMap, et -> ((SummaryWithdrawal)et).getWithdrawalReasonCode(), (et, vl) -> ((SummaryWithdrawal)et).setWithdrawalReasonCode((String)vl), "withdrawalReasonCode");
        setupEpg(_epgMap, et -> ((SummaryWithdrawal)et).getWithdrawalReasonText(), (et, vl) -> ((SummaryWithdrawal)et).setWithdrawalReasonText((String)vl), "withdrawalReasonText");
        setupEpg(_epgMap, et -> ((SummaryWithdrawal)et).getWithdrawalReasonInputText(), (et, vl) -> ((SummaryWithdrawal)et).setWithdrawalReasonInputText((String)vl), "withdrawalReasonInputText");
        setupEpg(_epgMap, et -> ((SummaryWithdrawal)et).getWithdrawalDatetime(), (et, vl) -> ((SummaryWithdrawal)et).setWithdrawalDatetime((java.time.LocalDateTime)vl), "withdrawalDatetime");
        setupEpg(_epgMap, et -> ((SummaryWithdrawal)et).getMemberStatusCode(), (et, vl) -> ((SummaryWithdrawal)et).setMemberStatusCode((String)vl), "memberStatusCode");
        setupEpg(_epgMap, et -> ((SummaryWithdrawal)et).getMemberStatusName(), (et, vl) -> ((SummaryWithdrawal)et).setMemberStatusName((String)vl), "memberStatusName");
        setupEpg(_epgMap, et -> ((SummaryWithdrawal)et).getMaxPurchasePrice(), (et, vl) -> ((SummaryWithdrawal)et).setMaxPurchasePrice(cti(vl)), "maxPurchasePrice");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SUMMARY_WITHDRAWAL";
    protected final String _tablePropertyName = "summaryWithdrawal";
    protected final TableSqlName _tableSqlName = new TableSqlName("SUMMARY_WITHDRAWAL", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMemberId = cci("MEMBER_ID", "MEMBER_ID", null, null, Integer.class, "memberId", null, false, false, false, "INTEGER", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnMemberName = cci("MEMBER_NAME", "MEMBER_NAME", null, null, String.class, "memberName", null, false, false, false, "VARCHAR", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnWithdrawalReasonCode = cci("WITHDRAWAL_REASON_CODE", "WITHDRAWAL_REASON_CODE", null, null, String.class, "withdrawalReasonCode", null, false, false, false, "CHAR", 3, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnWithdrawalReasonText = cci("WITHDRAWAL_REASON_TEXT", "WITHDRAWAL_REASON_TEXT", null, null, String.class, "withdrawalReasonText", null, false, false, false, "CLOB", 2147483647, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnWithdrawalReasonInputText = cci("WITHDRAWAL_REASON_INPUT_TEXT", "WITHDRAWAL_REASON_INPUT_TEXT", null, null, String.class, "withdrawalReasonInputText", null, false, false, false, "CLOB", 2147483647, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnWithdrawalDatetime = cci("WITHDRAWAL_DATETIME", "WITHDRAWAL_DATETIME", null, null, java.time.LocalDateTime.class, "withdrawalDatetime", null, false, false, false, "TIMESTAMP", 23, 10, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnMemberStatusCode = cci("MEMBER_STATUS_CODE", "MEMBER_STATUS_CODE", null, null, String.class, "memberStatusCode", null, false, false, false, "CHAR", 3, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnMemberStatusName = cci("MEMBER_STATUS_NAME", "MEMBER_STATUS_NAME", null, null, String.class, "memberStatusName", null, false, false, false, "VARCHAR", 50, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnMaxPurchasePrice = cci("MAX_PURCHASE_PRICE", "MAX_PURCHASE_PRICE", null, null, Integer.class, "maxPurchasePrice", null, false, false, false, "INTEGER", 10, 0, null, false, null, null, null, null, null);

    /**
     * MEMBER_ID: {INTEGER(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberId() { return _columnMemberId; }
    /**
     * MEMBER_NAME: {VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberName() { return _columnMemberName; }
    /**
     * WITHDRAWAL_REASON_CODE: {CHAR(3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWithdrawalReasonCode() { return _columnWithdrawalReasonCode; }
    /**
     * WITHDRAWAL_REASON_TEXT: {CLOB(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWithdrawalReasonText() { return _columnWithdrawalReasonText; }
    /**
     * WITHDRAWAL_REASON_INPUT_TEXT: {CLOB(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWithdrawalReasonInputText() { return _columnWithdrawalReasonInputText; }
    /**
     * WITHDRAWAL_DATETIME: {TIMESTAMP(23, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWithdrawalDatetime() { return _columnWithdrawalDatetime; }
    /**
     * MEMBER_STATUS_CODE: {CHAR(3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberStatusCode() { return _columnMemberStatusCode; }
    /**
     * MEMBER_STATUS_NAME: {VARCHAR(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberStatusName() { return _columnMemberStatusName; }
    /**
     * MAX_PURCHASE_PRICE: {INTEGER(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMaxPurchasePrice() { return _columnMaxPurchasePrice; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMemberId());
        ls.add(columnMemberName());
        ls.add(columnWithdrawalReasonCode());
        ls.add(columnWithdrawalReasonText());
        ls.add(columnWithdrawalReasonInputText());
        ls.add(columnWithdrawalDatetime());
        ls.add(columnMemberStatusCode());
        ls.add(columnMemberStatusName());
        ls.add(columnMaxPurchasePrice());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() {
        throw new UnsupportedOperationException("The table does not have primary key: " + getTableDbName());
    }
    public boolean hasPrimaryKey() { return false; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.springboot.dbflute.exentity.SummaryWithdrawal"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.springboot.dbflute.cbean.SummaryWithdrawalCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.springboot.dbflute.exbhv.SummaryWithdrawalBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SummaryWithdrawal> getEntityType() { return SummaryWithdrawal.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SummaryWithdrawal newEntity() { return new SummaryWithdrawal(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SummaryWithdrawal)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SummaryWithdrawal)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
