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
 * The abstract condition-query of member_address.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMemberAddressCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMemberAddressCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "member_address";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (会員住所ID)MEMBER_ADDRESS_ID: {PK, ID, NotNull, INT(10)}
     * @param memberAddressId The value of memberAddressId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberAddressId_Equal(Integer memberAddressId) {
        doSetMemberAddressId_Equal(memberAddressId);
    }

    protected void doSetMemberAddressId_Equal(Integer memberAddressId) {
        regMemberAddressId(CK_EQ, memberAddressId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (会員住所ID)MEMBER_ADDRESS_ID: {PK, ID, NotNull, INT(10)}
     * @param memberAddressId The value of memberAddressId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberAddressId_NotEqual(Integer memberAddressId) {
        doSetMemberAddressId_NotEqual(memberAddressId);
    }

    protected void doSetMemberAddressId_NotEqual(Integer memberAddressId) {
        regMemberAddressId(CK_NES, memberAddressId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (会員住所ID)MEMBER_ADDRESS_ID: {PK, ID, NotNull, INT(10)}
     * @param memberAddressId The value of memberAddressId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberAddressId_GreaterThan(Integer memberAddressId) {
        regMemberAddressId(CK_GT, memberAddressId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (会員住所ID)MEMBER_ADDRESS_ID: {PK, ID, NotNull, INT(10)}
     * @param memberAddressId The value of memberAddressId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberAddressId_LessThan(Integer memberAddressId) {
        regMemberAddressId(CK_LT, memberAddressId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (会員住所ID)MEMBER_ADDRESS_ID: {PK, ID, NotNull, INT(10)}
     * @param memberAddressId The value of memberAddressId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberAddressId_GreaterEqual(Integer memberAddressId) {
        regMemberAddressId(CK_GE, memberAddressId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (会員住所ID)MEMBER_ADDRESS_ID: {PK, ID, NotNull, INT(10)}
     * @param memberAddressId The value of memberAddressId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberAddressId_LessEqual(Integer memberAddressId) {
        regMemberAddressId(CK_LE, memberAddressId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (会員住所ID)MEMBER_ADDRESS_ID: {PK, ID, NotNull, INT(10)}
     * @param minNumber The min number of memberAddressId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of memberAddressId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setMemberAddressId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setMemberAddressId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (会員住所ID)MEMBER_ADDRESS_ID: {PK, ID, NotNull, INT(10)}
     * @param minNumber The min number of memberAddressId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of memberAddressId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setMemberAddressId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMemberAddressId(), "MEMBER_ADDRESS_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (会員住所ID)MEMBER_ADDRESS_ID: {PK, ID, NotNull, INT(10)}
     * @param memberAddressIdList The collection of memberAddressId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberAddressId_InScope(Collection<Integer> memberAddressIdList) {
        doSetMemberAddressId_InScope(memberAddressIdList);
    }

    protected void doSetMemberAddressId_InScope(Collection<Integer> memberAddressIdList) {
        regINS(CK_INS, cTL(memberAddressIdList), xgetCValueMemberAddressId(), "MEMBER_ADDRESS_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (会員住所ID)MEMBER_ADDRESS_ID: {PK, ID, NotNull, INT(10)}
     * @param memberAddressIdList The collection of memberAddressId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberAddressId_NotInScope(Collection<Integer> memberAddressIdList) {
        doSetMemberAddressId_NotInScope(memberAddressIdList);
    }

    protected void doSetMemberAddressId_NotInScope(Collection<Integer> memberAddressIdList) {
        regINS(CK_NINS, cTL(memberAddressIdList), xgetCValueMemberAddressId(), "MEMBER_ADDRESS_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (会員住所ID)MEMBER_ADDRESS_ID: {PK, ID, NotNull, INT(10)}
     */
    public void setMemberAddressId_IsNull() { regMemberAddressId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (会員住所ID)MEMBER_ADDRESS_ID: {PK, ID, NotNull, INT(10)}
     */
    public void setMemberAddressId_IsNotNull() { regMemberAddressId(CK_ISNN, DOBJ); }

    protected void regMemberAddressId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMemberAddressId(), "MEMBER_ADDRESS_ID"); }
    protected abstract ConditionValue xgetCValueMemberAddressId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (会員ID)MEMBER_ID: {UQ+, NotNull, INT(10), FK to member}
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
     * (会員ID)MEMBER_ID: {UQ+, NotNull, INT(10), FK to member}
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
     * (会員ID)MEMBER_ID: {UQ+, NotNull, INT(10), FK to member}
     * @param memberId The value of memberId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberId_GreaterThan(Integer memberId) {
        regMemberId(CK_GT, memberId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (会員ID)MEMBER_ID: {UQ+, NotNull, INT(10), FK to member}
     * @param memberId The value of memberId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberId_LessThan(Integer memberId) {
        regMemberId(CK_LT, memberId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (会員ID)MEMBER_ID: {UQ+, NotNull, INT(10), FK to member}
     * @param memberId The value of memberId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberId_GreaterEqual(Integer memberId) {
        regMemberId(CK_GE, memberId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (会員ID)MEMBER_ID: {UQ+, NotNull, INT(10), FK to member}
     * @param memberId The value of memberId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberId_LessEqual(Integer memberId) {
        regMemberId(CK_LE, memberId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (会員ID)MEMBER_ID: {UQ+, NotNull, INT(10), FK to member}
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
     * (会員ID)MEMBER_ID: {UQ+, NotNull, INT(10), FK to member}
     * @param minNumber The min number of memberId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of memberId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setMemberId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMemberId(), "MEMBER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (会員ID)MEMBER_ID: {UQ+, NotNull, INT(10), FK to member}
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
     * (会員ID)MEMBER_ID: {UQ+, NotNull, INT(10), FK to member}
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
     * (有効開始日)VALID_BEGIN_DATE: {+UQ, NotNull, DATE(10)}
     * @param validBeginDate The value of validBeginDate as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setValidBeginDate_Equal(java.time.LocalDate validBeginDate) {
        regValidBeginDate(CK_EQ,  validBeginDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (有効開始日)VALID_BEGIN_DATE: {+UQ, NotNull, DATE(10)}
     * @param validBeginDate The value of validBeginDate as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setValidBeginDate_GreaterThan(java.time.LocalDate validBeginDate) {
        regValidBeginDate(CK_GT,  validBeginDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (有効開始日)VALID_BEGIN_DATE: {+UQ, NotNull, DATE(10)}
     * @param validBeginDate The value of validBeginDate as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setValidBeginDate_LessThan(java.time.LocalDate validBeginDate) {
        regValidBeginDate(CK_LT,  validBeginDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (有効開始日)VALID_BEGIN_DATE: {+UQ, NotNull, DATE(10)}
     * @param validBeginDate The value of validBeginDate as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setValidBeginDate_GreaterEqual(java.time.LocalDate validBeginDate) {
        regValidBeginDate(CK_GE,  validBeginDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (有効開始日)VALID_BEGIN_DATE: {+UQ, NotNull, DATE(10)}
     * @param validBeginDate The value of validBeginDate as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setValidBeginDate_LessEqual(java.time.LocalDate validBeginDate) {
        regValidBeginDate(CK_LE, validBeginDate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (有効開始日)VALID_BEGIN_DATE: {+UQ, NotNull, DATE(10)}
     * <pre>e.g. setValidBeginDate_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of validBeginDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of validBeginDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setValidBeginDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setValidBeginDate_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (有効開始日)VALID_BEGIN_DATE: {+UQ, NotNull, DATE(10)}
     * <pre>e.g. setValidBeginDate_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of validBeginDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of validBeginDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setValidBeginDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, FromToOption fromToOption) {
        String nm = "VALID_BEGIN_DATE"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueValidBeginDate(), nm, op);
    }

    protected void regValidBeginDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueValidBeginDate(), "VALID_BEGIN_DATE"); }
    protected abstract ConditionValue xgetCValueValidBeginDate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (有効終了日)VALID_END_DATE: {NotNull, DATE(10)}
     * @param validEndDate The value of validEndDate as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setValidEndDate_Equal(java.time.LocalDate validEndDate) {
        regValidEndDate(CK_EQ,  validEndDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (有効終了日)VALID_END_DATE: {NotNull, DATE(10)}
     * @param validEndDate The value of validEndDate as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setValidEndDate_GreaterThan(java.time.LocalDate validEndDate) {
        regValidEndDate(CK_GT,  validEndDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (有効終了日)VALID_END_DATE: {NotNull, DATE(10)}
     * @param validEndDate The value of validEndDate as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setValidEndDate_LessThan(java.time.LocalDate validEndDate) {
        regValidEndDate(CK_LT,  validEndDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (有効終了日)VALID_END_DATE: {NotNull, DATE(10)}
     * @param validEndDate The value of validEndDate as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setValidEndDate_GreaterEqual(java.time.LocalDate validEndDate) {
        regValidEndDate(CK_GE,  validEndDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (有効終了日)VALID_END_DATE: {NotNull, DATE(10)}
     * @param validEndDate The value of validEndDate as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setValidEndDate_LessEqual(java.time.LocalDate validEndDate) {
        regValidEndDate(CK_LE, validEndDate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (有効終了日)VALID_END_DATE: {NotNull, DATE(10)}
     * <pre>e.g. setValidEndDate_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of validEndDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of validEndDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setValidEndDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setValidEndDate_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (有効終了日)VALID_END_DATE: {NotNull, DATE(10)}
     * <pre>e.g. setValidEndDate_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of validEndDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of validEndDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setValidEndDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, FromToOption fromToOption) {
        String nm = "VALID_END_DATE"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueValidEndDate(), nm, op);
    }

    protected void regValidEndDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueValidEndDate(), "VALID_END_DATE"); }
    protected abstract ConditionValue xgetCValueValidEndDate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (住所)ADDRESS: {NotNull, VARCHAR(200)}
     * @param address The value of address as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress_Equal(String address) {
        doSetAddress_Equal(fRES(address));
    }

    protected void doSetAddress_Equal(String address) {
        regAddress(CK_EQ, address);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (住所)ADDRESS: {NotNull, VARCHAR(200)}
     * @param address The value of address as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress_NotEqual(String address) {
        doSetAddress_NotEqual(fRES(address));
    }

    protected void doSetAddress_NotEqual(String address) {
        regAddress(CK_NES, address);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (住所)ADDRESS: {NotNull, VARCHAR(200)}
     * @param addressList The collection of address as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress_InScope(Collection<String> addressList) {
        doSetAddress_InScope(addressList);
    }

    protected void doSetAddress_InScope(Collection<String> addressList) {
        regINS(CK_INS, cTL(addressList), xgetCValueAddress(), "ADDRESS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (住所)ADDRESS: {NotNull, VARCHAR(200)}
     * @param addressList The collection of address as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress_NotInScope(Collection<String> addressList) {
        doSetAddress_NotInScope(addressList);
    }

    protected void doSetAddress_NotInScope(Collection<String> addressList) {
        regINS(CK_NINS, cTL(addressList), xgetCValueAddress(), "ADDRESS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (住所)ADDRESS: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setAddress_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param address The value of address as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setAddress_LikeSearch(String address, ConditionOptionCall<LikeSearchOption> opLambda) {
        setAddress_LikeSearch(address, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (住所)ADDRESS: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setAddress_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param address The value of address as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setAddress_LikeSearch(String address, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(address), xgetCValueAddress(), "ADDRESS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (住所)ADDRESS: {NotNull, VARCHAR(200)}
     * @param address The value of address as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setAddress_NotLikeSearch(String address, ConditionOptionCall<LikeSearchOption> opLambda) {
        setAddress_NotLikeSearch(address, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (住所)ADDRESS: {NotNull, VARCHAR(200)}
     * @param address The value of address as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setAddress_NotLikeSearch(String address, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(address), xgetCValueAddress(), "ADDRESS", likeSearchOption);
    }

    protected void regAddress(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAddress(), "ADDRESS"); }
    protected abstract ConditionValue xgetCValueAddress();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (地域ID)REGION_ID: {IX, NotNull, INT(10), FK to region, classification=Region}
     * @param regionId The value of regionId as equal. (basically NotNull: error as default, or no condition as option)
     */
    protected void setRegionId_Equal(Integer regionId) {
        doSetRegionId_Equal(regionId);
    }

    /**
     * Equal(=). As Region. And NullIgnored, OnlyOnceRegistered. <br>
     * (地域ID)REGION_ID: {IX, NotNull, INT(10), FK to region, classification=Region} <br>
     * 主に会員の住んでいる地域を示す
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setRegionId_Equal_AsRegion(CDef.Region cdef) {
        doSetRegionId_Equal(cTNum(cdef != null ? cdef.code() : null, Integer.class));
    }

    /**
     * Equal(=). As America (1). And NullIgnored, OnlyOnceRegistered. <br>
     * AMERICA
     */
    public void setRegionId_Equal_America() {
        setRegionId_Equal_AsRegion(CDef.Region.America);
    }

    /**
     * Equal(=). As Canada (2). And NullIgnored, OnlyOnceRegistered. <br>
     * CANADA
     */
    public void setRegionId_Equal_Canada() {
        setRegionId_Equal_AsRegion(CDef.Region.Canada);
    }

    /**
     * Equal(=). As China (3). And NullIgnored, OnlyOnceRegistered. <br>
     * CHINA
     */
    public void setRegionId_Equal_China() {
        setRegionId_Equal_AsRegion(CDef.Region.China);
    }

    /**
     * Equal(=). As Chiba (4). And NullIgnored, OnlyOnceRegistered. <br>
     * CHIBA
     */
    public void setRegionId_Equal_Chiba() {
        setRegionId_Equal_AsRegion(CDef.Region.Chiba);
    }

    protected void doSetRegionId_Equal(Integer regionId) {
        regRegionId(CK_EQ, regionId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (地域ID)REGION_ID: {IX, NotNull, INT(10), FK to region, classification=Region}
     * @param regionId The value of regionId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    protected void setRegionId_NotEqual(Integer regionId) {
        doSetRegionId_NotEqual(regionId);
    }

    /**
     * NotEqual(&lt;&gt;). As Region. And NullIgnored, OnlyOnceRegistered. <br>
     * (地域ID)REGION_ID: {IX, NotNull, INT(10), FK to region, classification=Region} <br>
     * 主に会員の住んでいる地域を示す
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setRegionId_NotEqual_AsRegion(CDef.Region cdef) {
        doSetRegionId_NotEqual(cTNum(cdef != null ? cdef.code() : null, Integer.class));
    }

    /**
     * NotEqual(&lt;&gt;). As America (1). And NullIgnored, OnlyOnceRegistered. <br>
     * AMERICA
     */
    public void setRegionId_NotEqual_America() {
        setRegionId_NotEqual_AsRegion(CDef.Region.America);
    }

    /**
     * NotEqual(&lt;&gt;). As Canada (2). And NullIgnored, OnlyOnceRegistered. <br>
     * CANADA
     */
    public void setRegionId_NotEqual_Canada() {
        setRegionId_NotEqual_AsRegion(CDef.Region.Canada);
    }

    /**
     * NotEqual(&lt;&gt;). As China (3). And NullIgnored, OnlyOnceRegistered. <br>
     * CHINA
     */
    public void setRegionId_NotEqual_China() {
        setRegionId_NotEqual_AsRegion(CDef.Region.China);
    }

    /**
     * NotEqual(&lt;&gt;). As Chiba (4). And NullIgnored, OnlyOnceRegistered. <br>
     * CHIBA
     */
    public void setRegionId_NotEqual_Chiba() {
        setRegionId_NotEqual_AsRegion(CDef.Region.Chiba);
    }

    protected void doSetRegionId_NotEqual(Integer regionId) {
        regRegionId(CK_NES, regionId);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (地域ID)REGION_ID: {IX, NotNull, INT(10), FK to region, classification=Region}
     * @param regionIdList The collection of regionId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setRegionId_InScope(Collection<Integer> regionIdList) {
        doSetRegionId_InScope(regionIdList);
    }

    /**
     * InScope {in (1, 2)}. As Region. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (地域ID)REGION_ID: {IX, NotNull, INT(10), FK to region, classification=Region} <br>
     * 主に会員の住んでいる地域を示す
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegionId_InScope_AsRegion(Collection<CDef.Region> cdefList) {
        doSetRegionId_InScope(cTNumL(cdefList, Integer.class));
    }

    protected void doSetRegionId_InScope(Collection<Integer> regionIdList) {
        regINS(CK_INS, cTL(regionIdList), xgetCValueRegionId(), "REGION_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (地域ID)REGION_ID: {IX, NotNull, INT(10), FK to region, classification=Region}
     * @param regionIdList The collection of regionId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setRegionId_NotInScope(Collection<Integer> regionIdList) {
        doSetRegionId_NotInScope(regionIdList);
    }

    /**
     * NotInScope {not in (1, 2)}. As Region. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (地域ID)REGION_ID: {IX, NotNull, INT(10), FK to region, classification=Region} <br>
     * 主に会員の住んでいる地域を示す
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegionId_NotInScope_AsRegion(Collection<CDef.Region> cdefList) {
        doSetRegionId_NotInScope(cTNumL(cdefList, Integer.class));
    }

    protected void doSetRegionId_NotInScope(Collection<Integer> regionIdList) {
        regINS(CK_NINS, cTL(regionIdList), xgetCValueRegionId(), "REGION_ID");
    }

    protected void regRegionId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRegionId(), "REGION_ID"); }
    protected abstract ConditionValue xgetCValueRegionId();

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
    public HpSLCFunction<MemberAddressCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, MemberAddressCB.class);
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
    public HpSLCFunction<MemberAddressCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, MemberAddressCB.class);
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
    public HpSLCFunction<MemberAddressCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, MemberAddressCB.class);
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
    public HpSLCFunction<MemberAddressCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, MemberAddressCB.class);
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
    public HpSLCFunction<MemberAddressCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, MemberAddressCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MemberAddressCB&gt;() {
     *     public void query(MemberAddressCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MemberAddressCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, MemberAddressCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        MemberAddressCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(MemberAddressCQ sq);

    protected MemberAddressCB xcreateScalarConditionCB() {
        MemberAddressCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MemberAddressCB xcreateScalarConditionPartitionByCB() {
        MemberAddressCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MemberAddressCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MemberAddressCB cb = new MemberAddressCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "MEMBER_ADDRESS_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MemberAddressCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MemberAddressCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MemberAddressCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MemberAddressCB cb = new MemberAddressCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "MEMBER_ADDRESS_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MemberAddressCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MemberAddressCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MemberAddressCB cb = new MemberAddressCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MemberAddressCQ sq);

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
    protected MemberAddressCB newMyCB() {
        return new MemberAddressCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MemberAddressCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
