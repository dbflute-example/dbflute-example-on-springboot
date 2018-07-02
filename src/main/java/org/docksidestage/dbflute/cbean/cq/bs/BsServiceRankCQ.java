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
 * The base condition-query of service_rank.
 * @author DBFlute(AutoGenerator)
 */
public class BsServiceRankCQ extends AbstractBsServiceRankCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ServiceRankCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsServiceRankCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from service_rank) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public ServiceRankCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected ServiceRankCIQ xcreateCIQ() {
        ServiceRankCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected ServiceRankCIQ xnewCIQ() {
        return new ServiceRankCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join service_rank on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public ServiceRankCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        ServiceRankCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _serviceRankCode;
    public ConditionValue xdfgetServiceRankCode()
    { if (_serviceRankCode == null) { _serviceRankCode = nCV(); }
      return _serviceRankCode; }
    protected ConditionValue xgetCValueServiceRankCode() { return xdfgetServiceRankCode(); }

    public Map<String, MemberServiceCQ> xdfgetServiceRankCode_ExistsReferrer_MemberServiceList() { return xgetSQueMap("serviceRankCode_ExistsReferrer_MemberServiceList"); }
    public String keepServiceRankCode_ExistsReferrer_MemberServiceList(MemberServiceCQ sq) { return xkeepSQue("serviceRankCode_ExistsReferrer_MemberServiceList", sq); }

    public Map<String, MemberServiceCQ> xdfgetServiceRankCode_NotExistsReferrer_MemberServiceList() { return xgetSQueMap("serviceRankCode_NotExistsReferrer_MemberServiceList"); }
    public String keepServiceRankCode_NotExistsReferrer_MemberServiceList(MemberServiceCQ sq) { return xkeepSQue("serviceRankCode_NotExistsReferrer_MemberServiceList", sq); }

    public Map<String, MemberServiceCQ> xdfgetServiceRankCode_SpecifyDerivedReferrer_MemberServiceList() { return xgetSQueMap("serviceRankCode_SpecifyDerivedReferrer_MemberServiceList"); }
    public String keepServiceRankCode_SpecifyDerivedReferrer_MemberServiceList(MemberServiceCQ sq) { return xkeepSQue("serviceRankCode_SpecifyDerivedReferrer_MemberServiceList", sq); }

    public Map<String, MemberServiceCQ> xdfgetServiceRankCode_QueryDerivedReferrer_MemberServiceList() { return xgetSQueMap("serviceRankCode_QueryDerivedReferrer_MemberServiceList"); }
    public String keepServiceRankCode_QueryDerivedReferrer_MemberServiceList(MemberServiceCQ sq) { return xkeepSQue("serviceRankCode_QueryDerivedReferrer_MemberServiceList", sq); }
    public Map<String, Object> xdfgetServiceRankCode_QueryDerivedReferrer_MemberServiceListParameter() { return xgetSQuePmMap("serviceRankCode_QueryDerivedReferrer_MemberServiceList"); }
    public String keepServiceRankCode_QueryDerivedReferrer_MemberServiceListParameter(Object pm) { return xkeepSQuePm("serviceRankCode_QueryDerivedReferrer_MemberServiceList", pm); }

    /**
     * Add order-by as ascend. <br>
     * (サービスランクコード)SERVICE_RANK_CODE: {PK, NotNull, CHAR(3), classification=ServiceRank}
     * @return this. (NotNull)
     */
    public BsServiceRankCQ addOrderBy_ServiceRankCode_Asc() { regOBA("SERVICE_RANK_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * (サービスランクコード)SERVICE_RANK_CODE: {PK, NotNull, CHAR(3), classification=ServiceRank}
     * @return this. (NotNull)
     */
    public BsServiceRankCQ addOrderBy_ServiceRankCode_Desc() { regOBD("SERVICE_RANK_CODE"); return this; }

    protected ConditionValue _serviceRankName;
    public ConditionValue xdfgetServiceRankName()
    { if (_serviceRankName == null) { _serviceRankName = nCV(); }
      return _serviceRankName; }
    protected ConditionValue xgetCValueServiceRankName() { return xdfgetServiceRankName(); }

    /**
     * Add order-by as ascend. <br>
     * (サービスランク名称)SERVICE_RANK_NAME: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsServiceRankCQ addOrderBy_ServiceRankName_Asc() { regOBA("SERVICE_RANK_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (サービスランク名称)SERVICE_RANK_NAME: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsServiceRankCQ addOrderBy_ServiceRankName_Desc() { regOBD("SERVICE_RANK_NAME"); return this; }

    protected ConditionValue _servicePointIncidence;
    public ConditionValue xdfgetServicePointIncidence()
    { if (_servicePointIncidence == null) { _servicePointIncidence = nCV(); }
      return _servicePointIncidence; }
    protected ConditionValue xgetCValueServicePointIncidence() { return xdfgetServicePointIncidence(); }

    /**
     * Add order-by as ascend. <br>
     * (サービスポイント発生率)SERVICE_POINT_INCIDENCE: {NotNull, DECIMAL(5, 3)}
     * @return this. (NotNull)
     */
    public BsServiceRankCQ addOrderBy_ServicePointIncidence_Asc() { regOBA("SERVICE_POINT_INCIDENCE"); return this; }

    /**
     * Add order-by as descend. <br>
     * (サービスポイント発生率)SERVICE_POINT_INCIDENCE: {NotNull, DECIMAL(5, 3)}
     * @return this. (NotNull)
     */
    public BsServiceRankCQ addOrderBy_ServicePointIncidence_Desc() { regOBD("SERVICE_POINT_INCIDENCE"); return this; }

    protected ConditionValue _newAcceptableFlg;
    public ConditionValue xdfgetNewAcceptableFlg()
    { if (_newAcceptableFlg == null) { _newAcceptableFlg = nCV(); }
      return _newAcceptableFlg; }
    protected ConditionValue xgetCValueNewAcceptableFlg() { return xdfgetNewAcceptableFlg(); }

    /**
     * Add order-by as ascend. <br>
     * (新規受け入れ可能フラグ)NEW_ACCEPTABLE_FLG: {NotNull, INT(10), classification=Flg}
     * @return this. (NotNull)
     */
    public BsServiceRankCQ addOrderBy_NewAcceptableFlg_Asc() { regOBA("NEW_ACCEPTABLE_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * (新規受け入れ可能フラグ)NEW_ACCEPTABLE_FLG: {NotNull, INT(10), classification=Flg}
     * @return this. (NotNull)
     */
    public BsServiceRankCQ addOrderBy_NewAcceptableFlg_Desc() { regOBD("NEW_ACCEPTABLE_FLG"); return this; }

    protected ConditionValue _description;
    public ConditionValue xdfgetDescription()
    { if (_description == null) { _description = nCV(); }
      return _description; }
    protected ConditionValue xgetCValueDescription() { return xdfgetDescription(); }

    /**
     * Add order-by as ascend. <br>
     * (説明)DESCRIPTION: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsServiceRankCQ addOrderBy_Description_Asc() { regOBA("DESCRIPTION"); return this; }

    /**
     * Add order-by as descend. <br>
     * (説明)DESCRIPTION: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsServiceRankCQ addOrderBy_Description_Desc() { regOBD("DESCRIPTION"); return this; }

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
    public BsServiceRankCQ addOrderBy_DisplayOrder_Asc() { regOBA("DISPLAY_ORDER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (表示順)DISPLAY_ORDER: {UQ, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsServiceRankCQ addOrderBy_DisplayOrder_Desc() { regOBD("DISPLAY_ORDER"); return this; }

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
    public BsServiceRankCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsServiceRankCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, ServiceRankCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(ServiceRankCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, ServiceRankCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(ServiceRankCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, ServiceRankCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(ServiceRankCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, ServiceRankCQ> _myselfExistsMap;
    public Map<String, ServiceRankCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(ServiceRankCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, ServiceRankCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(ServiceRankCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return ServiceRankCB.class.getName(); }
    protected String xCQ() { return ServiceRankCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
