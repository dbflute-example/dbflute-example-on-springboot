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
 * The DB meta of member. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MemberDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MemberDbm _instance = new MemberDbm();
    private MemberDbm() {}
    public static MemberDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((Member)et).getMemberId(), (et, vl) -> ((Member)et).setMemberId(cti(vl)), "memberId");
        setupEpg(_epgMap, et -> ((Member)et).getMemberName(), (et, vl) -> ((Member)et).setMemberName((String)vl), "memberName");
        setupEpg(_epgMap, et -> ((Member)et).getMemberAccount(), (et, vl) -> ((Member)et).setMemberAccount((String)vl), "memberAccount");
        setupEpg(_epgMap, et -> ((Member)et).getMemberStatusCode(), (et, vl) -> {
            CDef.MemberStatus cls = (CDef.MemberStatus)gcls(et, columnMemberStatusCode(), vl);
            if (cls != null) {
                ((Member)et).setMemberStatusCodeAsMemberStatus(cls);
            } else {
                ((Member)et).mynativeMappingMemberStatusCode((String)vl);
            }
        }, "memberStatusCode");
        setupEpg(_epgMap, et -> ((Member)et).getFormalizedDatetime(), (et, vl) -> ((Member)et).setFormalizedDatetime(ctldt(vl)), "formalizedDatetime");
        setupEpg(_epgMap, et -> ((Member)et).getBirthdate(), (et, vl) -> ((Member)et).setBirthdate(ctld(vl)), "birthdate");
        setupEpg(_epgMap, et -> ((Member)et).getRegisterDatetime(), (et, vl) -> ((Member)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((Member)et).getRegisterUser(), (et, vl) -> ((Member)et).setRegisterUser((String)vl), "registerUser");
        setupEpg(_epgMap, et -> ((Member)et).getUpdateDatetime(), (et, vl) -> ((Member)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((Member)et).getUpdateUser(), (et, vl) -> ((Member)et).setUpdateUser((String)vl), "updateUser");
        setupEpg(_epgMap, et -> ((Member)et).getVersionNo(), (et, vl) -> ((Member)et).setVersionNo(ctl(vl)), "versionNo");
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
        setupEfpg(_efpgMap, et -> ((Member)et).getMemberStatus(), (et, vl) -> ((Member)et).setMemberStatus((OptionalEntity<MemberStatus>)vl), "memberStatus");
        setupEfpg(_efpgMap, et -> ((Member)et).getMemberAddressAsValid(), (et, vl) -> ((Member)et).setMemberAddressAsValid((OptionalEntity<MemberAddress>)vl), "memberAddressAsValid");
        setupEfpg(_efpgMap, et -> ((Member)et).getMemberLoginAsLatest(), (et, vl) -> ((Member)et).setMemberLoginAsLatest((OptionalEntity<MemberLogin>)vl), "memberLoginAsLatest");
        setupEfpg(_efpgMap, et -> ((Member)et).getMemberSecurityAsOne(), (et, vl) -> ((Member)et).setMemberSecurityAsOne((OptionalEntity<MemberSecurity>)vl), "memberSecurityAsOne");
        setupEfpg(_efpgMap, et -> ((Member)et).getMemberServiceAsOne(), (et, vl) -> ((Member)et).setMemberServiceAsOne((OptionalEntity<MemberService>)vl), "memberServiceAsOne");
        setupEfpg(_efpgMap, et -> ((Member)et).getMemberWithdrawalAsOne(), (et, vl) -> ((Member)et).setMemberWithdrawalAsOne((OptionalEntity<MemberWithdrawal>)vl), "memberWithdrawalAsOne");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "member";
    protected final String _tableDispName = "MEMBER";
    protected final String _tablePropertyName = "member";
    protected final TableSqlName _tableSqlName = new TableSqlName("MEMBER", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "会員";
    public String getTableAlias() { return _tableAlias; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMemberId = cci("MEMBER_ID", "MEMBER_ID", null, "会員ID", Integer.class, "memberId", null, true, true, true, "INT", 10, 0, null, null, false, null, null, "memberAddressAsValid,memberLoginAsLatest,memberSecurityAsOne,memberServiceAsOne,memberWithdrawalAsOne", "memberAddressList,memberFollowingByMyMemberIdList,memberFollowingByYourMemberIdList,memberLoginList,purchaseList", null, false);
    protected final ColumnInfo _columnMemberName = cci("MEMBER_NAME", "MEMBER_NAME", null, "会員名称", String.class, "memberName", null, false, false, true, "VARCHAR", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMemberAccount = cci("MEMBER_ACCOUNT", "MEMBER_ACCOUNT", null, "会員アカウント", String.class, "memberAccount", null, false, false, true, "VARCHAR", 50, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMemberStatusCode = cci("MEMBER_STATUS_CODE", "MEMBER_STATUS_CODE", null, "会員ステータスコード", String.class, "memberStatusCode", null, false, false, true, "CHAR", 3, 0, null, null, false, null, null, "memberStatus", null, CDef.DefMeta.MemberStatus, false);
    protected final ColumnInfo _columnFormalizedDatetime = cci("FORMALIZED_DATETIME", "FORMALIZED_DATETIME", null, "正式会員日時", java.time.LocalDateTime.class, "formalizedDatetime", null, false, false, false, "DATETIME", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBirthdate = cci("BIRTHDATE", "BIRTHDATE", null, "生年月日", java.time.LocalDate.class, "birthdate", null, false, false, false, "DATE", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, "登録日時", java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterUser = cci("REGISTER_USER", "REGISTER_USER", null, "登録ユーザー", String.class, "registerUser", null, false, false, true, "VARCHAR", 200, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, "更新日時", java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateUser = cci("UPDATE_USER", "UPDATE_USER", null, "更新ユーザー", String.class, "updateUser", null, false, false, true, "VARCHAR", 200, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, "バージョン番号", Long.class, "versionNo", null, false, false, true, "BIGINT", 19, 0, null, null, false, OptimisticLockType.VERSION_NO, null, null, null, null, false);

    /**
     * (会員ID)MEMBER_ID: {PK, ID, NotNull, INT(10), FK to MEMBER_ADDRESS}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberId() { return _columnMemberId; }
    /**
     * (会員名称)MEMBER_NAME: {IX, NotNull, VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberName() { return _columnMemberName; }
    /**
     * (会員アカウント)MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberAccount() { return _columnMemberAccount; }
    /**
     * (会員ステータスコード)MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to member_status, classification=MemberStatus}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberStatusCode() { return _columnMemberStatusCode; }
    /**
     * (正式会員日時)FORMALIZED_DATETIME: {IX, DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFormalizedDatetime() { return _columnFormalizedDatetime; }
    /**
     * (生年月日)BIRTHDATE: {DATE(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBirthdate() { return _columnBirthdate; }
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
        ls.add(columnMemberName());
        ls.add(columnMemberAccount());
        ls.add(columnMemberStatusCode());
        ls.add(columnFormalizedDatetime());
        ls.add(columnBirthdate());
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

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() { return hpcui(columnMemberAccount()); }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * (会員ステータス)MEMBER_STATUS by my MEMBER_STATUS_CODE, named 'memberStatus'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMemberStatus() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberStatusCode(), MemberStatusDbm.getInstance().columnMemberStatusCode());
        return cfi("FK_MEMBER_MEMBER_STATUS", "memberStatus", this, MemberStatusDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "memberList", false);
    }
    /**
     * (会員住所情報)MEMBER_ADDRESS by my MEMBER_ID, named 'memberAddressAsValid'. <br>
     * Member's address at the target date.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMemberAddressAsValid() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberAddressDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_MEMBER_ADDRESS_VALID", "memberAddressAsValid", this, MemberAddressDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, true, true, false, true, "$$foreignAlias$$.VALID_BEGIN_DATE <= /*$$locationBase$$.parameterMapMemberAddressAsValid.targetDate*/null\n     and $$foreignAlias$$.VALID_END_DATE >= /*$$locationBase$$.parameterMapMemberAddressAsValid.targetDate*/null", newArrayList("targetDate"), false, null, false);
    }
    /**
     * (会員ログイン)MEMBER_LOGIN by my MEMBER_ID, named 'memberLoginAsLatest'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMemberLoginAsLatest() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberLoginDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_MEMBER_LOGIN_LATEST", "memberLoginAsLatest", this, MemberLoginDbm.getInstance(), mp, 2, org.dbflute.optional.OptionalEntity.class, true, true, false, true, "$$foreignAlias$$.LOGIN_DATETIME = ($$sqbegin$$\nselect max(login.LOGIN_DATETIME)\n  from MEMBER_LOGIN login\n where login.MEMBER_ID = $$foreignAlias$$.MEMBER_ID\n)$$sqend$$", null, false, null, false);
    }
    /**
     * (会員セキュリティ)member_security by MEMBER_ID, named 'memberSecurityAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignMemberSecurityAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberSecurityDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_SECURITY_MEMBER", "memberSecurityAsOne", this, MemberSecurityDbm.getInstance(), mp, 3, org.dbflute.optional.OptionalEntity.class, true, false, true, false, null, null, false, "member", false);
    }
    /**
     * (会員サービス)member_service by MEMBER_ID, named 'memberServiceAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignMemberServiceAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberServiceDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_SERVICE_MEMBER", "memberServiceAsOne", this, MemberServiceDbm.getInstance(), mp, 4, org.dbflute.optional.OptionalEntity.class, true, false, true, false, null, null, false, "member", false);
    }
    /**
     * (会員退会情報)member_withdrawal by MEMBER_ID, named 'memberWithdrawalAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignMemberWithdrawalAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberWithdrawalDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_WITHDRAWAL_MEMBER", "memberWithdrawalAsOne", this, MemberWithdrawalDbm.getInstance(), mp, 5, org.dbflute.optional.OptionalEntity.class, true, false, true, false, null, null, false, "member", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * (会員住所情報)MEMBER_ADDRESS by MEMBER_ID, named 'memberAddressList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMemberAddressList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberAddressDbm.getInstance().columnMemberId());
        return cri("FK_MEMBER_ADDRESS_MEMBER", "memberAddressList", this, MemberAddressDbm.getInstance(), mp, false, "member");
    }
    /**
     * (会員フォローイング)MEMBER_FOLLOWING by MY_MEMBER_ID, named 'memberFollowingByMyMemberIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMemberFollowingByMyMemberIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberFollowingDbm.getInstance().columnMyMemberId());
        return cri("FK_MEMBER_FOLLOWING_MY_MEMBER_ID", "memberFollowingByMyMemberIdList", this, MemberFollowingDbm.getInstance(), mp, false, "memberByMyMemberId");
    }
    /**
     * (会員フォローイング)MEMBER_FOLLOWING by YOUR_MEMBER_ID, named 'memberFollowingByYourMemberIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMemberFollowingByYourMemberIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberFollowingDbm.getInstance().columnYourMemberId());
        return cri("FK_MEMBER_FOLLOWING_YOUR_MEMBER_ID", "memberFollowingByYourMemberIdList", this, MemberFollowingDbm.getInstance(), mp, false, "memberByYourMemberId");
    }
    /**
     * (会員ログイン)MEMBER_LOGIN by MEMBER_ID, named 'memberLoginList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMemberLoginList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberLoginDbm.getInstance().columnMemberId());
        return cri("FK_MEMBER_LOGIN_MEMBER", "memberLoginList", this, MemberLoginDbm.getInstance(), mp, false, "member");
    }
    /**
     * (購入)PURCHASE by MEMBER_ID, named 'purchaseList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerPurchaseList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), PurchaseDbm.getInstance().columnMemberId());
        return cri("FK_PURCHASE_MEMBER", "purchaseList", this, PurchaseDbm.getInstance(), mp, false, "member");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }
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
    public String getEntityTypeName() { return "org.docksidestage.dbflute.exentity.Member"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.dbflute.cbean.MemberCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.dbflute.exbhv.MemberBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Member> getEntityType() { return Member.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Member newEntity() { return new Member(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Member)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Member)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
