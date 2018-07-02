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
 * The base condition-query of product_category.
 * @author DBFlute(AutoGenerator)
 */
public class BsProductCategoryCQ extends AbstractBsProductCategoryCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ProductCategoryCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsProductCategoryCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from product_category) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public ProductCategoryCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected ProductCategoryCIQ xcreateCIQ() {
        ProductCategoryCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected ProductCategoryCIQ xnewCIQ() {
        return new ProductCategoryCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join product_category on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public ProductCategoryCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        ProductCategoryCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _productCategoryCode;
    public ConditionValue xdfgetProductCategoryCode()
    { if (_productCategoryCode == null) { _productCategoryCode = nCV(); }
      return _productCategoryCode; }
    protected ConditionValue xgetCValueProductCategoryCode() { return xdfgetProductCategoryCode(); }

    public Map<String, ProductCQ> xdfgetProductCategoryCode_ExistsReferrer_ProductList() { return xgetSQueMap("productCategoryCode_ExistsReferrer_ProductList"); }
    public String keepProductCategoryCode_ExistsReferrer_ProductList(ProductCQ sq) { return xkeepSQue("productCategoryCode_ExistsReferrer_ProductList", sq); }

    public Map<String, ProductCategoryCQ> xdfgetProductCategoryCode_ExistsReferrer_ProductCategorySelfList() { return xgetSQueMap("productCategoryCode_ExistsReferrer_ProductCategorySelfList"); }
    public String keepProductCategoryCode_ExistsReferrer_ProductCategorySelfList(ProductCategoryCQ sq) { return xkeepSQue("productCategoryCode_ExistsReferrer_ProductCategorySelfList", sq); }

    public Map<String, ProductCQ> xdfgetProductCategoryCode_NotExistsReferrer_ProductList() { return xgetSQueMap("productCategoryCode_NotExistsReferrer_ProductList"); }
    public String keepProductCategoryCode_NotExistsReferrer_ProductList(ProductCQ sq) { return xkeepSQue("productCategoryCode_NotExistsReferrer_ProductList", sq); }

    public Map<String, ProductCategoryCQ> xdfgetProductCategoryCode_NotExistsReferrer_ProductCategorySelfList() { return xgetSQueMap("productCategoryCode_NotExistsReferrer_ProductCategorySelfList"); }
    public String keepProductCategoryCode_NotExistsReferrer_ProductCategorySelfList(ProductCategoryCQ sq) { return xkeepSQue("productCategoryCode_NotExistsReferrer_ProductCategorySelfList", sq); }

    public Map<String, ProductCQ> xdfgetProductCategoryCode_SpecifyDerivedReferrer_ProductList() { return xgetSQueMap("productCategoryCode_SpecifyDerivedReferrer_ProductList"); }
    public String keepProductCategoryCode_SpecifyDerivedReferrer_ProductList(ProductCQ sq) { return xkeepSQue("productCategoryCode_SpecifyDerivedReferrer_ProductList", sq); }

    public Map<String, ProductCategoryCQ> xdfgetProductCategoryCode_SpecifyDerivedReferrer_ProductCategorySelfList() { return xgetSQueMap("productCategoryCode_SpecifyDerivedReferrer_ProductCategorySelfList"); }
    public String keepProductCategoryCode_SpecifyDerivedReferrer_ProductCategorySelfList(ProductCategoryCQ sq) { return xkeepSQue("productCategoryCode_SpecifyDerivedReferrer_ProductCategorySelfList", sq); }

    public Map<String, ProductCQ> xdfgetProductCategoryCode_QueryDerivedReferrer_ProductList() { return xgetSQueMap("productCategoryCode_QueryDerivedReferrer_ProductList"); }
    public String keepProductCategoryCode_QueryDerivedReferrer_ProductList(ProductCQ sq) { return xkeepSQue("productCategoryCode_QueryDerivedReferrer_ProductList", sq); }
    public Map<String, Object> xdfgetProductCategoryCode_QueryDerivedReferrer_ProductListParameter() { return xgetSQuePmMap("productCategoryCode_QueryDerivedReferrer_ProductList"); }
    public String keepProductCategoryCode_QueryDerivedReferrer_ProductListParameter(Object pm) { return xkeepSQuePm("productCategoryCode_QueryDerivedReferrer_ProductList", pm); }

    public Map<String, ProductCategoryCQ> xdfgetProductCategoryCode_QueryDerivedReferrer_ProductCategorySelfList() { return xgetSQueMap("productCategoryCode_QueryDerivedReferrer_ProductCategorySelfList"); }
    public String keepProductCategoryCode_QueryDerivedReferrer_ProductCategorySelfList(ProductCategoryCQ sq) { return xkeepSQue("productCategoryCode_QueryDerivedReferrer_ProductCategorySelfList", sq); }
    public Map<String, Object> xdfgetProductCategoryCode_QueryDerivedReferrer_ProductCategorySelfListParameter() { return xgetSQuePmMap("productCategoryCode_QueryDerivedReferrer_ProductCategorySelfList"); }
    public String keepProductCategoryCode_QueryDerivedReferrer_ProductCategorySelfListParameter(Object pm) { return xkeepSQuePm("productCategoryCode_QueryDerivedReferrer_ProductCategorySelfList", pm); }

    /**
     * Add order-by as ascend. <br>
     * (商品カテゴリコード)PRODUCT_CATEGORY_CODE: {PK, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsProductCategoryCQ addOrderBy_ProductCategoryCode_Asc() { regOBA("PRODUCT_CATEGORY_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * (商品カテゴリコード)PRODUCT_CATEGORY_CODE: {PK, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsProductCategoryCQ addOrderBy_ProductCategoryCode_Desc() { regOBD("PRODUCT_CATEGORY_CODE"); return this; }

    protected ConditionValue _productCategoryName;
    public ConditionValue xdfgetProductCategoryName()
    { if (_productCategoryName == null) { _productCategoryName = nCV(); }
      return _productCategoryName; }
    protected ConditionValue xgetCValueProductCategoryName() { return xdfgetProductCategoryName(); }

    /**
     * Add order-by as ascend. <br>
     * (商品カテゴリ名称)PRODUCT_CATEGORY_NAME: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsProductCategoryCQ addOrderBy_ProductCategoryName_Asc() { regOBA("PRODUCT_CATEGORY_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (商品カテゴリ名称)PRODUCT_CATEGORY_NAME: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsProductCategoryCQ addOrderBy_ProductCategoryName_Desc() { regOBD("PRODUCT_CATEGORY_NAME"); return this; }

    protected ConditionValue _parentCategoryCode;
    public ConditionValue xdfgetParentCategoryCode()
    { if (_parentCategoryCode == null) { _parentCategoryCode = nCV(); }
      return _parentCategoryCode; }
    protected ConditionValue xgetCValueParentCategoryCode() { return xdfgetParentCategoryCode(); }

    /**
     * Add order-by as ascend. <br>
     * (親カテゴリコード)PARENT_CATEGORY_CODE: {IX, CHAR(3), FK to product_category}
     * @return this. (NotNull)
     */
    public BsProductCategoryCQ addOrderBy_ParentCategoryCode_Asc() { regOBA("PARENT_CATEGORY_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * (親カテゴリコード)PARENT_CATEGORY_CODE: {IX, CHAR(3), FK to product_category}
     * @return this. (NotNull)
     */
    public BsProductCategoryCQ addOrderBy_ParentCategoryCode_Desc() { regOBD("PARENT_CATEGORY_CODE"); return this; }

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
    public BsProductCategoryCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsProductCategoryCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        ProductCategoryCQ bq = (ProductCategoryCQ)bqs;
        ProductCategoryCQ uq = (ProductCategoryCQ)uqs;
        if (bq.hasConditionQueryProductCategorySelf()) {
            uq.queryProductCategorySelf().reflectRelationOnUnionQuery(bq.queryProductCategorySelf(), uq.queryProductCategorySelf());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * (商品カテゴリ)PRODUCT_CATEGORY by my PARENT_CATEGORY_CODE, named 'productCategorySelf'.
     * @return The instance of condition-query. (NotNull)
     */
    public ProductCategoryCQ queryProductCategorySelf() {
        return xdfgetConditionQueryProductCategorySelf();
    }
    public ProductCategoryCQ xdfgetConditionQueryProductCategorySelf() {
        String prop = "productCategorySelf";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryProductCategorySelf()); xsetupOuterJoinProductCategorySelf(); }
        return xgetQueRlMap(prop);
    }
    protected ProductCategoryCQ xcreateQueryProductCategorySelf() {
        String nrp = xresolveNRP("product_category", "productCategorySelf"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new ProductCategoryCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "productCategorySelf", nrp);
    }
    protected void xsetupOuterJoinProductCategorySelf() { xregOutJo("productCategorySelf"); }
    public boolean hasConditionQueryProductCategorySelf() { return xhasQueRlMap("productCategorySelf"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, ProductCategoryCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(ProductCategoryCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, ProductCategoryCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(ProductCategoryCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, ProductCategoryCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(ProductCategoryCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, ProductCategoryCQ> _myselfExistsMap;
    public Map<String, ProductCategoryCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(ProductCategoryCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, ProductCategoryCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(ProductCategoryCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return ProductCategoryCB.class.getName(); }
    protected String xCQ() { return ProductCategoryCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
