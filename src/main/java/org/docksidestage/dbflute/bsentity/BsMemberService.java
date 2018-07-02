/*
 * Copyright 2014-2018 the original author or authors.
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
package org.docksidestage.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.optional.OptionalEntity;
import org.docksidestage.dbflute.allcommon.EntityDefinedCommonColumn;
import org.docksidestage.dbflute.allcommon.DBMetaInstanceHandler;
import org.docksidestage.dbflute.allcommon.CDef;
import org.docksidestage.dbflute.exentity.*;

/**
 * The entity of (会員サービス)MEMBER_SERVICE as TABLE. <br>
 * 会員のサービス情報（ポイントサービスなど）。<br>
 * テストケースのために、あえて統一性を崩してユニーク制約経由の one-to-one を表現している。
 * <pre>
 * [primary-key]
 *     MEMBER_SERVICE_ID
 *
 * [column]
 *     MEMBER_SERVICE_ID, MEMBER_ID, SERVICE_POINT_COUNT, SERVICE_RANK_CODE, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MEMBER_SERVICE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     MEMBER, SERVICE_RANK
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     member, serviceRank
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer memberServiceId = entity.getMemberServiceId();
 * Integer memberId = entity.getMemberId();
 * Integer servicePointCount = entity.getServicePointCount();
 * String serviceRankCode = entity.getServiceRankCode();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerUser = entity.getRegisterUser();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateUser = entity.getUpdateUser();
 * Long versionNo = entity.getVersionNo();
 * entity.setMemberServiceId(memberServiceId);
 * entity.setMemberId(memberId);
 * entity.setServicePointCount(servicePointCount);
 * entity.setServiceRankCode(serviceRankCode);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterUser(registerUser);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateUser(updateUser);
 * entity.setVersionNo(versionNo);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMemberService extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** (会員サービスID)MEMBER_SERVICE_ID: {PK, ID, NotNull, INT(10)} */
    protected Integer _memberServiceId;

    /** (会員ID)MEMBER_ID: {UQ, NotNull, INT(10), FK to member} */
    protected Integer _memberId;

    /** (サービスポイント数)SERVICE_POINT_COUNT: {IX, NotNull, INT(10)} */
    protected Integer _servicePointCount;

    /** (サービスランクコード)SERVICE_RANK_CODE: {IX, NotNull, CHAR(3), FK to service_rank, classification=ServiceRank} */
    protected String _serviceRankCode;

    /** (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)} */
    protected java.time.LocalDateTime _registerDatetime;

    /** (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)} */
    protected String _registerUser;

    /** (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)} */
    protected java.time.LocalDateTime _updateDatetime;

    /** (更新ユーザー)UPDATE_USER: {NotNull, VARCHAR(200)} */
    protected String _updateUser;

    /** (バージョン番号)VERSION_NO: {NotNull, BIGINT(19)} */
    protected Long _versionNo;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "member_service";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_memberServiceId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param memberId (会員ID): UQ, NotNull, INT(10), FK to member. (NotNull)
     */
    public void uniqueBy(Integer memberId) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("memberId");
        setMemberId(memberId);
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of serviceRankCode as the classification of ServiceRank. <br>
     * (サービスランクコード)SERVICE_RANK_CODE: {IX, NotNull, CHAR(3), FK to service_rank, classification=ServiceRank} <br>
     * 会員が受けられるサービスのランクを示す
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ServiceRank getServiceRankCodeAsServiceRank() {
        return CDef.ServiceRank.codeOf(getServiceRankCode());
    }

    /**
     * Set the value of serviceRankCode as the classification of ServiceRank. <br>
     * (サービスランクコード)SERVICE_RANK_CODE: {IX, NotNull, CHAR(3), FK to service_rank, classification=ServiceRank} <br>
     * 会員が受けられるサービスのランクを示す
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setServiceRankCodeAsServiceRank(CDef.ServiceRank cdef) {
        setServiceRankCode(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of serviceRankCode as Platinum (PLT). <br>
     * PLATINUM: platinum rank
     */
    public void setServiceRankCode_Platinum() {
        setServiceRankCodeAsServiceRank(CDef.ServiceRank.Platinum);
    }

    /**
     * Set the value of serviceRankCode as Gold (GLD). <br>
     * GOLD: gold rank
     */
    public void setServiceRankCode_Gold() {
        setServiceRankCodeAsServiceRank(CDef.ServiceRank.Gold);
    }

    /**
     * Set the value of serviceRankCode as Silver (SIL). <br>
     * SILVER: silver rank
     */
    public void setServiceRankCode_Silver() {
        setServiceRankCodeAsServiceRank(CDef.ServiceRank.Silver);
    }

    /**
     * Set the value of serviceRankCode as Bronze (BRZ). <br>
     * BRONZE: bronze rank
     */
    public void setServiceRankCode_Bronze() {
        setServiceRankCodeAsServiceRank(CDef.ServiceRank.Bronze);
    }

    /**
     * Set the value of serviceRankCode as Plastic (PLS). <br>
     * PLASTIC: plastic rank
     */
    public void setServiceRankCode_Plastic() {
        setServiceRankCodeAsServiceRank(CDef.ServiceRank.Plastic);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of serviceRankCode Platinum? <br>
     * PLATINUM: platinum rank
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isServiceRankCodePlatinum() {
        CDef.ServiceRank cdef = getServiceRankCodeAsServiceRank();
        return cdef != null ? cdef.equals(CDef.ServiceRank.Platinum) : false;
    }

    /**
     * Is the value of serviceRankCode Gold? <br>
     * GOLD: gold rank
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isServiceRankCodeGold() {
        CDef.ServiceRank cdef = getServiceRankCodeAsServiceRank();
        return cdef != null ? cdef.equals(CDef.ServiceRank.Gold) : false;
    }

    /**
     * Is the value of serviceRankCode Silver? <br>
     * SILVER: silver rank
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isServiceRankCodeSilver() {
        CDef.ServiceRank cdef = getServiceRankCodeAsServiceRank();
        return cdef != null ? cdef.equals(CDef.ServiceRank.Silver) : false;
    }

    /**
     * Is the value of serviceRankCode Bronze? <br>
     * BRONZE: bronze rank
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isServiceRankCodeBronze() {
        CDef.ServiceRank cdef = getServiceRankCodeAsServiceRank();
        return cdef != null ? cdef.equals(CDef.ServiceRank.Bronze) : false;
    }

    /**
     * Is the value of serviceRankCode Plastic? <br>
     * PLASTIC: plastic rank
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isServiceRankCodePlastic() {
        CDef.ServiceRank cdef = getServiceRankCodeAsServiceRank();
        return cdef != null ? cdef.equals(CDef.ServiceRank.Plastic) : false;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** (会員)MEMBER by my MEMBER_ID, named 'member'. */
    protected OptionalEntity<Member> _member;

    /**
     * [get] (会員)MEMBER by my MEMBER_ID, named 'member'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'member'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<Member> getMember() {
        if (_member == null) { _member = OptionalEntity.relationEmpty(this, "member"); }
        return _member;
    }

    /**
     * [set] (会員)MEMBER by my MEMBER_ID, named 'member'.
     * @param member The entity of foreign property 'member'. (NullAllowed)
     */
    public void setMember(OptionalEntity<Member> member) {
        _member = member;
    }

    /** (サービスランク)SERVICE_RANK by my SERVICE_RANK_CODE, named 'serviceRank'. */
    protected OptionalEntity<ServiceRank> _serviceRank;

    /**
     * [get] (サービスランク)SERVICE_RANK by my SERVICE_RANK_CODE, named 'serviceRank'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'serviceRank'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<ServiceRank> getServiceRank() {
        if (_serviceRank == null) { _serviceRank = OptionalEntity.relationEmpty(this, "serviceRank"); }
        return _serviceRank;
    }

    /**
     * [set] (サービスランク)SERVICE_RANK by my SERVICE_RANK_CODE, named 'serviceRank'.
     * @param serviceRank The entity of foreign property 'serviceRank'. (NullAllowed)
     */
    public void setServiceRank(OptionalEntity<ServiceRank> serviceRank) {
        _serviceRank = serviceRank;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsMemberService) {
            BsMemberService other = (BsMemberService)obj;
            if (!xSV(_memberServiceId, other._memberServiceId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _memberServiceId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_member != null && _member.isPresent())
        { sb.append(li).append(xbRDS(_member, "member")); }
        if (_serviceRank != null && _serviceRank.isPresent())
        { sb.append(li).append(xbRDS(_serviceRank, "serviceRank")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_memberServiceId));
        sb.append(dm).append(xfND(_memberId));
        sb.append(dm).append(xfND(_servicePointCount));
        sb.append(dm).append(xfND(_serviceRankCode));
        sb.append(dm).append(xfND(_registerDatetime));
        sb.append(dm).append(xfND(_registerUser));
        sb.append(dm).append(xfND(_updateDatetime));
        sb.append(dm).append(xfND(_updateUser));
        sb.append(dm).append(xfND(_versionNo));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_member != null && _member.isPresent())
        { sb.append(dm).append("member"); }
        if (_serviceRank != null && _serviceRank.isPresent())
        { sb.append(dm).append("serviceRank"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public MemberService clone() {
        return (MemberService)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (会員サービスID)MEMBER_SERVICE_ID: {PK, ID, NotNull, INT(10)} <br>
     * 独立した主キーとなるが、実質的に会員IDとは one-to-one である。
     * @return The value of the column 'MEMBER_SERVICE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMemberServiceId() {
        checkSpecifiedProperty("memberServiceId");
        return _memberServiceId;
    }

    /**
     * [set] (会員サービスID)MEMBER_SERVICE_ID: {PK, ID, NotNull, INT(10)} <br>
     * 独立した主キーとなるが、実質的に会員IDとは one-to-one である。
     * @param memberServiceId The value of the column 'MEMBER_SERVICE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMemberServiceId(Integer memberServiceId) {
        registerModifiedProperty("memberServiceId");
        _memberServiceId = memberServiceId;
    }

    /**
     * [get] (会員ID)MEMBER_ID: {UQ, NotNull, INT(10), FK to member} <br>
     * 会員を参照するID。ユニークなので、会員とは one-to-one の関係に。
     * @return The value of the column 'MEMBER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMemberId() {
        checkSpecifiedProperty("memberId");
        return _memberId;
    }

    /**
     * [set] (会員ID)MEMBER_ID: {UQ, NotNull, INT(10), FK to member} <br>
     * 会員を参照するID。ユニークなので、会員とは one-to-one の関係に。
     * @param memberId The value of the column 'MEMBER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMemberId(Integer memberId) {
        registerModifiedProperty("memberId");
        _memberId = memberId;
    }

    /**
     * [get] (サービスポイント数)SERVICE_POINT_COUNT: {IX, NotNull, INT(10)} <br>
     * 購入したら増えて使ったら減る。
     * @return The value of the column 'SERVICE_POINT_COUNT'. (basically NotNull if selected: for the constraint)
     */
    public Integer getServicePointCount() {
        checkSpecifiedProperty("servicePointCount");
        return _servicePointCount;
    }

    /**
     * [set] (サービスポイント数)SERVICE_POINT_COUNT: {IX, NotNull, INT(10)} <br>
     * 購入したら増えて使ったら減る。
     * @param servicePointCount The value of the column 'SERVICE_POINT_COUNT'. (basically NotNull if update: for the constraint)
     */
    public void setServicePointCount(Integer servicePointCount) {
        registerModifiedProperty("servicePointCount");
        _servicePointCount = servicePointCount;
    }

    /**
     * [get] (サービスランクコード)SERVICE_RANK_CODE: {IX, NotNull, CHAR(3), FK to service_rank, classification=ServiceRank} <br>
     * どんなランクがあるのかドキドキですね。
     * @return The value of the column 'SERVICE_RANK_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getServiceRankCode() {
        checkSpecifiedProperty("serviceRankCode");
        return convertEmptyToNull(_serviceRankCode);
    }

    /**
     * [set] (サービスランクコード)SERVICE_RANK_CODE: {IX, NotNull, CHAR(3), FK to service_rank, classification=ServiceRank} <br>
     * どんなランクがあるのかドキドキですね。
     * @param serviceRankCode The value of the column 'SERVICE_RANK_CODE'. (basically NotNull if update: for the constraint)
     */
    protected void setServiceRankCode(String serviceRankCode) {
        checkClassificationCode("SERVICE_RANK_CODE", CDef.DefMeta.ServiceRank, serviceRankCode);
        registerModifiedProperty("serviceRankCode");
        _serviceRankCode = serviceRankCode;
    }

    /**
     * [get] (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)} <br>
     * レコードが登録された日時
     * @return The value of the column 'REGISTER_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getRegisterDatetime() {
        checkSpecifiedProperty("registerDatetime");
        return _registerDatetime;
    }

    /**
     * [set] (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)} <br>
     * レコードが登録された日時
     * @param registerDatetime The value of the column 'REGISTER_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterDatetime(java.time.LocalDateTime registerDatetime) {
        registerModifiedProperty("registerDatetime");
        _registerDatetime = registerDatetime;
    }

    /**
     * [get] (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)} <br>
     * レコードを登録したユーザー
     * @return The value of the column 'REGISTER_USER'. (basically NotNull if selected: for the constraint)
     */
    public String getRegisterUser() {
        checkSpecifiedProperty("registerUser");
        return convertEmptyToNull(_registerUser);
    }

    /**
     * [set] (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)} <br>
     * レコードを登録したユーザー
     * @param registerUser The value of the column 'REGISTER_USER'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterUser(String registerUser) {
        registerModifiedProperty("registerUser");
        _registerUser = registerUser;
    }

    /**
     * [get] (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)} <br>
     * レコードが(最後に)更新された日時
     * @return The value of the column 'UPDATE_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getUpdateDatetime() {
        checkSpecifiedProperty("updateDatetime");
        return _updateDatetime;
    }

    /**
     * [set] (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)} <br>
     * レコードが(最後に)更新された日時
     * @param updateDatetime The value of the column 'UPDATE_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateDatetime(java.time.LocalDateTime updateDatetime) {
        registerModifiedProperty("updateDatetime");
        _updateDatetime = updateDatetime;
    }

    /**
     * [get] (更新ユーザー)UPDATE_USER: {NotNull, VARCHAR(200)} <br>
     * レコードを(最後に)更新したユーザー
     * @return The value of the column 'UPDATE_USER'. (basically NotNull if selected: for the constraint)
     */
    public String getUpdateUser() {
        checkSpecifiedProperty("updateUser");
        return convertEmptyToNull(_updateUser);
    }

    /**
     * [set] (更新ユーザー)UPDATE_USER: {NotNull, VARCHAR(200)} <br>
     * レコードを(最後に)更新したユーザー
     * @param updateUser The value of the column 'UPDATE_USER'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateUser(String updateUser) {
        registerModifiedProperty("updateUser");
        _updateUser = updateUser;
    }

    /**
     * [get] (バージョン番号)VERSION_NO: {NotNull, BIGINT(19)} <br>
     * 排他制御用、更新されるごとにインクリメントされる
     * @return The value of the column 'VERSION_NO'. (basically NotNull if selected: for the constraint)
     */
    public Long getVersionNo() {
        checkSpecifiedProperty("versionNo");
        return _versionNo;
    }

    /**
     * [set] (バージョン番号)VERSION_NO: {NotNull, BIGINT(19)} <br>
     * 排他制御用、更新されるごとにインクリメントされる
     * @param versionNo The value of the column 'VERSION_NO'. (basically NotNull if update: for the constraint)
     */
    public void setVersionNo(Long versionNo) {
        registerModifiedProperty("versionNo");
        _versionNo = versionNo;
    }

    /**
     * For framework so basically DON'T use this method.
     * @param serviceRankCode The value of the column 'SERVICE_RANK_CODE'. (basically NotNull if update: for the constraint)
     */
    public void mynativeMappingServiceRankCode(String serviceRankCode) {
        setServiceRankCode(serviceRankCode);
    }
}
