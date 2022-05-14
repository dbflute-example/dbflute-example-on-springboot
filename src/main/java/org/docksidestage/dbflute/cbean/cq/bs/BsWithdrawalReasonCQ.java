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
 * The base condition-query of withdrawal_reason.
 * @author DBFlute(AutoGenerator)
 */
public class BsWithdrawalReasonCQ extends AbstractBsWithdrawalReasonCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WithdrawalReasonCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWithdrawalReasonCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from withdrawal_reason) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WithdrawalReasonCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WithdrawalReasonCIQ xcreateCIQ() {
        WithdrawalReasonCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WithdrawalReasonCIQ xnewCIQ() {
        return new WithdrawalReasonCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join withdrawal_reason on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WithdrawalReasonCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WithdrawalReasonCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _withdrawalReasonCode;
    public ConditionValue xdfgetWithdrawalReasonCode()
    { if (_withdrawalReasonCode == null) { _withdrawalReasonCode = nCV(); }
      return _withdrawalReasonCode; }
    protected ConditionValue xgetCValueWithdrawalReasonCode() { return xdfgetWithdrawalReasonCode(); }

    public Map<String, MemberWithdrawalCQ> xdfgetWithdrawalReasonCode_ExistsReferrer_MemberWithdrawalList() { return xgetSQueMap("withdrawalReasonCode_ExistsReferrer_MemberWithdrawalList"); }
    public String keepWithdrawalReasonCode_ExistsReferrer_MemberWithdrawalList(MemberWithdrawalCQ sq) { return xkeepSQue("withdrawalReasonCode_ExistsReferrer_MemberWithdrawalList", sq); }

    public Map<String, MemberWithdrawalCQ> xdfgetWithdrawalReasonCode_NotExistsReferrer_MemberWithdrawalList() { return xgetSQueMap("withdrawalReasonCode_NotExistsReferrer_MemberWithdrawalList"); }
    public String keepWithdrawalReasonCode_NotExistsReferrer_MemberWithdrawalList(MemberWithdrawalCQ sq) { return xkeepSQue("withdrawalReasonCode_NotExistsReferrer_MemberWithdrawalList", sq); }

    public Map<String, MemberWithdrawalCQ> xdfgetWithdrawalReasonCode_SpecifyDerivedReferrer_MemberWithdrawalList() { return xgetSQueMap("withdrawalReasonCode_SpecifyDerivedReferrer_MemberWithdrawalList"); }
    public String keepWithdrawalReasonCode_SpecifyDerivedReferrer_MemberWithdrawalList(MemberWithdrawalCQ sq) { return xkeepSQue("withdrawalReasonCode_SpecifyDerivedReferrer_MemberWithdrawalList", sq); }

    public Map<String, MemberWithdrawalCQ> xdfgetWithdrawalReasonCode_QueryDerivedReferrer_MemberWithdrawalList() { return xgetSQueMap("withdrawalReasonCode_QueryDerivedReferrer_MemberWithdrawalList"); }
    public String keepWithdrawalReasonCode_QueryDerivedReferrer_MemberWithdrawalList(MemberWithdrawalCQ sq) { return xkeepSQue("withdrawalReasonCode_QueryDerivedReferrer_MemberWithdrawalList", sq); }
    public Map<String, Object> xdfgetWithdrawalReasonCode_QueryDerivedReferrer_MemberWithdrawalListParameter() { return xgetSQuePmMap("withdrawalReasonCode_QueryDerivedReferrer_MemberWithdrawalList"); }
    public String keepWithdrawalReasonCode_QueryDerivedReferrer_MemberWithdrawalListParameter(Object pm) { return xkeepSQuePm("withdrawalReasonCode_QueryDerivedReferrer_MemberWithdrawalList", pm); }

    /**
     * Add order-by as ascend. <br>
     * (退会理由コード)WITHDRAWAL_REASON_CODE: {PK, NotNull, CHAR(3), classification=WithdrawalReason}
     * @return this. (NotNull)
     */
    public BsWithdrawalReasonCQ addOrderBy_WithdrawalReasonCode_Asc() { regOBA("WITHDRAWAL_REASON_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * (退会理由コード)WITHDRAWAL_REASON_CODE: {PK, NotNull, CHAR(3), classification=WithdrawalReason}
     * @return this. (NotNull)
     */
    public BsWithdrawalReasonCQ addOrderBy_WithdrawalReasonCode_Desc() { regOBD("WITHDRAWAL_REASON_CODE"); return this; }

    protected ConditionValue _withdrawalReasonText;
    public ConditionValue xdfgetWithdrawalReasonText()
    { if (_withdrawalReasonText == null) { _withdrawalReasonText = nCV(); }
      return _withdrawalReasonText; }
    protected ConditionValue xgetCValueWithdrawalReasonText() { return xdfgetWithdrawalReasonText(); }

    protected ConditionValue _displayOrder;
    public ConditionValue xdfgetDisplayOrder()
    { if (_displayOrder == null) { _displayOrder = nCV(); }
      return _displayOrder; }
    protected ConditionValue xgetCValueDisplayOrder() { return xdfgetDisplayOrder(); }

    /**
     * Add order-by as ascend. <br>
     * (表示順)DISPLAY_ORDER: {UQ, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWithdrawalReasonCQ addOrderBy_DisplayOrder_Asc() { regOBA("DISPLAY_ORDER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (表示順)DISPLAY_ORDER: {UQ, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWithdrawalReasonCQ addOrderBy_DisplayOrder_Desc() { regOBD("DISPLAY_ORDER"); return this; }

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
    public BsWithdrawalReasonCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWithdrawalReasonCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, WithdrawalReasonCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WithdrawalReasonCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WithdrawalReasonCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WithdrawalReasonCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WithdrawalReasonCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WithdrawalReasonCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WithdrawalReasonCQ> _myselfExistsMap;
    public Map<String, WithdrawalReasonCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WithdrawalReasonCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WithdrawalReasonCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WithdrawalReasonCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WithdrawalReasonCB.class.getName(); }
    protected String xCQ() { return WithdrawalReasonCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
