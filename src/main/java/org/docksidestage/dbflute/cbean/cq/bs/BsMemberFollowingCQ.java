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

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import org.docksidestage.dbflute.cbean.cq.ciq.*;
import org.docksidestage.dbflute.cbean.*;
import org.docksidestage.dbflute.cbean.cq.*;

/**
 * The base condition-query of member_following.
 * @author DBFlute(AutoGenerator)
 */
public class BsMemberFollowingCQ extends AbstractBsMemberFollowingCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MemberFollowingCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMemberFollowingCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from member_following) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MemberFollowingCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MemberFollowingCIQ xcreateCIQ() {
        MemberFollowingCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MemberFollowingCIQ xnewCIQ() {
        return new MemberFollowingCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join member_following on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MemberFollowingCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MemberFollowingCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _memberFollowingId;
    public ConditionValue xdfgetMemberFollowingId()
    { if (_memberFollowingId == null) { _memberFollowingId = nCV(); }
      return _memberFollowingId; }
    protected ConditionValue xgetCValueMemberFollowingId() { return xdfgetMemberFollowingId(); }

    /**
     * Add order-by as ascend. <br>
     * (会員フォローイングID)MEMBER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsMemberFollowingCQ addOrderBy_MemberFollowingId_Asc() { regOBA("MEMBER_FOLLOWING_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (会員フォローイングID)MEMBER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsMemberFollowingCQ addOrderBy_MemberFollowingId_Desc() { regOBD("MEMBER_FOLLOWING_ID"); return this; }

    protected ConditionValue _myMemberId;
    public ConditionValue xdfgetMyMemberId()
    { if (_myMemberId == null) { _myMemberId = nCV(); }
      return _myMemberId; }
    protected ConditionValue xgetCValueMyMemberId() { return xdfgetMyMemberId(); }

    /**
     * Add order-by as ascend. <br>
     * (わたし)MY_MEMBER_ID: {UQ+, NotNull, INT(10), FK to member}
     * @return this. (NotNull)
     */
    public BsMemberFollowingCQ addOrderBy_MyMemberId_Asc() { regOBA("MY_MEMBER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (わたし)MY_MEMBER_ID: {UQ+, NotNull, INT(10), FK to member}
     * @return this. (NotNull)
     */
    public BsMemberFollowingCQ addOrderBy_MyMemberId_Desc() { regOBD("MY_MEMBER_ID"); return this; }

    protected ConditionValue _yourMemberId;
    public ConditionValue xdfgetYourMemberId()
    { if (_yourMemberId == null) { _yourMemberId = nCV(); }
      return _yourMemberId; }
    protected ConditionValue xgetCValueYourMemberId() { return xdfgetYourMemberId(); }

    /**
     * Add order-by as ascend. <br>
     * (あなた)YOUR_MEMBER_ID: {+UQ, IX, NotNull, INT(10), FK to member}
     * @return this. (NotNull)
     */
    public BsMemberFollowingCQ addOrderBy_YourMemberId_Asc() { regOBA("YOUR_MEMBER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (あなた)YOUR_MEMBER_ID: {+UQ, IX, NotNull, INT(10), FK to member}
     * @return this. (NotNull)
     */
    public BsMemberFollowingCQ addOrderBy_YourMemberId_Desc() { regOBD("YOUR_MEMBER_ID"); return this; }

    protected ConditionValue _followDatetime;
    public ConditionValue xdfgetFollowDatetime()
    { if (_followDatetime == null) { _followDatetime = nCV(); }
      return _followDatetime; }
    protected ConditionValue xgetCValueFollowDatetime() { return xdfgetFollowDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * (その瞬間)FOLLOW_DATETIME: {IX, NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsMemberFollowingCQ addOrderBy_FollowDatetime_Asc() { regOBA("FOLLOW_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (その瞬間)FOLLOW_DATETIME: {IX, NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsMemberFollowingCQ addOrderBy_FollowDatetime_Desc() { regOBD("FOLLOW_DATETIME"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsMemberFollowingCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsMemberFollowingCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        MemberFollowingCQ bq = (MemberFollowingCQ)bqs;
        MemberFollowingCQ uq = (MemberFollowingCQ)uqs;
        if (bq.hasConditionQueryMemberByMyMemberId()) {
            uq.queryMemberByMyMemberId().reflectRelationOnUnionQuery(bq.queryMemberByMyMemberId(), uq.queryMemberByMyMemberId());
        }
        if (bq.hasConditionQueryMemberByYourMemberId()) {
            uq.queryMemberByYourMemberId().reflectRelationOnUnionQuery(bq.queryMemberByYourMemberId(), uq.queryMemberByYourMemberId());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * (会員)MEMBER by my MY_MEMBER_ID, named 'memberByMyMemberId'.
     * @return The instance of condition-query. (NotNull)
     */
    public MemberCQ queryMemberByMyMemberId() {
        return xdfgetConditionQueryMemberByMyMemberId();
    }
    public MemberCQ xdfgetConditionQueryMemberByMyMemberId() {
        String prop = "memberByMyMemberId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMemberByMyMemberId()); xsetupOuterJoinMemberByMyMemberId(); }
        return xgetQueRlMap(prop);
    }
    protected MemberCQ xcreateQueryMemberByMyMemberId() {
        String nrp = xresolveNRP("member_following", "memberByMyMemberId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MemberCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "memberByMyMemberId", nrp);
    }
    protected void xsetupOuterJoinMemberByMyMemberId() { xregOutJo("memberByMyMemberId"); }
    public boolean hasConditionQueryMemberByMyMemberId() { return xhasQueRlMap("memberByMyMemberId"); }

    /**
     * Get the condition-query for relation table. <br>
     * (会員)MEMBER by my YOUR_MEMBER_ID, named 'memberByYourMemberId'.
     * @return The instance of condition-query. (NotNull)
     */
    public MemberCQ queryMemberByYourMemberId() {
        return xdfgetConditionQueryMemberByYourMemberId();
    }
    public MemberCQ xdfgetConditionQueryMemberByYourMemberId() {
        String prop = "memberByYourMemberId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMemberByYourMemberId()); xsetupOuterJoinMemberByYourMemberId(); }
        return xgetQueRlMap(prop);
    }
    protected MemberCQ xcreateQueryMemberByYourMemberId() {
        String nrp = xresolveNRP("member_following", "memberByYourMemberId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MemberCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "memberByYourMemberId", nrp);
    }
    protected void xsetupOuterJoinMemberByYourMemberId() { xregOutJo("memberByYourMemberId"); }
    public boolean hasConditionQueryMemberByYourMemberId() { return xhasQueRlMap("memberByYourMemberId"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, MemberFollowingCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MemberFollowingCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MemberFollowingCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MemberFollowingCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MemberFollowingCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MemberFollowingCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MemberFollowingCQ> _myselfExistsMap;
    public Map<String, MemberFollowingCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MemberFollowingCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MemberFollowingCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MemberFollowingCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MemberFollowingCB.class.getName(); }
    protected String xCQ() { return MemberFollowingCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
