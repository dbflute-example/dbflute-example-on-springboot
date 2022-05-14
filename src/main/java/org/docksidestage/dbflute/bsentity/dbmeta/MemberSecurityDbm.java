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
 * The DB meta of member_security. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MemberSecurityDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MemberSecurityDbm _instance = new MemberSecurityDbm();
    private MemberSecurityDbm() {}
    public static MemberSecurityDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MemberSecurity)et).getMemberId(), (et, vl) -> ((MemberSecurity)et).setMemberId(cti(vl)), "memberId");
        setupEpg(_epgMap, et -> ((MemberSecurity)et).getLoginPassword(), (et, vl) -> ((MemberSecurity)et).setLoginPassword((String)vl), "loginPassword");
        setupEpg(_epgMap, et -> ((MemberSecurity)et).getReminderQuestion(), (et, vl) -> ((MemberSecurity)et).setReminderQuestion((String)vl), "reminderQuestion");
        setupEpg(_epgMap, et -> ((MemberSecurity)et).getReminderAnswer(), (et, vl) -> ((MemberSecurity)et).setReminderAnswer((String)vl), "reminderAnswer");
        setupEpg(_epgMap, et -> ((MemberSecurity)et).getReminderUseCount(), (et, vl) -> ((MemberSecurity)et).setReminderUseCount(cti(vl)), "reminderUseCount");
        setupEpg(_epgMap, et -> ((MemberSecurity)et).getRegisterDatetime(), (et, vl) -> ((MemberSecurity)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((MemberSecurity)et).getRegisterUser(), (et, vl) -> ((MemberSecurity)et).setRegisterUser((String)vl), "registerUser");
        setupEpg(_epgMap, et -> ((MemberSecurity)et).getUpdateDatetime(), (et, vl) -> ((MemberSecurity)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((MemberSecurity)et).getUpdateUser(), (et, vl) -> ((MemberSecurity)et).setUpdateUser((String)vl), "updateUser");
        setupEpg(_epgMap, et -> ((MemberSecurity)et).getVersionNo(), (et, vl) -> ((MemberSecurity)et).setVersionNo(ctl(vl)), "versionNo");
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
        setupEfpg(_efpgMap, et -> ((MemberSecurity)et).getMember(), (et, vl) -> ((MemberSecurity)et).setMember((OptionalEntity<Member>)vl), "member");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "member_security";
    protected final String _tableDispName = "MEMBER_SECURITY";
    protected final String _tablePropertyName = "memberSecurity";
    protected final TableSqlName _tableSqlName = new TableSqlName("MEMBER_SECURITY", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "会員セキュリティ";
    public String getTableAlias() { return _tableAlias; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMemberId = cci("MEMBER_ID", "MEMBER_ID", null, "会員ID", Integer.class, "memberId", null, true, false, true, "INT", 10, 0, null, null, false, null, null, "member", null, null, false);
    protected final ColumnInfo _columnLoginPassword = cci("LOGIN_PASSWORD", "LOGIN_PASSWORD", null, "ログインパスワード", String.class, "loginPassword", null, false, false, true, "VARCHAR", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReminderQuestion = cci("REMINDER_QUESTION", "REMINDER_QUESTION", null, "リマインダ質問", String.class, "reminderQuestion", null, false, false, true, "VARCHAR", 50, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReminderAnswer = cci("REMINDER_ANSWER", "REMINDER_ANSWER", null, "リマインダ回答", String.class, "reminderAnswer", null, false, false, true, "VARCHAR", 50, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReminderUseCount = cci("REMINDER_USE_COUNT", "REMINDER_USE_COUNT", null, "リマインダ利用回数", Integer.class, "reminderUseCount", null, false, false, true, "INT", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, "登録日時", java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterUser = cci("REGISTER_USER", "REGISTER_USER", null, "登録ユーザー", String.class, "registerUser", null, false, false, true, "VARCHAR", 200, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, "更新日時", java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateUser = cci("UPDATE_USER", "UPDATE_USER", null, "更新ユーザー", String.class, "updateUser", null, false, false, true, "VARCHAR", 200, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, "バージョン番号", Long.class, "versionNo", null, false, false, true, "BIGINT", 19, 0, null, null, false, OptimisticLockType.VERSION_NO, null, null, null, null, false);

    /**
     * (会員ID)MEMBER_ID: {PK, NotNull, INT(10), FK to member}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberId() { return _columnMemberId; }
    /**
     * (ログインパスワード)LOGIN_PASSWORD: {NotNull, VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLoginPassword() { return _columnLoginPassword; }
    /**
     * (リマインダ質問)REMINDER_QUESTION: {NotNull, VARCHAR(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReminderQuestion() { return _columnReminderQuestion; }
    /**
     * (リマインダ回答)REMINDER_ANSWER: {NotNull, VARCHAR(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReminderAnswer() { return _columnReminderAnswer; }
    /**
     * (リマインダ利用回数)REMINDER_USE_COUNT: {NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReminderUseCount() { return _columnReminderUseCount; }
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
    /**
     * (バージョン番号)VERSION_NO: {NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMemberId());
        ls.add(columnLoginPassword());
        ls.add(columnReminderQuestion());
        ls.add(columnReminderAnswer());
        ls.add(columnReminderUseCount());
        ls.add(columnRegisterDatetime());
        ls.add(columnRegisterUser());
        ls.add(columnUpdateDatetime());
        ls.add(columnUpdateUser());
        ls.add(columnVersionNo());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnMemberId()); }
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
     * (会員)MEMBER by my MEMBER_ID, named 'member'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMember() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_SECURITY_MEMBER", "member", this, MemberDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, true, false, false, false, null, null, false, "memberSecurityAsOne", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasVersionNo() { return true; }
    public ColumnInfo getVersionNoColumnInfo() { return _columnVersionNo; }
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
    public String getEntityTypeName() { return "org.docksidestage.dbflute.exentity.MemberSecurity"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.dbflute.cbean.MemberSecurityCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.dbflute.exbhv.MemberSecurityBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MemberSecurity> getEntityType() { return MemberSecurity.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MemberSecurity newEntity() { return new MemberSecurity(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MemberSecurity)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MemberSecurity)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
