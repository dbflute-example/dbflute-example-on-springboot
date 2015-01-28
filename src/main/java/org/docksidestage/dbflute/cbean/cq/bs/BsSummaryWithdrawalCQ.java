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
 * The base condition-query of SUMMARY_WITHDRAWAL.
 * @author DBFlute(AutoGenerator)
 */
public class BsSummaryWithdrawalCQ extends AbstractBsSummaryWithdrawalCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected SummaryWithdrawalCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSummaryWithdrawalCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from SUMMARY_WITHDRAWAL) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public SummaryWithdrawalCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected SummaryWithdrawalCIQ xcreateCIQ() {
        SummaryWithdrawalCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected SummaryWithdrawalCIQ xnewCIQ() {
        return new SummaryWithdrawalCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join SUMMARY_WITHDRAWAL on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public SummaryWithdrawalCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        SummaryWithdrawalCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _memberId;
    public ConditionValue xdfgetMemberId()
    { if (_memberId == null) { _memberId = nCV(); }
      return _memberId; }
    protected ConditionValue xgetCValueMemberId() { return xdfgetMemberId(); }

    /** 
     * Add order-by as ascend. <br>
     * MEMBER_ID: {INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsSummaryWithdrawalCQ addOrderBy_MemberId_Asc() { regOBA("MEMBER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * MEMBER_ID: {INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsSummaryWithdrawalCQ addOrderBy_MemberId_Desc() { regOBD("MEMBER_ID"); return this; }

    protected ConditionValue _memberName;
    public ConditionValue xdfgetMemberName()
    { if (_memberName == null) { _memberName = nCV(); }
      return _memberName; }
    protected ConditionValue xgetCValueMemberName() { return xdfgetMemberName(); }

    /** 
     * Add order-by as ascend. <br>
     * MEMBER_NAME: {VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsSummaryWithdrawalCQ addOrderBy_MemberName_Asc() { regOBA("MEMBER_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * MEMBER_NAME: {VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsSummaryWithdrawalCQ addOrderBy_MemberName_Desc() { regOBD("MEMBER_NAME"); return this; }

    protected ConditionValue _withdrawalReasonCode;
    public ConditionValue xdfgetWithdrawalReasonCode()
    { if (_withdrawalReasonCode == null) { _withdrawalReasonCode = nCV(); }
      return _withdrawalReasonCode; }
    protected ConditionValue xgetCValueWithdrawalReasonCode() { return xdfgetWithdrawalReasonCode(); }

    /** 
     * Add order-by as ascend. <br>
     * WITHDRAWAL_REASON_CODE: {CHAR(3)}
     * @return this. (NotNull)
     */
    public BsSummaryWithdrawalCQ addOrderBy_WithdrawalReasonCode_Asc() { regOBA("WITHDRAWAL_REASON_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * WITHDRAWAL_REASON_CODE: {CHAR(3)}
     * @return this. (NotNull)
     */
    public BsSummaryWithdrawalCQ addOrderBy_WithdrawalReasonCode_Desc() { regOBD("WITHDRAWAL_REASON_CODE"); return this; }

    protected ConditionValue _withdrawalReasonText;
    public ConditionValue xdfgetWithdrawalReasonText()
    { if (_withdrawalReasonText == null) { _withdrawalReasonText = nCV(); }
      return _withdrawalReasonText; }
    protected ConditionValue xgetCValueWithdrawalReasonText() { return xdfgetWithdrawalReasonText(); }

    /** 
     * Add order-by as ascend. <br>
     * WITHDRAWAL_REASON_TEXT: {CLOB(2147483647)}
     * @return this. (NotNull)
     */
    public BsSummaryWithdrawalCQ addOrderBy_WithdrawalReasonText_Asc() { regOBA("WITHDRAWAL_REASON_TEXT"); return this; }

    /**
     * Add order-by as descend. <br>
     * WITHDRAWAL_REASON_TEXT: {CLOB(2147483647)}
     * @return this. (NotNull)
     */
    public BsSummaryWithdrawalCQ addOrderBy_WithdrawalReasonText_Desc() { regOBD("WITHDRAWAL_REASON_TEXT"); return this; }

    protected ConditionValue _withdrawalReasonInputText;
    public ConditionValue xdfgetWithdrawalReasonInputText()
    { if (_withdrawalReasonInputText == null) { _withdrawalReasonInputText = nCV(); }
      return _withdrawalReasonInputText; }
    protected ConditionValue xgetCValueWithdrawalReasonInputText() { return xdfgetWithdrawalReasonInputText(); }

    /** 
     * Add order-by as ascend. <br>
     * WITHDRAWAL_REASON_INPUT_TEXT: {CLOB(2147483647)}
     * @return this. (NotNull)
     */
    public BsSummaryWithdrawalCQ addOrderBy_WithdrawalReasonInputText_Asc() { regOBA("WITHDRAWAL_REASON_INPUT_TEXT"); return this; }

    /**
     * Add order-by as descend. <br>
     * WITHDRAWAL_REASON_INPUT_TEXT: {CLOB(2147483647)}
     * @return this. (NotNull)
     */
    public BsSummaryWithdrawalCQ addOrderBy_WithdrawalReasonInputText_Desc() { regOBD("WITHDRAWAL_REASON_INPUT_TEXT"); return this; }

    protected ConditionValue _withdrawalDatetime;
    public ConditionValue xdfgetWithdrawalDatetime()
    { if (_withdrawalDatetime == null) { _withdrawalDatetime = nCV(); }
      return _withdrawalDatetime; }
    protected ConditionValue xgetCValueWithdrawalDatetime() { return xdfgetWithdrawalDatetime(); }

    /** 
     * Add order-by as ascend. <br>
     * WITHDRAWAL_DATETIME: {TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public BsSummaryWithdrawalCQ addOrderBy_WithdrawalDatetime_Asc() { regOBA("WITHDRAWAL_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * WITHDRAWAL_DATETIME: {TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public BsSummaryWithdrawalCQ addOrderBy_WithdrawalDatetime_Desc() { regOBD("WITHDRAWAL_DATETIME"); return this; }

    protected ConditionValue _memberStatusCode;
    public ConditionValue xdfgetMemberStatusCode()
    { if (_memberStatusCode == null) { _memberStatusCode = nCV(); }
      return _memberStatusCode; }
    protected ConditionValue xgetCValueMemberStatusCode() { return xdfgetMemberStatusCode(); }

    /** 
     * Add order-by as ascend. <br>
     * MEMBER_STATUS_CODE: {CHAR(3)}
     * @return this. (NotNull)
     */
    public BsSummaryWithdrawalCQ addOrderBy_MemberStatusCode_Asc() { regOBA("MEMBER_STATUS_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * MEMBER_STATUS_CODE: {CHAR(3)}
     * @return this. (NotNull)
     */
    public BsSummaryWithdrawalCQ addOrderBy_MemberStatusCode_Desc() { regOBD("MEMBER_STATUS_CODE"); return this; }

    protected ConditionValue _memberStatusName;
    public ConditionValue xdfgetMemberStatusName()
    { if (_memberStatusName == null) { _memberStatusName = nCV(); }
      return _memberStatusName; }
    protected ConditionValue xgetCValueMemberStatusName() { return xdfgetMemberStatusName(); }

    /** 
     * Add order-by as ascend. <br>
     * MEMBER_STATUS_NAME: {VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsSummaryWithdrawalCQ addOrderBy_MemberStatusName_Asc() { regOBA("MEMBER_STATUS_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * MEMBER_STATUS_NAME: {VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsSummaryWithdrawalCQ addOrderBy_MemberStatusName_Desc() { regOBD("MEMBER_STATUS_NAME"); return this; }

    protected ConditionValue _maxPurchasePrice;
    public ConditionValue xdfgetMaxPurchasePrice()
    { if (_maxPurchasePrice == null) { _maxPurchasePrice = nCV(); }
      return _maxPurchasePrice; }
    protected ConditionValue xgetCValueMaxPurchasePrice() { return xdfgetMaxPurchasePrice(); }

    /** 
     * Add order-by as ascend. <br>
     * MAX_PURCHASE_PRICE: {INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsSummaryWithdrawalCQ addOrderBy_MaxPurchasePrice_Asc() { regOBA("MAX_PURCHASE_PRICE"); return this; }

    /**
     * Add order-by as descend. <br>
     * MAX_PURCHASE_PRICE: {INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsSummaryWithdrawalCQ addOrderBy_MaxPurchasePrice_Desc() { regOBD("MAX_PURCHASE_PRICE"); return this; }

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
    public BsSummaryWithdrawalCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsSummaryWithdrawalCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, SummaryWithdrawalCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(SummaryWithdrawalCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return SummaryWithdrawalCB.class.getName(); }
    protected String xCQ() { return SummaryWithdrawalCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
