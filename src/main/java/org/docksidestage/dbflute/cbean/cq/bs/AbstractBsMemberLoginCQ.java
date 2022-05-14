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
 * The abstract condition-query of member_login.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMemberLoginCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMemberLoginCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "member_login";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (会員ログインID)MEMBER_LOGIN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param memberLoginId The value of memberLoginId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberLoginId_Equal(Long memberLoginId) {
        doSetMemberLoginId_Equal(memberLoginId);
    }

    protected void doSetMemberLoginId_Equal(Long memberLoginId) {
        regMemberLoginId(CK_EQ, memberLoginId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (会員ログインID)MEMBER_LOGIN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param memberLoginId The value of memberLoginId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberLoginId_NotEqual(Long memberLoginId) {
        doSetMemberLoginId_NotEqual(memberLoginId);
    }

    protected void doSetMemberLoginId_NotEqual(Long memberLoginId) {
        regMemberLoginId(CK_NES, memberLoginId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (会員ログインID)MEMBER_LOGIN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param memberLoginId The value of memberLoginId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberLoginId_GreaterThan(Long memberLoginId) {
        regMemberLoginId(CK_GT, memberLoginId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (会員ログインID)MEMBER_LOGIN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param memberLoginId The value of memberLoginId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberLoginId_LessThan(Long memberLoginId) {
        regMemberLoginId(CK_LT, memberLoginId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (会員ログインID)MEMBER_LOGIN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param memberLoginId The value of memberLoginId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberLoginId_GreaterEqual(Long memberLoginId) {
        regMemberLoginId(CK_GE, memberLoginId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (会員ログインID)MEMBER_LOGIN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param memberLoginId The value of memberLoginId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberLoginId_LessEqual(Long memberLoginId) {
        regMemberLoginId(CK_LE, memberLoginId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (会員ログインID)MEMBER_LOGIN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of memberLoginId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of memberLoginId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setMemberLoginId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setMemberLoginId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (会員ログインID)MEMBER_LOGIN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of memberLoginId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of memberLoginId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setMemberLoginId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMemberLoginId(), "MEMBER_LOGIN_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (会員ログインID)MEMBER_LOGIN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param memberLoginIdList The collection of memberLoginId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberLoginId_InScope(Collection<Long> memberLoginIdList) {
        doSetMemberLoginId_InScope(memberLoginIdList);
    }

    protected void doSetMemberLoginId_InScope(Collection<Long> memberLoginIdList) {
        regINS(CK_INS, cTL(memberLoginIdList), xgetCValueMemberLoginId(), "MEMBER_LOGIN_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (会員ログインID)MEMBER_LOGIN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param memberLoginIdList The collection of memberLoginId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberLoginId_NotInScope(Collection<Long> memberLoginIdList) {
        doSetMemberLoginId_NotInScope(memberLoginIdList);
    }

    protected void doSetMemberLoginId_NotInScope(Collection<Long> memberLoginIdList) {
        regINS(CK_NINS, cTL(memberLoginIdList), xgetCValueMemberLoginId(), "MEMBER_LOGIN_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (会員ログインID)MEMBER_LOGIN_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setMemberLoginId_IsNull() { regMemberLoginId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (会員ログインID)MEMBER_LOGIN_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setMemberLoginId_IsNotNull() { regMemberLoginId(CK_ISNN, DOBJ); }

    protected void regMemberLoginId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMemberLoginId(), "MEMBER_LOGIN_ID"); }
    protected abstract ConditionValue xgetCValueMemberLoginId();

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
     * (ログイン日時)LOGIN_DATETIME: {+UQ, IX, NotNull, DATETIME(19)}
     * @param loginDatetime The value of loginDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLoginDatetime_Equal(java.time.LocalDateTime loginDatetime) {
        regLoginDatetime(CK_EQ,  loginDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (ログイン日時)LOGIN_DATETIME: {+UQ, IX, NotNull, DATETIME(19)}
     * @param loginDatetime The value of loginDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLoginDatetime_GreaterThan(java.time.LocalDateTime loginDatetime) {
        regLoginDatetime(CK_GT,  loginDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (ログイン日時)LOGIN_DATETIME: {+UQ, IX, NotNull, DATETIME(19)}
     * @param loginDatetime The value of loginDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLoginDatetime_LessThan(java.time.LocalDateTime loginDatetime) {
        regLoginDatetime(CK_LT,  loginDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (ログイン日時)LOGIN_DATETIME: {+UQ, IX, NotNull, DATETIME(19)}
     * @param loginDatetime The value of loginDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLoginDatetime_GreaterEqual(java.time.LocalDateTime loginDatetime) {
        regLoginDatetime(CK_GE,  loginDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (ログイン日時)LOGIN_DATETIME: {+UQ, IX, NotNull, DATETIME(19)}
     * @param loginDatetime The value of loginDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLoginDatetime_LessEqual(java.time.LocalDateTime loginDatetime) {
        regLoginDatetime(CK_LE, loginDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (ログイン日時)LOGIN_DATETIME: {+UQ, IX, NotNull, DATETIME(19)}
     * <pre>e.g. setLoginDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of loginDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of loginDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setLoginDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setLoginDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (ログイン日時)LOGIN_DATETIME: {+UQ, IX, NotNull, DATETIME(19)}
     * <pre>e.g. setLoginDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of loginDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of loginDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setLoginDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "LOGIN_DATETIME"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueLoginDatetime(), nm, op);
    }

    protected void regLoginDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLoginDatetime(), "LOGIN_DATETIME"); }
    protected abstract ConditionValue xgetCValueLoginDatetime();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (モバイルログインフラグ)MOBILE_LOGIN_FLG: {NotNull, INT(10), classification=Flg}
     * @param mobileLoginFlg The value of mobileLoginFlg as equal. (basically NotNull: error as default, or no condition as option)
     */
    protected void setMobileLoginFlg_Equal(Integer mobileLoginFlg) {
        doSetMobileLoginFlg_Equal(mobileLoginFlg);
    }

    /**
     * Equal(=). As Flg. And NullIgnored, OnlyOnceRegistered. <br>
     * (モバイルログインフラグ)MOBILE_LOGIN_FLG: {NotNull, INT(10), classification=Flg} <br>
     * general boolean classification for every flg-column
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setMobileLoginFlg_Equal_AsFlg(CDef.Flg cdef) {
        doSetMobileLoginFlg_Equal(cTNum(cdef != null ? cdef.code() : null, Integer.class));
    }

    /**
     * Equal(=). As boolean for Flg. <br>
     * (モバイルログインフラグ)MOBILE_LOGIN_FLG: {NotNull, INT(10), classification=Flg} <br>
     * general boolean classification for every flg-column
     * @param determination The determination, true or false. (basically NotNull: error as default, or no condition as option)
     */
    public void setMobileLoginFlg_Equal_AsBoolean(Boolean determination) {
        setMobileLoginFlg_Equal_AsFlg(CDef.Flg.of(determination).get());
    }

    /**
     * Equal(=). As True (1). And NullIgnored, OnlyOnceRegistered. <br>
     * Checked: means yes
     */
    public void setMobileLoginFlg_Equal_True() {
        setMobileLoginFlg_Equal_AsFlg(CDef.Flg.True);
    }

    /**
     * Equal(=). As False (0). And NullIgnored, OnlyOnceRegistered. <br>
     * Unchecked: means no
     */
    public void setMobileLoginFlg_Equal_False() {
        setMobileLoginFlg_Equal_AsFlg(CDef.Flg.False);
    }

    protected void doSetMobileLoginFlg_Equal(Integer mobileLoginFlg) {
        regMobileLoginFlg(CK_EQ, mobileLoginFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (モバイルログインフラグ)MOBILE_LOGIN_FLG: {NotNull, INT(10), classification=Flg}
     * @param mobileLoginFlg The value of mobileLoginFlg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    protected void setMobileLoginFlg_NotEqual(Integer mobileLoginFlg) {
        doSetMobileLoginFlg_NotEqual(mobileLoginFlg);
    }

    /**
     * NotEqual(&lt;&gt;). As Flg. And NullIgnored, OnlyOnceRegistered. <br>
     * (モバイルログインフラグ)MOBILE_LOGIN_FLG: {NotNull, INT(10), classification=Flg} <br>
     * general boolean classification for every flg-column
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setMobileLoginFlg_NotEqual_AsFlg(CDef.Flg cdef) {
        doSetMobileLoginFlg_NotEqual(cTNum(cdef != null ? cdef.code() : null, Integer.class));
    }

    /**
     * NotEqual(&lt;&gt;). As True (1). And NullIgnored, OnlyOnceRegistered. <br>
     * Checked: means yes
     */
    public void setMobileLoginFlg_NotEqual_True() {
        setMobileLoginFlg_NotEqual_AsFlg(CDef.Flg.True);
    }

    /**
     * NotEqual(&lt;&gt;). As False (0). And NullIgnored, OnlyOnceRegistered. <br>
     * Unchecked: means no
     */
    public void setMobileLoginFlg_NotEqual_False() {
        setMobileLoginFlg_NotEqual_AsFlg(CDef.Flg.False);
    }

    protected void doSetMobileLoginFlg_NotEqual(Integer mobileLoginFlg) {
        regMobileLoginFlg(CK_NES, mobileLoginFlg);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (モバイルログインフラグ)MOBILE_LOGIN_FLG: {NotNull, INT(10), classification=Flg}
     * @param mobileLoginFlgList The collection of mobileLoginFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setMobileLoginFlg_InScope(Collection<Integer> mobileLoginFlgList) {
        doSetMobileLoginFlg_InScope(mobileLoginFlgList);
    }

    /**
     * InScope {in (1, 2)}. As Flg. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (モバイルログインフラグ)MOBILE_LOGIN_FLG: {NotNull, INT(10), classification=Flg} <br>
     * general boolean classification for every flg-column
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMobileLoginFlg_InScope_AsFlg(Collection<CDef.Flg> cdefList) {
        doSetMobileLoginFlg_InScope(cTNumL(cdefList, Integer.class));
    }

    protected void doSetMobileLoginFlg_InScope(Collection<Integer> mobileLoginFlgList) {
        regINS(CK_INS, cTL(mobileLoginFlgList), xgetCValueMobileLoginFlg(), "MOBILE_LOGIN_FLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (モバイルログインフラグ)MOBILE_LOGIN_FLG: {NotNull, INT(10), classification=Flg}
     * @param mobileLoginFlgList The collection of mobileLoginFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setMobileLoginFlg_NotInScope(Collection<Integer> mobileLoginFlgList) {
        doSetMobileLoginFlg_NotInScope(mobileLoginFlgList);
    }

    /**
     * NotInScope {not in (1, 2)}. As Flg. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (モバイルログインフラグ)MOBILE_LOGIN_FLG: {NotNull, INT(10), classification=Flg} <br>
     * general boolean classification for every flg-column
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMobileLoginFlg_NotInScope_AsFlg(Collection<CDef.Flg> cdefList) {
        doSetMobileLoginFlg_NotInScope(cTNumL(cdefList, Integer.class));
    }

    protected void doSetMobileLoginFlg_NotInScope(Collection<Integer> mobileLoginFlgList) {
        regINS(CK_NINS, cTL(mobileLoginFlgList), xgetCValueMobileLoginFlg(), "MOBILE_LOGIN_FLG");
    }

    protected void regMobileLoginFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMobileLoginFlg(), "MOBILE_LOGIN_FLG"); }
    protected abstract ConditionValue xgetCValueMobileLoginFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (ログイン会員ステータスコード)LOGIN_MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to member_status, classification=MemberStatus}
     * @param loginMemberStatusCode The value of loginMemberStatusCode as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setLoginMemberStatusCode_Equal(String loginMemberStatusCode) {
        doSetLoginMemberStatusCode_Equal(fRES(loginMemberStatusCode));
    }

    /**
     * Equal(=). As MemberStatus. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (ログイン会員ステータスコード)LOGIN_MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to member_status, classification=MemberStatus} <br>
     * status of member from entry to withdrawal
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setLoginMemberStatusCode_Equal_AsMemberStatus(CDef.MemberStatus cdef) {
        doSetLoginMemberStatusCode_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As Formalized (FML). And OnlyOnceRegistered. <br>
     * Formalized: as formal member, allowed to use all service
     */
    public void setLoginMemberStatusCode_Equal_Formalized() {
        setLoginMemberStatusCode_Equal_AsMemberStatus(CDef.MemberStatus.Formalized);
    }

    /**
     * Equal(=). As Withdrawal (WDL). And OnlyOnceRegistered. <br>
     * Withdrawal: withdrawal is fixed, not allowed to use service
     */
    public void setLoginMemberStatusCode_Equal_Withdrawal() {
        setLoginMemberStatusCode_Equal_AsMemberStatus(CDef.MemberStatus.Withdrawal);
    }

    /**
     * Equal(=). As Provisional (PRV). And OnlyOnceRegistered. <br>
     * Provisional: first status after entry, allowed to use only part of service
     */
    public void setLoginMemberStatusCode_Equal_Provisional() {
        setLoginMemberStatusCode_Equal_AsMemberStatus(CDef.MemberStatus.Provisional);
    }

    protected void doSetLoginMemberStatusCode_Equal(String loginMemberStatusCode) {
        regLoginMemberStatusCode(CK_EQ, loginMemberStatusCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (ログイン会員ステータスコード)LOGIN_MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to member_status, classification=MemberStatus}
     * @param loginMemberStatusCode The value of loginMemberStatusCode as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setLoginMemberStatusCode_NotEqual(String loginMemberStatusCode) {
        doSetLoginMemberStatusCode_NotEqual(fRES(loginMemberStatusCode));
    }

    /**
     * NotEqual(&lt;&gt;). As MemberStatus. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (ログイン会員ステータスコード)LOGIN_MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to member_status, classification=MemberStatus} <br>
     * status of member from entry to withdrawal
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setLoginMemberStatusCode_NotEqual_AsMemberStatus(CDef.MemberStatus cdef) {
        doSetLoginMemberStatusCode_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As Formalized (FML). And OnlyOnceRegistered. <br>
     * Formalized: as formal member, allowed to use all service
     */
    public void setLoginMemberStatusCode_NotEqual_Formalized() {
        setLoginMemberStatusCode_NotEqual_AsMemberStatus(CDef.MemberStatus.Formalized);
    }

    /**
     * NotEqual(&lt;&gt;). As Withdrawal (WDL). And OnlyOnceRegistered. <br>
     * Withdrawal: withdrawal is fixed, not allowed to use service
     */
    public void setLoginMemberStatusCode_NotEqual_Withdrawal() {
        setLoginMemberStatusCode_NotEqual_AsMemberStatus(CDef.MemberStatus.Withdrawal);
    }

    /**
     * NotEqual(&lt;&gt;). As Provisional (PRV). And OnlyOnceRegistered. <br>
     * Provisional: first status after entry, allowed to use only part of service
     */
    public void setLoginMemberStatusCode_NotEqual_Provisional() {
        setLoginMemberStatusCode_NotEqual_AsMemberStatus(CDef.MemberStatus.Provisional);
    }

    protected void doSetLoginMemberStatusCode_NotEqual(String loginMemberStatusCode) {
        regLoginMemberStatusCode(CK_NES, loginMemberStatusCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (ログイン会員ステータスコード)LOGIN_MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to member_status, classification=MemberStatus}
     * @param loginMemberStatusCodeList The collection of loginMemberStatusCode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setLoginMemberStatusCode_InScope(Collection<String> loginMemberStatusCodeList) {
        doSetLoginMemberStatusCode_InScope(loginMemberStatusCodeList);
    }

    /**
     * InScope {in ('a', 'b')}. As MemberStatus. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (ログイン会員ステータスコード)LOGIN_MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to member_status, classification=MemberStatus} <br>
     * status of member from entry to withdrawal
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoginMemberStatusCode_InScope_AsMemberStatus(Collection<CDef.MemberStatus> cdefList) {
        doSetLoginMemberStatusCode_InScope(cTStrL(cdefList));
    }

    /**
     * InScope {in ('a', 'b')}. As MemberStatus. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * status of member from entry to withdrawal <br>
     * means member that can use services <br>
     * The group elements:[Formalized, Provisional]
     */
    public void setLoginMemberStatusCode_InScope_ServiceAvailable() {
        setLoginMemberStatusCode_InScope_AsMemberStatus(CDef.MemberStatus.listOfServiceAvailable());
    }

    /**
     * InScope {in ('a', 'b')}. As MemberStatus. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * status of member from entry to withdrawal <br>
     * Members are not formalized yet <br>
     * The group elements:[Provisional]
     */
    public void setLoginMemberStatusCode_InScope_ShortOfFormalized() {
        setLoginMemberStatusCode_InScope_AsMemberStatus(CDef.MemberStatus.listOfShortOfFormalized());
    }

    protected void doSetLoginMemberStatusCode_InScope(Collection<String> loginMemberStatusCodeList) {
        regINS(CK_INS, cTL(loginMemberStatusCodeList), xgetCValueLoginMemberStatusCode(), "LOGIN_MEMBER_STATUS_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (ログイン会員ステータスコード)LOGIN_MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to member_status, classification=MemberStatus}
     * @param loginMemberStatusCodeList The collection of loginMemberStatusCode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setLoginMemberStatusCode_NotInScope(Collection<String> loginMemberStatusCodeList) {
        doSetLoginMemberStatusCode_NotInScope(loginMemberStatusCodeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As MemberStatus. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (ログイン会員ステータスコード)LOGIN_MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to member_status, classification=MemberStatus} <br>
     * status of member from entry to withdrawal
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoginMemberStatusCode_NotInScope_AsMemberStatus(Collection<CDef.MemberStatus> cdefList) {
        doSetLoginMemberStatusCode_NotInScope(cTStrL(cdefList));
    }

    protected void doSetLoginMemberStatusCode_NotInScope(Collection<String> loginMemberStatusCodeList) {
        regINS(CK_NINS, cTL(loginMemberStatusCodeList), xgetCValueLoginMemberStatusCode(), "LOGIN_MEMBER_STATUS_CODE");
    }

    protected void regLoginMemberStatusCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLoginMemberStatusCode(), "LOGIN_MEMBER_STATUS_CODE"); }
    protected abstract ConditionValue xgetCValueLoginMemberStatusCode();

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
    public HpSLCFunction<MemberLoginCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, MemberLoginCB.class);
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
    public HpSLCFunction<MemberLoginCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, MemberLoginCB.class);
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
    public HpSLCFunction<MemberLoginCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, MemberLoginCB.class);
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
    public HpSLCFunction<MemberLoginCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, MemberLoginCB.class);
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
    public HpSLCFunction<MemberLoginCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, MemberLoginCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MemberLoginCB&gt;() {
     *     public void query(MemberLoginCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MemberLoginCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, MemberLoginCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        MemberLoginCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(MemberLoginCQ sq);

    protected MemberLoginCB xcreateScalarConditionCB() {
        MemberLoginCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MemberLoginCB xcreateScalarConditionPartitionByCB() {
        MemberLoginCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MemberLoginCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MemberLoginCB cb = new MemberLoginCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "MEMBER_LOGIN_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MemberLoginCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MemberLoginCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MemberLoginCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MemberLoginCB cb = new MemberLoginCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "MEMBER_LOGIN_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MemberLoginCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MemberLoginCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MemberLoginCB cb = new MemberLoginCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MemberLoginCQ sq);

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
    protected MemberLoginCB newMyCB() {
        return new MemberLoginCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MemberLoginCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
