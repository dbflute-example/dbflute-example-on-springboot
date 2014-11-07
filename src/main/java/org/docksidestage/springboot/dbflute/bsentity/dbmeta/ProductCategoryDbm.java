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
package org.docksidestage.springboot.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.optional.OptionalEntity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import org.docksidestage.springboot.dbflute.allcommon.*;
import org.docksidestage.springboot.dbflute.exentity.*;

/**
 * The DB meta of PRODUCT_CATEGORY. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class ProductCategoryDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final ProductCategoryDbm _instance = new ProductCategoryDbm();
    private ProductCategoryDbm() {}
    public static ProductCategoryDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((ProductCategory)et).getProductCategoryCode(), (et, vl) -> ((ProductCategory)et).setProductCategoryCode((String)vl), "productCategoryCode");
        setupEpg(_epgMap, et -> ((ProductCategory)et).getProductCategoryName(), (et, vl) -> ((ProductCategory)et).setProductCategoryName((String)vl), "productCategoryName");
        setupEpg(_epgMap, et -> ((ProductCategory)et).getParentCategoryCode(), (et, vl) -> ((ProductCategory)et).setParentCategoryCode((String)vl), "parentCategoryCode");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    @SuppressWarnings("unchecked")
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((ProductCategory)et).getProductCategorySelf(), (et, vl) -> ((ProductCategory)et).setProductCategorySelf((OptionalEntity<ProductCategory>)vl), "productCategorySelf");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "PRODUCT_CATEGORY";
    protected final String _tablePropertyName = "productCategory";
    protected final TableSqlName _tableSqlName = new TableSqlName("PRODUCT_CATEGORY", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnProductCategoryCode = cci("PRODUCT_CATEGORY_CODE", "PRODUCT_CATEGORY_CODE", null, null, String.class, "productCategoryCode", null, true, false, true, "CHAR", 3, 0, null, false, null, null, null, "productList,productCategorySelfList", null);
    protected final ColumnInfo _columnProductCategoryName = cci("PRODUCT_CATEGORY_NAME", "PRODUCT_CATEGORY_NAME", null, null, String.class, "productCategoryName", null, false, false, true, "VARCHAR", 50, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnParentCategoryCode = cci("PARENT_CATEGORY_CODE", "PARENT_CATEGORY_CODE", null, null, String.class, "parentCategoryCode", null, false, false, false, "CHAR", 3, 0, null, false, null, null, "productCategorySelf", null, null);

    /**
     * PRODUCT_CATEGORY_CODE: {PK, NotNull, CHAR(3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCategoryCode() { return _columnProductCategoryCode; }
    /**
     * PRODUCT_CATEGORY_NAME: {NotNull, VARCHAR(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCategoryName() { return _columnProductCategoryName; }
    /**
     * PARENT_CATEGORY_CODE: {IX, CHAR(3), FK to PRODUCT_CATEGORY}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnParentCategoryCode() { return _columnParentCategoryCode; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnProductCategoryCode());
        ls.add(columnProductCategoryName());
        ls.add(columnParentCategoryCode());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnProductCategoryCode()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * PRODUCT_CATEGORY by my PARENT_CATEGORY_CODE, named 'productCategorySelf'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignProductCategorySelf() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnParentCategoryCode(), ProductCategoryDbm.getInstance().columnProductCategoryCode());
        return cfi("FK_PRODUCT_CATEGORY_PARENT", "productCategorySelf", this, ProductCategoryDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "productCategorySelfList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * PRODUCT by PRODUCT_CATEGORY_CODE, named 'productList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerProductList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductCategoryCode(), ProductDbm.getInstance().columnProductCategoryCode());
        return cri("FK_PRODUCT_PRODUCT_CATEGORY", "productList", this, ProductDbm.getInstance(), mp, false, "productCategory");
    }
    /**
     * PRODUCT_CATEGORY by PARENT_CATEGORY_CODE, named 'productCategorySelfList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerProductCategorySelfList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductCategoryCode(), ProductCategoryDbm.getInstance().columnParentCategoryCode());
        return cri("FK_PRODUCT_CATEGORY_PARENT", "productCategorySelfList", this, ProductCategoryDbm.getInstance(), mp, false, "productCategorySelf");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.springboot.dbflute.exentity.ProductCategory"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.springboot.dbflute.cbean.ProductCategoryCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.springboot.dbflute.exbhv.ProductCategoryBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<ProductCategory> getEntityType() { return ProductCategory.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public ProductCategory newEntity() { return new ProductCategory(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((ProductCategory)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((ProductCategory)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
