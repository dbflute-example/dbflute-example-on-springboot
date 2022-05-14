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
 * The base condition-query of region.
 * @author DBFlute(AutoGenerator)
 */
public class BsRegionCQ extends AbstractBsRegionCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected RegionCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsRegionCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from region) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public RegionCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected RegionCIQ xcreateCIQ() {
        RegionCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected RegionCIQ xnewCIQ() {
        return new RegionCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join region on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public RegionCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        RegionCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _regionId;
    public ConditionValue xdfgetRegionId()
    { if (_regionId == null) { _regionId = nCV(); }
      return _regionId; }
    protected ConditionValue xgetCValueRegionId() { return xdfgetRegionId(); }

    public Map<String, MemberAddressCQ> xdfgetRegionId_ExistsReferrer_MemberAddressList() { return xgetSQueMap("regionId_ExistsReferrer_MemberAddressList"); }
    public String keepRegionId_ExistsReferrer_MemberAddressList(MemberAddressCQ sq) { return xkeepSQue("regionId_ExistsReferrer_MemberAddressList", sq); }

    public Map<String, MemberAddressCQ> xdfgetRegionId_NotExistsReferrer_MemberAddressList() { return xgetSQueMap("regionId_NotExistsReferrer_MemberAddressList"); }
    public String keepRegionId_NotExistsReferrer_MemberAddressList(MemberAddressCQ sq) { return xkeepSQue("regionId_NotExistsReferrer_MemberAddressList", sq); }

    public Map<String, MemberAddressCQ> xdfgetRegionId_SpecifyDerivedReferrer_MemberAddressList() { return xgetSQueMap("regionId_SpecifyDerivedReferrer_MemberAddressList"); }
    public String keepRegionId_SpecifyDerivedReferrer_MemberAddressList(MemberAddressCQ sq) { return xkeepSQue("regionId_SpecifyDerivedReferrer_MemberAddressList", sq); }

    public Map<String, MemberAddressCQ> xdfgetRegionId_QueryDerivedReferrer_MemberAddressList() { return xgetSQueMap("regionId_QueryDerivedReferrer_MemberAddressList"); }
    public String keepRegionId_QueryDerivedReferrer_MemberAddressList(MemberAddressCQ sq) { return xkeepSQue("regionId_QueryDerivedReferrer_MemberAddressList", sq); }
    public Map<String, Object> xdfgetRegionId_QueryDerivedReferrer_MemberAddressListParameter() { return xgetSQuePmMap("regionId_QueryDerivedReferrer_MemberAddressList"); }
    public String keepRegionId_QueryDerivedReferrer_MemberAddressListParameter(Object pm) { return xkeepSQuePm("regionId_QueryDerivedReferrer_MemberAddressList", pm); }

    /**
     * Add order-by as ascend. <br>
     * (地域ID)REGION_ID: {PK, NotNull, INT(10), classification=Region}
     * @return this. (NotNull)
     */
    public BsRegionCQ addOrderBy_RegionId_Asc() { regOBA("REGION_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (地域ID)REGION_ID: {PK, NotNull, INT(10), classification=Region}
     * @return this. (NotNull)
     */
    public BsRegionCQ addOrderBy_RegionId_Desc() { regOBD("REGION_ID"); return this; }

    protected ConditionValue _regionName;
    public ConditionValue xdfgetRegionName()
    { if (_regionName == null) { _regionName = nCV(); }
      return _regionName; }
    protected ConditionValue xgetCValueRegionName() { return xdfgetRegionName(); }

    /**
     * Add order-by as ascend. <br>
     * (地域名称)REGION_NAME: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsRegionCQ addOrderBy_RegionName_Asc() { regOBA("REGION_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (地域名称)REGION_NAME: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsRegionCQ addOrderBy_RegionName_Desc() { regOBD("REGION_NAME"); return this; }

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
    public BsRegionCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsRegionCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, RegionCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(RegionCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, RegionCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(RegionCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, RegionCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(RegionCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, RegionCQ> _myselfExistsMap;
    public Map<String, RegionCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(RegionCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, RegionCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(RegionCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return RegionCB.class.getName(); }
    protected String xCQ() { return RegionCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
