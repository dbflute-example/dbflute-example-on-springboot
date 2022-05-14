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
package org.docksidestage.dbflute.cbean.cq.bs;

import java.util.*;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.ordering.*;
import org.dbflute.cbean.scoping.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.dbmeta.DBMetaProvider;
import org.docksidestage.dbflute.allcommon.*;
import org.docksidestage.dbflute.cbean.*;
import org.docksidestage.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of member_service.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMemberServiceCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMemberServiceCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    public String asTableDbName() {
        return "member_service";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (会員サービスID)MEMBER_SERVICE_ID: {PK, ID, NotNull, INT(10)}
     * @param memberServiceId The value of memberServiceId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberServiceId_Equal(Integer memberServiceId) {
        doSetMemberServiceId_Equal(memberServiceId);
    }

    protected void doSetMemberServiceId_Equal(Integer memberServiceId) {
        regMemberServiceId(CK_EQ, memberServiceId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (会員サービスID)MEMBER_SERVICE_ID: {PK, ID, NotNull, INT(10)}
     * @param memberServiceId The value of memberServiceId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberServiceId_NotEqual(Integer memberServiceId) {
        doSetMemberServiceId_NotEqual(memberServiceId);
    }

    protected void doSetMemberServiceId_NotEqual(Integer memberServiceId) {
        regMemberServiceId(CK_NES, memberServiceId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (会員サービスID)MEMBER_SERVICE_ID: {PK, ID, NotNull, INT(10)}
     * @param memberServiceId The value of memberServiceId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberServiceId_GreaterThan(Integer memberServiceId) {
        regMemberServiceId(CK_GT, memberServiceId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (会員サービスID)MEMBER_SERVICE_ID: {PK, ID, NotNull, INT(10)}
     * @param memberServiceId The value of memberServiceId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberServiceId_LessThan(Integer memberServiceId) {
        regMemberServiceId(CK_LT, memberServiceId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (会員サービスID)MEMBER_SERVICE_ID: {PK, ID, NotNull, INT(10)}
     * @param memberServiceId The value of memberServiceId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberServiceId_GreaterEqual(Integer memberServiceId) {
        regMemberServiceId(CK_GE, memberServiceId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (会員サービスID)MEMBER_SERVICE_ID: {PK, ID, NotNull, INT(10)}
     * @param memberServiceId The value of memberServiceId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberServiceId_LessEqual(Integer memberServiceId) {
        regMemberServiceId(CK_LE, memberServiceId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (会員サービスID)MEMBER_SERVICE_ID: {PK, ID, NotNull, INT(10)}
     * @param minNumber The min number of memberServiceId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of memberServiceId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setMemberServiceId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setMemberServiceId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (会員サービスID)MEMBER_SERVICE_ID: {PK, ID, NotNull, INT(10)}
     * @param minNumber The min number of memberServiceId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of memberServiceId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setMemberServiceId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMemberServiceId(), "MEMBER_SERVICE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (会員サービスID)MEMBER_SERVICE_ID: {PK, ID, NotNull, INT(10)}
     * @param memberServiceIdList The collection of memberServiceId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberServiceId_InScope(Collection<Integer> memberServiceIdList) {
        doSetMemberServiceId_InScope(memberServiceIdList);
    }

    protected void doSetMemberServiceId_InScope(Collection<Integer> memberServiceIdList) {
        regINS(CK_INS, cTL(memberServiceIdList), xgetCValueMemberServiceId(), "MEMBER_SERVICE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (会員サービスID)MEMBER_SERVICE_ID: {PK, ID, NotNull, INT(10)}
     * @param memberServiceIdList The collection of memberServiceId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberServiceId_NotInScope(Collection<Integer> memberServiceIdList) {
        doSetMemberServiceId_NotInScope(memberServiceIdList);
    }

    protected void doSetMemberServiceId_NotInScope(Collection<Integer> memberServiceIdList) {
        regINS(CK_NINS, cTL(memberServiceIdList), xgetCValueMemberServiceId(), "MEMBER_SERVICE_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (会員サービスID)MEMBER_SERVICE_ID: {PK, ID, NotNull, INT(10)}
     */
    public void setMemberServiceId_IsNull() { regMemberServiceId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (会員サービスID)MEMBER_SERVICE_ID: {PK, ID, NotNull, INT(10)}
     */
    public void setMemberServiceId_IsNotNull() { regMemberServiceId(CK_ISNN, DOBJ); }

    protected void regMemberServiceId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMemberServiceId(), "MEMBER_SERVICE_ID"); }
    protected abstract ConditionValue xgetCValueMemberServiceId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (会員ID)MEMBER_ID: {UQ, NotNull, INT(10), FK to member}
     * @param memberId The value of memberId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberId_Equal(Integer memberId) {
        doSetMemberId_Equal(memberId);
    }

    protected void doSetMemberId_Equal(Integer memberId) {
        regMemberId(CK_EQ, memberId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (会員ID)MEMBER_ID: {UQ, NotNull, INT(10), FK to member}
     * @param memberId The value of memberId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberId_NotEqual(Integer memberId) {
        doSetMemberId_NotEqual(memberId);
    }

    protected void doSetMemberId_NotEqual(Integer memberId) {
        regMemberId(CK_NES, memberId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (会員ID)MEMBER_ID: {UQ, NotNull, INT(10), FK to member}
     * @param memberId The value of memberId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberId_GreaterThan(Integer memberId) {
        regMemberId(CK_GT, memberId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (会員ID)MEMBER_ID: {UQ, NotNull, INT(10), FK to member}
     * @param memberId The value of memberId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberId_LessThan(Integer memberId) {
        regMemberId(CK_LT, memberId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (会員ID)MEMBER_ID: {UQ, NotNull, INT(10), FK to member}
     * @param memberId The value of memberId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberId_GreaterEqual(Integer memberId) {
        regMemberId(CK_GE, memberId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (会員ID)MEMBER_ID: {UQ, NotNull, INT(10), FK to member}
     * @param memberId The value of memberId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberId_LessEqual(Integer memberId) {
        regMemberId(CK_LE, memberId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (会員ID)MEMBER_ID: {UQ, NotNull, INT(10), FK to member}
     * @param minNumber The min number of memberId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of memberId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setMemberId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setMemberId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (会員ID)MEMBER_ID: {UQ, NotNull, INT(10), FK to member}
     * @param minNumber The min number of memberId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of memberId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setMemberId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMemberId(), "MEMBER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (会員ID)MEMBER_ID: {UQ, NotNull, INT(10), FK to member}
     * @param memberIdList The collection of memberId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberId_InScope(Collection<Integer> memberIdList) {
        doSetMemberId_InScope(memberIdList);
    }

    protected void doSetMemberId_InScope(Collection<Integer> memberIdList) {
        regINS(CK_INS, cTL(memberIdList), xgetCValueMemberId(), "MEMBER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (会員ID)MEMBER_ID: {UQ, NotNull, INT(10), FK to member}
     * @param memberIdList The collection of memberId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberId_NotInScope(Collection<Integer> memberIdList) {
        doSetMemberId_NotInScope(memberIdList);
    }

    protected void doSetMemberId_NotInScope(Collection<Integer> memberIdList) {
        regINS(CK_NINS, cTL(memberIdList), xgetCValueMemberId(), "MEMBER_ID");
    }

    protected void regMemberId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMemberId(), "MEMBER_ID"); }
    protected abstract ConditionValue xgetCValueMemberId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (サービスポイント数)SERVICE_POINT_COUNT: {IX, NotNull, INT(10)}
     * @param servicePointCount The value of servicePointCount as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setServicePointCount_Equal(Integer servicePointCount) {
        doSetServicePointCount_Equal(servicePointCount);
    }

    protected void doSetServicePointCount_Equal(Integer servicePointCount) {
        regServicePointCount(CK_EQ, servicePointCount);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (サービスポイント数)SERVICE_POINT_COUNT: {IX, NotNull, INT(10)}
     * @param servicePointCount The value of servicePointCount as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setServicePointCount_NotEqual(Integer servicePointCount) {
        doSetServicePointCount_NotEqual(servicePointCount);
    }

    protected void doSetServicePointCount_NotEqual(Integer servicePointCount) {
        regServicePointCount(CK_NES, servicePointCount);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (サービスポイント数)SERVICE_POINT_COUNT: {IX, NotNull, INT(10)}
     * @param servicePointCount The value of servicePointCount as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setServicePointCount_GreaterThan(Integer servicePointCount) {
        regServicePointCount(CK_GT, servicePointCount);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (サービスポイント数)SERVICE_POINT_COUNT: {IX, NotNull, INT(10)}
     * @param servicePointCount The value of servicePointCount as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setServicePointCount_LessThan(Integer servicePointCount) {
        regServicePointCount(CK_LT, servicePointCount);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (サービスポイント数)SERVICE_POINT_COUNT: {IX, NotNull, INT(10)}
     * @param servicePointCount The value of servicePointCount as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setServicePointCount_GreaterEqual(Integer servicePointCount) {
        regServicePointCount(CK_GE, servicePointCount);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (サービスポイント数)SERVICE_POINT_COUNT: {IX, NotNull, INT(10)}
     * @param servicePointCount The value of servicePointCount as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setServicePointCount_LessEqual(Integer servicePointCount) {
        regServicePointCount(CK_LE, servicePointCount);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (サービスポイント数)SERVICE_POINT_COUNT: {IX, NotNull, INT(10)}
     * @param minNumber The min number of servicePointCount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of servicePointCount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setServicePointCount_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setServicePointCount_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (サービスポイント数)SERVICE_POINT_COUNT: {IX, NotNull, INT(10)}
     * @param minNumber The min number of servicePointCount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of servicePointCount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setServicePointCount_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueServicePointCount(), "SERVICE_POINT_COUNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (サービスポイント数)SERVICE_POINT_COUNT: {IX, NotNull, INT(10)}
     * @param servicePointCountList The collection of servicePointCount as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setServicePointCount_InScope(Collection<Integer> servicePointCountList) {
        doSetServicePointCount_InScope(servicePointCountList);
    }

    protected void doSetServicePointCount_InScope(Collection<Integer> servicePointCountList) {
        regINS(CK_INS, cTL(servicePointCountList), xgetCValueServicePointCount(), "SERVICE_POINT_COUNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (サービスポイント数)SERVICE_POINT_COUNT: {IX, NotNull, INT(10)}
     * @param servicePointCountList The collection of servicePointCount as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setServicePointCount_NotInScope(Collection<Integer> servicePointCountList) {
        doSetServicePointCount_NotInScope(servicePointCountList);
    }

    protected void doSetServicePointCount_NotInScope(Collection<Integer> servicePointCountList) {
        regINS(CK_NINS, cTL(servicePointCountList), xgetCValueServicePointCount(), "SERVICE_POINT_COUNT");
    }

    protected void regServicePointCount(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueServicePointCount(), "SERVICE_POINT_COUNT"); }
    protected abstract ConditionValue xgetCValueServicePointCount();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (サービスランクコード)SERVICE_RANK_CODE: {IX, NotNull, CHAR(3), FK to service_rank, classification=ServiceRank}
     * @param serviceRankCode The value of serviceRankCode as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setServiceRankCode_Equal(String serviceRankCode) {
        doSetServiceRankCode_Equal(fRES(serviceRankCode));
    }

    /**
     * Equal(=). As ServiceRank. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (サービスランクコード)SERVICE_RANK_CODE: {IX, NotNull, CHAR(3), FK to service_rank, classification=ServiceRank} <br>
     * rank of service member gets
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setServiceRankCode_Equal_AsServiceRank(CDef.ServiceRank cdef) {
        doSetServiceRankCode_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As Platinum (PLT). And OnlyOnceRegistered. <br>
     * PLATINUM: platinum rank
     */
    public void setServiceRankCode_Equal_Platinum() {
        setServiceRankCode_Equal_AsServiceRank(CDef.ServiceRank.Platinum);
    }

    /**
     * Equal(=). As Gold (GLD). And OnlyOnceRegistered. <br>
     * GOLD: gold rank
     */
    public void setServiceRankCode_Equal_Gold() {
        setServiceRankCode_Equal_AsServiceRank(CDef.ServiceRank.Gold);
    }

    /**
     * Equal(=). As Silver (SIL). And OnlyOnceRegistered. <br>
     * SILVER: silver rank
     */
    public void setServiceRankCode_Equal_Silver() {
        setServiceRankCode_Equal_AsServiceRank(CDef.ServiceRank.Silver);
    }

    /**
     * Equal(=). As Bronze (BRZ). And OnlyOnceRegistered. <br>
     * BRONZE: bronze rank
     */
    public void setServiceRankCode_Equal_Bronze() {
        setServiceRankCode_Equal_AsServiceRank(CDef.ServiceRank.Bronze);
    }

    /**
     * Equal(=). As Plastic (PLS). And OnlyOnceRegistered. <br>
     * PLASTIC: plastic rank
     */
    public void setServiceRankCode_Equal_Plastic() {
        setServiceRankCode_Equal_AsServiceRank(CDef.ServiceRank.Plastic);
    }

    protected void doSetServiceRankCode_Equal(String serviceRankCode) {
        regServiceRankCode(CK_EQ, serviceRankCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (サービスランクコード)SERVICE_RANK_CODE: {IX, NotNull, CHAR(3), FK to service_rank, classification=ServiceRank}
     * @param serviceRankCode The value of serviceRankCode as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setServiceRankCode_NotEqual(String serviceRankCode) {
        doSetServiceRankCode_NotEqual(fRES(serviceRankCode));
    }

    /**
     * NotEqual(&lt;&gt;). As ServiceRank. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (サービスランクコード)SERVICE_RANK_CODE: {IX, NotNull, CHAR(3), FK to service_rank, classification=ServiceRank} <br>
     * rank of service member gets
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setServiceRankCode_NotEqual_AsServiceRank(CDef.ServiceRank cdef) {
        doSetServiceRankCode_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As Platinum (PLT). And OnlyOnceRegistered. <br>
     * PLATINUM: platinum rank
     */
    public void setServiceRankCode_NotEqual_Platinum() {
        setServiceRankCode_NotEqual_AsServiceRank(CDef.ServiceRank.Platinum);
    }

    /**
     * NotEqual(&lt;&gt;). As Gold (GLD). And OnlyOnceRegistered. <br>
     * GOLD: gold rank
     */
    public void setServiceRankCode_NotEqual_Gold() {
        setServiceRankCode_NotEqual_AsServiceRank(CDef.ServiceRank.Gold);
    }

    /**
     * NotEqual(&lt;&gt;). As Silver (SIL). And OnlyOnceRegistered. <br>
     * SILVER: silver rank
     */
    public void setServiceRankCode_NotEqual_Silver() {
        setServiceRankCode_NotEqual_AsServiceRank(CDef.ServiceRank.Silver);
    }

    /**
     * NotEqual(&lt;&gt;). As Bronze (BRZ). And OnlyOnceRegistered. <br>
     * BRONZE: bronze rank
     */
    public void setServiceRankCode_NotEqual_Bronze() {
        setServiceRankCode_NotEqual_AsServiceRank(CDef.ServiceRank.Bronze);
    }

    /**
     * NotEqual(&lt;&gt;). As Plastic (PLS). And OnlyOnceRegistered. <br>
     * PLASTIC: plastic rank
     */
    public void setServiceRankCode_NotEqual_Plastic() {
        setServiceRankCode_NotEqual_AsServiceRank(CDef.ServiceRank.Plastic);
    }

    protected void doSetServiceRankCode_NotEqual(String serviceRankCode) {
        regServiceRankCode(CK_NES, serviceRankCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (サービスランクコード)SERVICE_RANK_CODE: {IX, NotNull, CHAR(3), FK to service_rank, classification=ServiceRank}
     * @param serviceRankCodeList The collection of serviceRankCode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setServiceRankCode_InScope(Collection<String> serviceRankCodeList) {
        doSetServiceRankCode_InScope(serviceRankCodeList);
    }

    /**
     * InScope {in ('a', 'b')}. As ServiceRank. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (サービスランクコード)SERVICE_RANK_CODE: {IX, NotNull, CHAR(3), FK to service_rank, classification=ServiceRank} <br>
     * rank of service member gets
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setServiceRankCode_InScope_AsServiceRank(Collection<CDef.ServiceRank> cdefList) {
        doSetServiceRankCode_InScope(cTStrL(cdefList));
    }

    protected void doSetServiceRankCode_InScope(Collection<String> serviceRankCodeList) {
        regINS(CK_INS, cTL(serviceRankCodeList), xgetCValueServiceRankCode(), "SERVICE_RANK_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (サービスランクコード)SERVICE_RANK_CODE: {IX, NotNull, CHAR(3), FK to service_rank, classification=ServiceRank}
     * @param serviceRankCodeList The collection of serviceRankCode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setServiceRankCode_NotInScope(Collection<String> serviceRankCodeList) {
        doSetServiceRankCode_NotInScope(serviceRankCodeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As ServiceRank. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (サービスランクコード)SERVICE_RANK_CODE: {IX, NotNull, CHAR(3), FK to service_rank, classification=ServiceRank} <br>
     * rank of service member gets
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setServiceRankCode_NotInScope_AsServiceRank(Collection<CDef.ServiceRank> cdefList) {
        doSetServiceRankCode_NotInScope(cTStrL(cdefList));
    }

    protected void doSetServiceRankCode_NotInScope(Collection<String> serviceRankCodeList) {
        regINS(CK_NINS, cTL(serviceRankCodeList), xgetCValueServiceRankCode(), "SERVICE_RANK_CODE");
    }

    protected void regServiceRankCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueServiceRankCode(), "SERVICE_RANK_CODE"); }
    protected abstract ConditionValue xgetCValueServiceRankCode();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @param registerDatetime The value of registerDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_Equal(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_EQ,  registerDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * <pre>e.g. setRegisterDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setRegisterDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setRegisterDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * <pre>e.g. setRegisterDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setRegisterDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "REGISTER_DATETIME"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueRegisterDatetime(), nm, op);
    }

    protected void regRegisterDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRegisterDatetime(), "REGISTER_DATETIME"); }
    protected abstract ConditionValue xgetCValueRegisterDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @param registerUser The value of registerUser as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegisterUser_Equal(String registerUser) {
        doSetRegisterUser_Equal(fRES(registerUser));
    }

    protected void doSetRegisterUser_Equal(String registerUser) {
        regRegisterUser(CK_EQ, registerUser);
    }

    protected void regRegisterUser(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRegisterUser(), "REGISTER_USER"); }
    protected abstract ConditionValue xgetCValueRegisterUser();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @param updateDatetime The value of updateDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_Equal(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_EQ,  updateDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * <pre>e.g. setUpdateDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setUpdateDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setUpdateDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * <pre>e.g. setUpdateDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setUpdateDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "UPDATE_DATETIME"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueUpdateDatetime(), nm, op);
    }

    protected void regUpdateDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdateDatetime(), "UPDATE_DATETIME"); }
    protected abstract ConditionValue xgetCValueUpdateDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (更新ユーザー)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @param updateUser The value of updateUser as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdateUser_Equal(String updateUser) {
        doSetUpdateUser_Equal(fRES(updateUser));
    }

    protected void doSetUpdateUser_Equal(String updateUser) {
        regUpdateUser(CK_EQ, updateUser);
    }

    protected void regUpdateUser(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdateUser(), "UPDATE_USER"); }
    protected abstract ConditionValue xgetCValueUpdateUser();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (バージョン番号)VERSION_NO: {NotNull, BIGINT(19)}
     * @param versionNo The value of versionNo as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setVersionNo_Equal(Long versionNo) {
        doSetVersionNo_Equal(versionNo);
    }

    protected void doSetVersionNo_Equal(Long versionNo) {
        regVersionNo(CK_EQ, versionNo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (バージョン番号)VERSION_NO: {NotNull, BIGINT(19)}
     * @param minNumber The min number of versionNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of versionNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setVersionNo_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setVersionNo_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (バージョン番号)VERSION_NO: {NotNull, BIGINT(19)}
     * @param minNumber The min number of versionNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of versionNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setVersionNo_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueVersionNo(), "VERSION_NO", rangeOfOption);
    }

    protected void regVersionNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueVersionNo(), "VERSION_NO"); }
    protected abstract ConditionValue xgetCValueVersionNo();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MemberServiceCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, MemberServiceCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MemberServiceCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, MemberServiceCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MemberServiceCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, MemberServiceCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MemberServiceCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, MemberServiceCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MemberServiceCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, MemberServiceCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MemberServiceCB&gt;() {
     *     public void query(MemberServiceCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MemberServiceCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, MemberServiceCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        MemberServiceCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(MemberServiceCQ sq);

    protected MemberServiceCB xcreateScalarConditionCB() {
        MemberServiceCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MemberServiceCB xcreateScalarConditionPartitionByCB() {
        MemberServiceCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MemberServiceCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MemberServiceCB cb = new MemberServiceCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "MEMBER_SERVICE_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MemberServiceCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MemberServiceCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MemberServiceCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MemberServiceCB cb = new MemberServiceCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "MEMBER_SERVICE_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MemberServiceCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MemberServiceCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MemberServiceCB cb = new MemberServiceCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MemberServiceCQ sq);

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param opLambda The callback for option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOptionCall opLambda) { // is user public!
        xdoWithManualOrder(cMOO(opLambda));
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected MemberServiceCB newMyCB() {
        return new MemberServiceCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MemberServiceCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
