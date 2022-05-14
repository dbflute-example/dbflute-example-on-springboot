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
 * The base condition-query of product.
 * @author DBFlute(AutoGenerator)
 */
public class BsProductCQ extends AbstractBsProductCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ProductCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsProductCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from product) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public ProductCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected ProductCIQ xcreateCIQ() {
        ProductCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected ProductCIQ xnewCIQ() {
        return new ProductCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join product on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public ProductCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        ProductCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _productId;
    public ConditionValue xdfgetProductId()
    { if (_productId == null) { _productId = nCV(); }
      return _productId; }
    protected ConditionValue xgetCValueProductId() { return xdfgetProductId(); }

    public Map<String, PurchaseCQ> xdfgetProductId_ExistsReferrer_PurchaseList() { return xgetSQueMap("productId_ExistsReferrer_PurchaseList"); }
    public String keepProductId_ExistsReferrer_PurchaseList(PurchaseCQ sq) { return xkeepSQue("productId_ExistsReferrer_PurchaseList", sq); }

    public Map<String, PurchaseCQ> xdfgetProductId_NotExistsReferrer_PurchaseList() { return xgetSQueMap("productId_NotExistsReferrer_PurchaseList"); }
    public String keepProductId_NotExistsReferrer_PurchaseList(PurchaseCQ sq) { return xkeepSQue("productId_NotExistsReferrer_PurchaseList", sq); }

    public Map<String, PurchaseCQ> xdfgetProductId_SpecifyDerivedReferrer_PurchaseList() { return xgetSQueMap("productId_SpecifyDerivedReferrer_PurchaseList"); }
    public String keepProductId_SpecifyDerivedReferrer_PurchaseList(PurchaseCQ sq) { return xkeepSQue("productId_SpecifyDerivedReferrer_PurchaseList", sq); }

    public Map<String, PurchaseCQ> xdfgetProductId_QueryDerivedReferrer_PurchaseList() { return xgetSQueMap("productId_QueryDerivedReferrer_PurchaseList"); }
    public String keepProductId_QueryDerivedReferrer_PurchaseList(PurchaseCQ sq) { return xkeepSQue("productId_QueryDerivedReferrer_PurchaseList", sq); }
    public Map<String, Object> xdfgetProductId_QueryDerivedReferrer_PurchaseListParameter() { return xgetSQuePmMap("productId_QueryDerivedReferrer_PurchaseList"); }
    public String keepProductId_QueryDerivedReferrer_PurchaseListParameter(Object pm) { return xkeepSQuePm("productId_QueryDerivedReferrer_PurchaseList", pm); }

    /**
     * Add order-by as ascend. <br>
     * (商品ID)PRODUCT_ID: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_ProductId_Asc() { regOBA("PRODUCT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (商品ID)PRODUCT_ID: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_ProductId_Desc() { regOBD("PRODUCT_ID"); return this; }

    protected ConditionValue _productName;
    public ConditionValue xdfgetProductName()
    { if (_productName == null) { _productName = nCV(); }
      return _productName; }
    protected ConditionValue xgetCValueProductName() { return xdfgetProductName(); }

    /**
     * Add order-by as ascend. <br>
     * (商品名称)PRODUCT_NAME: {IX, NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_ProductName_Asc() { regOBA("PRODUCT_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (商品名称)PRODUCT_NAME: {IX, NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_ProductName_Desc() { regOBD("PRODUCT_NAME"); return this; }

    protected ConditionValue _productHandleCode;
    public ConditionValue xdfgetProductHandleCode()
    { if (_productHandleCode == null) { _productHandleCode = nCV(); }
      return _productHandleCode; }
    protected ConditionValue xgetCValueProductHandleCode() { return xdfgetProductHandleCode(); }

    /**
     * Add order-by as ascend. <br>
     * (商品ハンドルコード)PRODUCT_HANDLE_CODE: {UQ, NotNull, VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_ProductHandleCode_Asc() { regOBA("PRODUCT_HANDLE_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * (商品ハンドルコード)PRODUCT_HANDLE_CODE: {UQ, NotNull, VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_ProductHandleCode_Desc() { regOBD("PRODUCT_HANDLE_CODE"); return this; }

    protected ConditionValue _productCategoryCode;
    public ConditionValue xdfgetProductCategoryCode()
    { if (_productCategoryCode == null) { _productCategoryCode = nCV(); }
      return _productCategoryCode; }
    protected ConditionValue xgetCValueProductCategoryCode() { return xdfgetProductCategoryCode(); }

    /**
     * Add order-by as ascend. <br>
     * (商品カテゴリコード)PRODUCT_CATEGORY_CODE: {IX, NotNull, CHAR(3), FK to product_category}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_ProductCategoryCode_Asc() { regOBA("PRODUCT_CATEGORY_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * (商品カテゴリコード)PRODUCT_CATEGORY_CODE: {IX, NotNull, CHAR(3), FK to product_category}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_ProductCategoryCode_Desc() { regOBD("PRODUCT_CATEGORY_CODE"); return this; }

    protected ConditionValue _productStatusCode;
    public ConditionValue xdfgetProductStatusCode()
    { if (_productStatusCode == null) { _productStatusCode = nCV(); }
      return _productStatusCode; }
    protected ConditionValue xgetCValueProductStatusCode() { return xdfgetProductStatusCode(); }

    /**
     * Add order-by as ascend. <br>
     * (商品ステータスコード)PRODUCT_STATUS_CODE: {IX, NotNull, CHAR(3), FK to product_status, classification=ProductStatus}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_ProductStatusCode_Asc() { regOBA("PRODUCT_STATUS_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * (商品ステータスコード)PRODUCT_STATUS_CODE: {IX, NotNull, CHAR(3), FK to product_status, classification=ProductStatus}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_ProductStatusCode_Desc() { regOBD("PRODUCT_STATUS_CODE"); return this; }

    protected ConditionValue _regularPrice;
    public ConditionValue xdfgetRegularPrice()
    { if (_regularPrice == null) { _regularPrice = nCV(); }
      return _regularPrice; }
    protected ConditionValue xgetCValueRegularPrice() { return xdfgetRegularPrice(); }

    /**
     * Add order-by as ascend. <br>
     * (定価)REGULAR_PRICE: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_RegularPrice_Asc() { regOBA("REGULAR_PRICE"); return this; }

    /**
     * Add order-by as descend. <br>
     * (定価)REGULAR_PRICE: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_RegularPrice_Desc() { regOBD("REGULAR_PRICE"); return this; }

    protected ConditionValue _registerDatetime;
    public ConditionValue xdfgetRegisterDatetime()
    { if (_registerDatetime == null) { _registerDatetime = nCV(); }
      return _registerDatetime; }
    protected ConditionValue xgetCValueRegisterDatetime() { return xdfgetRegisterDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

    protected ConditionValue _registerUser;
    public ConditionValue xdfgetRegisterUser()
    { if (_registerUser == null) { _registerUser = nCV(); }
      return _registerUser; }
    protected ConditionValue xgetCValueRegisterUser() { return xdfgetRegisterUser(); }

    /**
     * Add order-by as ascend. <br>
     * (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_RegisterUser_Asc() { regOBA("REGISTER_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_RegisterUser_Desc() { regOBD("REGISTER_USER"); return this; }

    protected ConditionValue _updateDatetime;
    public ConditionValue xdfgetUpdateDatetime()
    { if (_updateDatetime == null) { _updateDatetime = nCV(); }
      return _updateDatetime; }
    protected ConditionValue xgetCValueUpdateDatetime() { return xdfgetUpdateDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_UpdateDatetime_Asc() { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_UpdateDatetime_Desc() { regOBD("UPDATE_DATETIME"); return this; }

    protected ConditionValue _updateUser;
    public ConditionValue xdfgetUpdateUser()
    { if (_updateUser == null) { _updateUser = nCV(); }
      return _updateUser; }
    protected ConditionValue xgetCValueUpdateUser() { return xdfgetUpdateUser(); }

    /**
     * Add order-by as ascend. <br>
     * (更新ユーザー)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_UpdateUser_Asc() { regOBA("UPDATE_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新ユーザー)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_UpdateUser_Desc() { regOBD("UPDATE_USER"); return this; }

    protected ConditionValue _versionNo;
    public ConditionValue xdfgetVersionNo()
    { if (_versionNo == null) { _versionNo = nCV(); }
      return _versionNo; }
    protected ConditionValue xgetCValueVersionNo() { return xdfgetVersionNo(); }

    /**
     * Add order-by as ascend. <br>
     * (バージョン番号)VERSION_NO: {NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * (バージョン番号)VERSION_NO: {NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsProductCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsProductCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        ProductCQ bq = (ProductCQ)bqs;
        ProductCQ uq = (ProductCQ)uqs;
        if (bq.hasConditionQueryProductCategory()) {
            uq.queryProductCategory().reflectRelationOnUnionQuery(bq.queryProductCategory(), uq.queryProductCategory());
        }
        if (bq.hasConditionQueryProductStatus()) {
            uq.queryProductStatus().reflectRelationOnUnionQuery(bq.queryProductStatus(), uq.queryProductStatus());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * (商品カテゴリ)PRODUCT_CATEGORY by my PRODUCT_CATEGORY_CODE, named 'productCategory'.
     * @return The instance of condition-query. (NotNull)
     */
    public ProductCategoryCQ queryProductCategory() {
        return xdfgetConditionQueryProductCategory();
    }
    public ProductCategoryCQ xdfgetConditionQueryProductCategory() {
        String prop = "productCategory";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryProductCategory()); xsetupOuterJoinProductCategory(); }
        return xgetQueRlMap(prop);
    }
    protected ProductCategoryCQ xcreateQueryProductCategory() {
        String nrp = xresolveNRP("product", "productCategory"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new ProductCategoryCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "productCategory", nrp);
    }
    protected void xsetupOuterJoinProductCategory() { xregOutJo("productCategory"); }
    public boolean hasConditionQueryProductCategory() { return xhasQueRlMap("productCategory"); }

    /**
     * Get the condition-query for relation table. <br>
     * (商品ステータス)PRODUCT_STATUS by my PRODUCT_STATUS_CODE, named 'productStatus'.
     * @return The instance of condition-query. (NotNull)
     */
    public ProductStatusCQ queryProductStatus() {
        return xdfgetConditionQueryProductStatus();
    }
    public ProductStatusCQ xdfgetConditionQueryProductStatus() {
        String prop = "productStatus";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryProductStatus()); xsetupOuterJoinProductStatus(); }
        return xgetQueRlMap(prop);
    }
    protected ProductStatusCQ xcreateQueryProductStatus() {
        String nrp = xresolveNRP("product", "productStatus"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new ProductStatusCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "productStatus", nrp);
    }
    protected void xsetupOuterJoinProductStatus() { xregOutJo("productStatus"); }
    public boolean hasConditionQueryProductStatus() { return xhasQueRlMap("productStatus"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, ProductCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(ProductCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, ProductCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(ProductCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, ProductCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(ProductCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, ProductCQ> _myselfExistsMap;
    public Map<String, ProductCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(ProductCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, ProductCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(ProductCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return ProductCB.class.getName(); }
    protected String xCQ() { return ProductCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
