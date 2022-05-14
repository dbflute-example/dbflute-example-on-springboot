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
package org.docksidestage.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.optional.OptionalEntity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import org.docksidestage.dbflute.allcommon.*;
import org.docksidestage.dbflute.exentity.*;

/**
 * The DB meta of purchase_payment. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class PurchasePaymentDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final PurchasePaymentDbm _instance = new PurchasePaymentDbm();
    private PurchasePaymentDbm() {}
    public static PurchasePaymentDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return DBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return DBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return DBCurrent.getInstance().generationGapBasePrefix(); }
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
        setupEpg(_epgMap, et -> ((PurchasePayment)et).getPurchasePaymentId(), (et, vl) -> ((PurchasePayment)et).setPurchasePaymentId(ctl(vl)), "purchasePaymentId");
        setupEpg(_epgMap, et -> ((PurchasePayment)et).getPurchaseId(), (et, vl) -> ((PurchasePayment)et).setPurchaseId(ctl(vl)), "purchaseId");
        setupEpg(_epgMap, et -> ((PurchasePayment)et).getPaymentAmount(), (et, vl) -> ((PurchasePayment)et).setPaymentAmount(ctb(vl)), "paymentAmount");
        setupEpg(_epgMap, et -> ((PurchasePayment)et).getPaymentDatetime(), (et, vl) -> ((PurchasePayment)et).setPaymentDatetime(ctldt(vl)), "paymentDatetime");
        setupEpg(_epgMap, et -> ((PurchasePayment)et).getPaymentMethodCode(), (et, vl) -> ((PurchasePayment)et).setPaymentMethodCode((String)vl), "paymentMethodCode");
        setupEpg(_epgMap, et -> ((PurchasePayment)et).getRegisterDatetime(), (et, vl) -> ((PurchasePayment)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((PurchasePayment)et).getRegisterUser(), (et, vl) -> ((PurchasePayment)et).setRegisterUser((String)vl), "registerUser");
        setupEpg(_epgMap, et -> ((PurchasePayment)et).getUpdateDatetime(), (et, vl) -> ((PurchasePayment)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((PurchasePayment)et).getUpdateUser(), (et, vl) -> ((PurchasePayment)et).setUpdateUser((String)vl), "updateUser");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    @SuppressWarnings("unchecked")
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((PurchasePayment)et).getPurchase(), (et, vl) -> ((PurchasePayment)et).setPurchase((OptionalEntity<Purchase>)vl), "purchase");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "purchase_payment";
    protected final String _tableDispName = "PURCHASE_PAYMENT";
    protected final String _tablePropertyName = "purchasePayment";
    protected final TableSqlName _tableSqlName = new TableSqlName("PURCHASE_PAYMENT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "購入支払";
    public String getTableAlias() { return _tableAlias; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnPurchasePaymentId = cci("PURCHASE_PAYMENT_ID", "PURCHASE_PAYMENT_ID", null, "購入支払ID", Long.class, "purchasePaymentId", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPurchaseId = cci("PURCHASE_ID", "PURCHASE_ID", null, "購入ID", Long.class, "purchaseId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, "purchase", null, null, false);
    protected final ColumnInfo _columnPaymentAmount = cci("PAYMENT_AMOUNT", "PAYMENT_AMOUNT", null, "支払金額", java.math.BigDecimal.class, "paymentAmount", null, false, false, true, "DECIMAL", 10, 2, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPaymentDatetime = cci("PAYMENT_DATETIME", "PAYMENT_DATETIME", null, "支払日時", java.time.LocalDateTime.class, "paymentDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPaymentMethodCode = cci("PAYMENT_METHOD_CODE", "PAYMENT_METHOD_CODE", null, "支払方法コード", String.class, "paymentMethodCode", null, false, false, true, "CHAR", 3, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, "登録日時", java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterUser = cci("REGISTER_USER", "REGISTER_USER", null, "登録ユーザー", String.class, "registerUser", null, false, false, true, "VARCHAR", 200, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, "更新日時", java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateUser = cci("UPDATE_USER", "UPDATE_USER", null, "更新ユーザー", String.class, "updateUser", null, false, false, true, "VARCHAR", 200, 0, null, null, true, null, null, null, null, null, false);

    /**
     * (購入支払ID)PURCHASE_PAYMENT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPurchasePaymentId() { return _columnPurchasePaymentId; }
    /**
     * (購入ID)PURCHASE_ID: {IX, NotNull, BIGINT(19), FK to purchase}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPurchaseId() { return _columnPurchaseId; }
    /**
     * (支払金額)PAYMENT_AMOUNT: {NotNull, DECIMAL(10, 2)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPaymentAmount() { return _columnPaymentAmount; }
    /**
     * (支払日時)PAYMENT_DATETIME: {IX+, NotNull, DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPaymentDatetime() { return _columnPaymentDatetime; }
    /**
     * (支払方法コード)PAYMENT_METHOD_CODE: {NotNull, CHAR(3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPaymentMethodCode() { return _columnPaymentMethodCode; }
    /**
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterDatetime() { return _columnRegisterDatetime; }
    /**
     * (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterUser() { return _columnRegisterUser; }
    /**
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateDatetime() { return _columnUpdateDatetime; }
    /**
     * (更新ユーザー)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateUser() { return _columnUpdateUser; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnPurchasePaymentId());
        ls.add(columnPurchaseId());
        ls.add(columnPaymentAmount());
        ls.add(columnPaymentDatetime());
        ls.add(columnPaymentMethodCode());
        ls.add(columnRegisterDatetime());
        ls.add(columnRegisterUser());
        ls.add(columnUpdateDatetime());
        ls.add(columnUpdateUser());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnPurchasePaymentId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * (購入)PURCHASE by my PURCHASE_ID, named 'purchase'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignPurchase() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPurchaseId(), PurchaseDbm.getInstance().columnPurchaseId());
        return cfi("FK_PURCHASE_PAYMENT_PURCHASE", "purchase", this, PurchaseDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "purchasePaymentList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }
    public boolean hasCommonColumn() { return true; }
    public List<ColumnInfo> getCommonColumnInfoList()
    { return newArrayList(columnRegisterDatetime(), columnRegisterUser(), columnUpdateDatetime(), columnUpdateUser()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeInsertList()
    { return newArrayList(columnRegisterDatetime(), columnRegisterUser(), columnUpdateDatetime(), columnUpdateUser()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeUpdateList()
    { return newArrayList(columnUpdateDatetime(), columnUpdateUser()); }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.dbflute.exentity.PurchasePayment"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.dbflute.cbean.PurchasePaymentCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.dbflute.exbhv.PurchasePaymentBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<PurchasePayment> getEntityType() { return PurchasePayment.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public PurchasePayment newEntity() { return new PurchasePayment(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((PurchasePayment)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((PurchasePayment)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
