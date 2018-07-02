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
 * The abstract condition-query of member_following.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMemberFollowingCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMemberFollowingCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "member_following";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (会員フォローイングID)MEMBER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param memberFollowingId The value of memberFollowingId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberFollowingId_Equal(Long memberFollowingId) {
        doSetMemberFollowingId_Equal(memberFollowingId);
    }

    protected void doSetMemberFollowingId_Equal(Long memberFollowingId) {
        regMemberFollowingId(CK_EQ, memberFollowingId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (会員フォローイングID)MEMBER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param memberFollowingId The value of memberFollowingId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberFollowingId_NotEqual(Long memberFollowingId) {
        doSetMemberFollowingId_NotEqual(memberFollowingId);
    }

    protected void doSetMemberFollowingId_NotEqual(Long memberFollowingId) {
        regMemberFollowingId(CK_NES, memberFollowingId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (会員フォローイングID)MEMBER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param memberFollowingId The value of memberFollowingId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberFollowingId_GreaterThan(Long memberFollowingId) {
        regMemberFollowingId(CK_GT, memberFollowingId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (会員フォローイングID)MEMBER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param memberFollowingId The value of memberFollowingId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberFollowingId_LessThan(Long memberFollowingId) {
        regMemberFollowingId(CK_LT, memberFollowingId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (会員フォローイングID)MEMBER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param memberFollowingId The value of memberFollowingId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberFollowingId_GreaterEqual(Long memberFollowingId) {
        regMemberFollowingId(CK_GE, memberFollowingId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (会員フォローイングID)MEMBER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param memberFollowingId The value of memberFollowingId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberFollowingId_LessEqual(Long memberFollowingId) {
        regMemberFollowingId(CK_LE, memberFollowingId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (会員フォローイングID)MEMBER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of memberFollowingId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of memberFollowingId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setMemberFollowingId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setMemberFollowingId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (会員フォローイングID)MEMBER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of memberFollowingId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of memberFollowingId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setMemberFollowingId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMemberFollowingId(), "MEMBER_FOLLOWING_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (会員フォローイングID)MEMBER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param memberFollowingIdList The collection of memberFollowingId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberFollowingId_InScope(Collection<Long> memberFollowingIdList) {
        doSetMemberFollowingId_InScope(memberFollowingIdList);
    }

    protected void doSetMemberFollowingId_InScope(Collection<Long> memberFollowingIdList) {
        regINS(CK_INS, cTL(memberFollowingIdList), xgetCValueMemberFollowingId(), "MEMBER_FOLLOWING_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (会員フォローイングID)MEMBER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param memberFollowingIdList The collection of memberFollowingId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberFollowingId_NotInScope(Collection<Long> memberFollowingIdList) {
        doSetMemberFollowingId_NotInScope(memberFollowingIdList);
    }

    protected void doSetMemberFollowingId_NotInScope(Collection<Long> memberFollowingIdList) {
        regINS(CK_NINS, cTL(memberFollowingIdList), xgetCValueMemberFollowingId(), "MEMBER_FOLLOWING_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (会員フォローイングID)MEMBER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setMemberFollowingId_IsNull() { regMemberFollowingId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (会員フォローイングID)MEMBER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setMemberFollowingId_IsNotNull() { regMemberFollowingId(CK_ISNN, DOBJ); }

    protected void regMemberFollowingId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMemberFollowingId(), "MEMBER_FOLLOWING_ID"); }
    protected abstract ConditionValue xgetCValueMemberFollowingId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (わたし)MY_MEMBER_ID: {UQ+, NotNull, INT(10), FK to member}
     * @param myMemberId The value of myMemberId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMyMemberId_Equal(Integer myMemberId) {
        doSetMyMemberId_Equal(myMemberId);
    }

    protected void doSetMyMemberId_Equal(Integer myMemberId) {
        regMyMemberId(CK_EQ, myMemberId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (わたし)MY_MEMBER_ID: {UQ+, NotNull, INT(10), FK to member}
     * @param myMemberId The value of myMemberId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMyMemberId_NotEqual(Integer myMemberId) {
        doSetMyMemberId_NotEqual(myMemberId);
    }

    protected void doSetMyMemberId_NotEqual(Integer myMemberId) {
        regMyMemberId(CK_NES, myMemberId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (わたし)MY_MEMBER_ID: {UQ+, NotNull, INT(10), FK to member}
     * @param myMemberId The value of myMemberId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMyMemberId_GreaterThan(Integer myMemberId) {
        regMyMemberId(CK_GT, myMemberId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (わたし)MY_MEMBER_ID: {UQ+, NotNull, INT(10), FK to member}
     * @param myMemberId The value of myMemberId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMyMemberId_LessThan(Integer myMemberId) {
        regMyMemberId(CK_LT, myMemberId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (わたし)MY_MEMBER_ID: {UQ+, NotNull, INT(10), FK to member}
     * @param myMemberId The value of myMemberId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMyMemberId_GreaterEqual(Integer myMemberId) {
        regMyMemberId(CK_GE, myMemberId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (わたし)MY_MEMBER_ID: {UQ+, NotNull, INT(10), FK to member}
     * @param myMemberId The value of myMemberId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMyMemberId_LessEqual(Integer myMemberId) {
        regMyMemberId(CK_LE, myMemberId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (わたし)MY_MEMBER_ID: {UQ+, NotNull, INT(10), FK to member}
     * @param minNumber The min number of myMemberId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of myMemberId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setMyMemberId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setMyMemberId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (わたし)MY_MEMBER_ID: {UQ+, NotNull, INT(10), FK to member}
     * @param minNumber The min number of myMemberId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of myMemberId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setMyMemberId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMyMemberId(), "MY_MEMBER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (わたし)MY_MEMBER_ID: {UQ+, NotNull, INT(10), FK to member}
     * @param myMemberIdList The collection of myMemberId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMyMemberId_InScope(Collection<Integer> myMemberIdList) {
        doSetMyMemberId_InScope(myMemberIdList);
    }

    protected void doSetMyMemberId_InScope(Collection<Integer> myMemberIdList) {
        regINS(CK_INS, cTL(myMemberIdList), xgetCValueMyMemberId(), "MY_MEMBER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (わたし)MY_MEMBER_ID: {UQ+, NotNull, INT(10), FK to member}
     * @param myMemberIdList The collection of myMemberId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMyMemberId_NotInScope(Collection<Integer> myMemberIdList) {
        doSetMyMemberId_NotInScope(myMemberIdList);
    }

    protected void doSetMyMemberId_NotInScope(Collection<Integer> myMemberIdList) {
        regINS(CK_NINS, cTL(myMemberIdList), xgetCValueMyMemberId(), "MY_MEMBER_ID");
    }

    protected void regMyMemberId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMyMemberId(), "MY_MEMBER_ID"); }
    protected abstract ConditionValue xgetCValueMyMemberId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (あなた)YOUR_MEMBER_ID: {+UQ, IX, NotNull, INT(10), FK to member}
     * @param yourMemberId The value of yourMemberId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setYourMemberId_Equal(Integer yourMemberId) {
        doSetYourMemberId_Equal(yourMemberId);
    }

    protected void doSetYourMemberId_Equal(Integer yourMemberId) {
        regYourMemberId(CK_EQ, yourMemberId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (あなた)YOUR_MEMBER_ID: {+UQ, IX, NotNull, INT(10), FK to member}
     * @param yourMemberId The value of yourMemberId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setYourMemberId_NotEqual(Integer yourMemberId) {
        doSetYourMemberId_NotEqual(yourMemberId);
    }

    protected void doSetYourMemberId_NotEqual(Integer yourMemberId) {
        regYourMemberId(CK_NES, yourMemberId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (あなた)YOUR_MEMBER_ID: {+UQ, IX, NotNull, INT(10), FK to member}
     * @param yourMemberId The value of yourMemberId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setYourMemberId_GreaterThan(Integer yourMemberId) {
        regYourMemberId(CK_GT, yourMemberId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (あなた)YOUR_MEMBER_ID: {+UQ, IX, NotNull, INT(10), FK to member}
     * @param yourMemberId The value of yourMemberId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setYourMemberId_LessThan(Integer yourMemberId) {
        regYourMemberId(CK_LT, yourMemberId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (あなた)YOUR_MEMBER_ID: {+UQ, IX, NotNull, INT(10), FK to member}
     * @param yourMemberId The value of yourMemberId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setYourMemberId_GreaterEqual(Integer yourMemberId) {
        regYourMemberId(CK_GE, yourMemberId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (あなた)YOUR_MEMBER_ID: {+UQ, IX, NotNull, INT(10), FK to member}
     * @param yourMemberId The value of yourMemberId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setYourMemberId_LessEqual(Integer yourMemberId) {
        regYourMemberId(CK_LE, yourMemberId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (あなた)YOUR_MEMBER_ID: {+UQ, IX, NotNull, INT(10), FK to member}
     * @param minNumber The min number of yourMemberId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of yourMemberId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setYourMemberId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setYourMemberId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (あなた)YOUR_MEMBER_ID: {+UQ, IX, NotNull, INT(10), FK to member}
     * @param minNumber The min number of yourMemberId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of yourMemberId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setYourMemberId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueYourMemberId(), "YOUR_MEMBER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (あなた)YOUR_MEMBER_ID: {+UQ, IX, NotNull, INT(10), FK to member}
     * @param yourMemberIdList The collection of yourMemberId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setYourMemberId_InScope(Collection<Integer> yourMemberIdList) {
        doSetYourMemberId_InScope(yourMemberIdList);
    }

    protected void doSetYourMemberId_InScope(Collection<Integer> yourMemberIdList) {
        regINS(CK_INS, cTL(yourMemberIdList), xgetCValueYourMemberId(), "YOUR_MEMBER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (あなた)YOUR_MEMBER_ID: {+UQ, IX, NotNull, INT(10), FK to member}
     * @param yourMemberIdList The collection of yourMemberId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setYourMemberId_NotInScope(Collection<Integer> yourMemberIdList) {
        doSetYourMemberId_NotInScope(yourMemberIdList);
    }

    protected void doSetYourMemberId_NotInScope(Collection<Integer> yourMemberIdList) {
        regINS(CK_NINS, cTL(yourMemberIdList), xgetCValueYourMemberId(), "YOUR_MEMBER_ID");
    }

    protected void regYourMemberId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueYourMemberId(), "YOUR_MEMBER_ID"); }
    protected abstract ConditionValue xgetCValueYourMemberId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (その瞬間)FOLLOW_DATETIME: {IX, NotNull, DATETIME(19)}
     * @param followDatetime The value of followDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setFollowDatetime_Equal(java.time.LocalDateTime followDatetime) {
        regFollowDatetime(CK_EQ,  followDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (その瞬間)FOLLOW_DATETIME: {IX, NotNull, DATETIME(19)}
     * @param followDatetime The value of followDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFollowDatetime_GreaterThan(java.time.LocalDateTime followDatetime) {
        regFollowDatetime(CK_GT,  followDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (その瞬間)FOLLOW_DATETIME: {IX, NotNull, DATETIME(19)}
     * @param followDatetime The value of followDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFollowDatetime_LessThan(java.time.LocalDateTime followDatetime) {
        regFollowDatetime(CK_LT,  followDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (その瞬間)FOLLOW_DATETIME: {IX, NotNull, DATETIME(19)}
     * @param followDatetime The value of followDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFollowDatetime_GreaterEqual(java.time.LocalDateTime followDatetime) {
        regFollowDatetime(CK_GE,  followDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (その瞬間)FOLLOW_DATETIME: {IX, NotNull, DATETIME(19)}
     * @param followDatetime The value of followDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFollowDatetime_LessEqual(java.time.LocalDateTime followDatetime) {
        regFollowDatetime(CK_LE, followDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (その瞬間)FOLLOW_DATETIME: {IX, NotNull, DATETIME(19)}
     * <pre>e.g. setFollowDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of followDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of followDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setFollowDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setFollowDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (その瞬間)FOLLOW_DATETIME: {IX, NotNull, DATETIME(19)}
     * <pre>e.g. setFollowDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of followDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of followDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setFollowDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "FOLLOW_DATETIME"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueFollowDatetime(), nm, op);
    }

    protected void regFollowDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFollowDatetime(), "FOLLOW_DATETIME"); }
    protected abstract ConditionValue xgetCValueFollowDatetime();

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
    public HpSLCFunction<MemberFollowingCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, MemberFollowingCB.class);
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
    public HpSLCFunction<MemberFollowingCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, MemberFollowingCB.class);
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
    public HpSLCFunction<MemberFollowingCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, MemberFollowingCB.class);
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
    public HpSLCFunction<MemberFollowingCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, MemberFollowingCB.class);
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
    public HpSLCFunction<MemberFollowingCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, MemberFollowingCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MemberFollowingCB&gt;() {
     *     public void query(MemberFollowingCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MemberFollowingCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, MemberFollowingCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        MemberFollowingCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(MemberFollowingCQ sq);

    protected MemberFollowingCB xcreateScalarConditionCB() {
        MemberFollowingCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MemberFollowingCB xcreateScalarConditionPartitionByCB() {
        MemberFollowingCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MemberFollowingCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MemberFollowingCB cb = new MemberFollowingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "MEMBER_FOLLOWING_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MemberFollowingCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MemberFollowingCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MemberFollowingCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MemberFollowingCB cb = new MemberFollowingCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "MEMBER_FOLLOWING_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MemberFollowingCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MemberFollowingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MemberFollowingCB cb = new MemberFollowingCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MemberFollowingCQ sq);

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
    protected MemberFollowingCB newMyCB() {
        return new MemberFollowingCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MemberFollowingCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
