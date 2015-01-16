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
package org.docksidestage.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.optional.OptionalEntity;
import org.docksidestage.dbflute.allcommon.EntityDefinedCommonColumn;
import org.docksidestage.dbflute.allcommon.DBMetaInstanceHandler;
import org.docksidestage.dbflute.allcommon.CDef;
import org.docksidestage.dbflute.exentity.*;

/**
 * The entity of PRODUCT as TABLE. <br>
 * <pre>
 * [primary-key]
 *     PRODUCT_ID
 * 
 * [column]
 *     PRODUCT_ID, PRODUCT_NAME, PRODUCT_HANDLE_CODE, PRODUCT_CATEGORY_CODE, PRODUCT_STATUS_CODE, REGULAR_PRICE, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     PRODUCT_ID
 * 
 * [version-no]
 *     VERSION_NO
 * 
 * [foreign table]
 *     PRODUCT_CATEGORY, PRODUCT_STATUS
 * 
 * [referrer table]
 *     PURCHASE
 * 
 * [foreign property]
 *     productCategory, productStatus
 * 
 * [referrer property]
 *     purchaseList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer productId = entity.getProductId();
 * String productName = entity.getProductName();
 * String productHandleCode = entity.getProductHandleCode();
 * String productCategoryCode = entity.getProductCategoryCode();
 * String productStatusCode = entity.getProductStatusCode();
 * Integer regularPrice = entity.getRegularPrice();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerUser = entity.getRegisterUser();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateUser = entity.getUpdateUser();
 * Long versionNo = entity.getVersionNo();
 * entity.setProductId(productId);
 * entity.setProductName(productName);
 * entity.setProductHandleCode(productHandleCode);
 * entity.setProductCategoryCode(productCategoryCode);
 * entity.setProductStatusCode(productStatusCode);
 * entity.setRegularPrice(regularPrice);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterUser(registerUser);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateUser(updateUser);
 * entity.setVersionNo(versionNo);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsProduct extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** PRODUCT_ID: {PK, ID, NotNull, INTEGER(10)} */
    protected Integer _productId;

    /** PRODUCT_NAME: {IX, NotNull, VARCHAR(50)} */
    protected String _productName;

    /** PRODUCT_HANDLE_CODE: {UQ, NotNull, VARCHAR(100)} */
    protected String _productHandleCode;

    /** PRODUCT_CATEGORY_CODE: {IX, NotNull, CHAR(3), FK to PRODUCT_CATEGORY} */
    protected String _productCategoryCode;

    /** PRODUCT_STATUS_CODE: {IX, NotNull, CHAR(3), FK to PRODUCT_STATUS, classification=ProductStatus} */
    protected String _productStatusCode;

    /** REGULAR_PRICE: {NotNull, INTEGER(10)} */
    protected Integer _regularPrice;

    /** REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)} */
    protected java.time.LocalDateTime _registerDatetime;

    /** REGISTER_USER: {NotNull, VARCHAR(200)} */
    protected String _registerUser;

    /** UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)} */
    protected java.time.LocalDateTime _updateDatetime;

    /** UPDATE_USER: {NotNull, VARCHAR(200)} */
    protected String _updateUser;

    /** VERSION_NO: {NotNull, BIGINT(19)} */
    protected Long _versionNo;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "PRODUCT";
    }

    // ===================================================================================
    //                                                                         Primary Key
    //                                                                         ===========
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_productId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param productHandleCode : UQ, NotNull, VARCHAR(100). (NotNull)
     */
    public void uniqueBy(String productHandleCode) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("productHandleCode");
        setProductHandleCode(productHandleCode);
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of productStatusCode as the classification of ProductStatus. <br>
     * PRODUCT_STATUS_CODE: {IX, NotNull, CHAR(3), FK to PRODUCT_STATUS, classification=ProductStatus} <br>
     * 商品ステータス。あんまり面白みのないステータス
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ProductStatus getProductStatusCodeAsProductStatus() {
        return CDef.ProductStatus.codeOf(getProductStatusCode());
    }

    /**
     * Set the value of productStatusCode as the classification of ProductStatus. <br>
     * PRODUCT_STATUS_CODE: {IX, NotNull, CHAR(3), FK to PRODUCT_STATUS, classification=ProductStatus} <br>
     * 商品ステータス。あんまり面白みのないステータス
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setProductStatusCodeAsProductStatus(CDef.ProductStatus cdef) {
        setProductStatusCode(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of productStatusCode as 生産販売可能 (ONS). <br>
     * 生産販売可能
     */
    public void setProductStatusCode_生産販売可能() {
        setProductStatusCodeAsProductStatus(CDef.ProductStatus.生産販売可能);
    }

    /**
     * Set the value of productStatusCode as 生産中止 (PST). <br>
     * 生産中止
     */
    public void setProductStatusCode_生産中止() {
        setProductStatusCodeAsProductStatus(CDef.ProductStatus.生産中止);
    }

    /**
     * Set the value of productStatusCode as 販売中止 (SST). <br>
     * 販売中止
     */
    public void setProductStatusCode_販売中止() {
        setProductStatusCodeAsProductStatus(CDef.ProductStatus.販売中止);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of productStatusCode 生産販売可能? <br>
     * 生産販売可能
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isProductStatusCode生産販売可能() {
        CDef.ProductStatus cdef = getProductStatusCodeAsProductStatus();
        return cdef != null ? cdef.equals(CDef.ProductStatus.生産販売可能) : false;
    }

    /**
     * Is the value of productStatusCode 生産中止? <br>
     * 生産中止
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isProductStatusCode生産中止() {
        CDef.ProductStatus cdef = getProductStatusCodeAsProductStatus();
        return cdef != null ? cdef.equals(CDef.ProductStatus.生産中止) : false;
    }

    /**
     * Is the value of productStatusCode 販売中止? <br>
     * 販売中止
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isProductStatusCode販売中止() {
        CDef.ProductStatus cdef = getProductStatusCodeAsProductStatus();
        return cdef != null ? cdef.equals(CDef.ProductStatus.販売中止) : false;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** PRODUCT_CATEGORY by my PRODUCT_CATEGORY_CODE, named 'productCategory'. */
    protected OptionalEntity<ProductCategory> _productCategory;

    /**
     * [get] PRODUCT_CATEGORY by my PRODUCT_CATEGORY_CODE, named 'productCategory'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'productCategory'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<ProductCategory> getProductCategory() {
        if (_productCategory == null) { _productCategory = OptionalEntity.relationEmpty(this, "productCategory"); }
        return _productCategory;
    }

    /**
     * [set] PRODUCT_CATEGORY by my PRODUCT_CATEGORY_CODE, named 'productCategory'.
     * @param productCategory The entity of foreign property 'productCategory'. (NullAllowed)
     */
    public void setProductCategory(OptionalEntity<ProductCategory> productCategory) {
        _productCategory = productCategory;
    }

    /** PRODUCT_STATUS by my PRODUCT_STATUS_CODE, named 'productStatus'. */
    protected OptionalEntity<ProductStatus> _productStatus;

    /**
     * [get] PRODUCT_STATUS by my PRODUCT_STATUS_CODE, named 'productStatus'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'productStatus'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<ProductStatus> getProductStatus() {
        if (_productStatus == null) { _productStatus = OptionalEntity.relationEmpty(this, "productStatus"); }
        return _productStatus;
    }

    /**
     * [set] PRODUCT_STATUS by my PRODUCT_STATUS_CODE, named 'productStatus'.
     * @param productStatus The entity of foreign property 'productStatus'. (NullAllowed)
     */
    public void setProductStatus(OptionalEntity<ProductStatus> productStatus) {
        _productStatus = productStatus;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** PURCHASE by PRODUCT_ID, named 'purchaseList'. */
    protected List<Purchase> _purchaseList;

    /**
     * [get] PURCHASE by PRODUCT_ID, named 'purchaseList'.
     * @return The entity list of referrer property 'purchaseList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Purchase> getPurchaseList() {
        if (_purchaseList == null) { _purchaseList = newReferrerList(); }
        return _purchaseList;
    }

    /**
     * [set] PURCHASE by PRODUCT_ID, named 'purchaseList'.
     * @param purchaseList The entity list of referrer property 'purchaseList'. (NullAllowed)
     */
    public void setPurchaseList(List<Purchase> purchaseList) {
        _purchaseList = purchaseList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsProduct) {
            BsProduct other = (BsProduct)obj;
            if (!xSV(_productId, other._productId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _productId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_productCategory != null && _productCategory.isPresent())
        { sb.append(li).append(xbRDS(_productCategory, "productCategory")); }
        if (_productStatus != null && _productStatus.isPresent())
        { sb.append(li).append(xbRDS(_productStatus, "productStatus")); }
        if (_purchaseList != null) { for (Purchase et : _purchaseList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "purchaseList")); } } }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_productId));
        sb.append(dm).append(xfND(_productName));
        sb.append(dm).append(xfND(_productHandleCode));
        sb.append(dm).append(xfND(_productCategoryCode));
        sb.append(dm).append(xfND(_productStatusCode));
        sb.append(dm).append(xfND(_regularPrice));
        sb.append(dm).append(xfND(_registerDatetime));
        sb.append(dm).append(xfND(_registerUser));
        sb.append(dm).append(xfND(_updateDatetime));
        sb.append(dm).append(xfND(_updateUser));
        sb.append(dm).append(xfND(_versionNo));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_productCategory != null && _productCategory.isPresent())
        { sb.append(dm).append("productCategory"); }
        if (_productStatus != null && _productStatus.isPresent())
        { sb.append(dm).append("productStatus"); }
        if (_purchaseList != null && !_purchaseList.isEmpty())
        { sb.append(dm).append("purchaseList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public Product clone() {
        return (Product)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PRODUCT_ID: {PK, ID, NotNull, INTEGER(10)} <br>
     * @return The value of the column 'PRODUCT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getProductId() {
        checkSpecifiedProperty("productId");
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {PK, ID, NotNull, INTEGER(10)} <br>
     * @param productId The value of the column 'PRODUCT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setProductId(Integer productId) {
        registerModifiedProperty("productId");
        _productId = productId;
    }

    /**
     * [get] PRODUCT_NAME: {IX, NotNull, VARCHAR(50)} <br>
     * @return The value of the column 'PRODUCT_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getProductName() {
        checkSpecifiedProperty("productName");
        return convertEmptyToNull(_productName);
    }

    /**
     * [set] PRODUCT_NAME: {IX, NotNull, VARCHAR(50)} <br>
     * @param productName The value of the column 'PRODUCT_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setProductName(String productName) {
        registerModifiedProperty("productName");
        _productName = productName;
    }

    /**
     * [get] PRODUCT_HANDLE_CODE: {UQ, NotNull, VARCHAR(100)} <br>
     * @return The value of the column 'PRODUCT_HANDLE_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getProductHandleCode() {
        checkSpecifiedProperty("productHandleCode");
        return convertEmptyToNull(_productHandleCode);
    }

    /**
     * [set] PRODUCT_HANDLE_CODE: {UQ, NotNull, VARCHAR(100)} <br>
     * @param productHandleCode The value of the column 'PRODUCT_HANDLE_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setProductHandleCode(String productHandleCode) {
        registerModifiedProperty("productHandleCode");
        _productHandleCode = productHandleCode;
    }

    /**
     * [get] PRODUCT_CATEGORY_CODE: {IX, NotNull, CHAR(3), FK to PRODUCT_CATEGORY} <br>
     * @return The value of the column 'PRODUCT_CATEGORY_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getProductCategoryCode() {
        checkSpecifiedProperty("productCategoryCode");
        return convertEmptyToNull(_productCategoryCode);
    }

    /**
     * [set] PRODUCT_CATEGORY_CODE: {IX, NotNull, CHAR(3), FK to PRODUCT_CATEGORY} <br>
     * @param productCategoryCode The value of the column 'PRODUCT_CATEGORY_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setProductCategoryCode(String productCategoryCode) {
        registerModifiedProperty("productCategoryCode");
        _productCategoryCode = productCategoryCode;
    }

    /**
     * [get] PRODUCT_STATUS_CODE: {IX, NotNull, CHAR(3), FK to PRODUCT_STATUS, classification=ProductStatus} <br>
     * @return The value of the column 'PRODUCT_STATUS_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getProductStatusCode() {
        checkSpecifiedProperty("productStatusCode");
        return convertEmptyToNull(_productStatusCode);
    }

    /**
     * [set] PRODUCT_STATUS_CODE: {IX, NotNull, CHAR(3), FK to PRODUCT_STATUS, classification=ProductStatus} <br>
     * @param productStatusCode The value of the column 'PRODUCT_STATUS_CODE'. (basically NotNull if update: for the constraint)
     */
    protected void setProductStatusCode(String productStatusCode) {
        checkClassificationCode("PRODUCT_STATUS_CODE", CDef.DefMeta.ProductStatus, productStatusCode);
        registerModifiedProperty("productStatusCode");
        _productStatusCode = productStatusCode;
    }

    /**
     * [get] REGULAR_PRICE: {NotNull, INTEGER(10)} <br>
     * @return The value of the column 'REGULAR_PRICE'. (basically NotNull if selected: for the constraint)
     */
    public Integer getRegularPrice() {
        checkSpecifiedProperty("regularPrice");
        return _regularPrice;
    }

    /**
     * [set] REGULAR_PRICE: {NotNull, INTEGER(10)} <br>
     * @param regularPrice The value of the column 'REGULAR_PRICE'. (basically NotNull if update: for the constraint)
     */
    public void setRegularPrice(Integer regularPrice) {
        registerModifiedProperty("regularPrice");
        _regularPrice = regularPrice;
    }

    /**
     * [get] REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)} <br>
     * @return The value of the column 'REGISTER_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getRegisterDatetime() {
        checkSpecifiedProperty("registerDatetime");
        return _registerDatetime;
    }

    /**
     * [set] REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)} <br>
     * @param registerDatetime The value of the column 'REGISTER_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterDatetime(java.time.LocalDateTime registerDatetime) {
        registerModifiedProperty("registerDatetime");
        _registerDatetime = registerDatetime;
    }

    /**
     * [get] REGISTER_USER: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'REGISTER_USER'. (basically NotNull if selected: for the constraint)
     */
    public String getRegisterUser() {
        checkSpecifiedProperty("registerUser");
        return convertEmptyToNull(_registerUser);
    }

    /**
     * [set] REGISTER_USER: {NotNull, VARCHAR(200)} <br>
     * @param registerUser The value of the column 'REGISTER_USER'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterUser(String registerUser) {
        registerModifiedProperty("registerUser");
        _registerUser = registerUser;
    }

    /**
     * [get] UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)} <br>
     * @return The value of the column 'UPDATE_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getUpdateDatetime() {
        checkSpecifiedProperty("updateDatetime");
        return _updateDatetime;
    }

    /**
     * [set] UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)} <br>
     * @param updateDatetime The value of the column 'UPDATE_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateDatetime(java.time.LocalDateTime updateDatetime) {
        registerModifiedProperty("updateDatetime");
        _updateDatetime = updateDatetime;
    }

    /**
     * [get] UPDATE_USER: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'UPDATE_USER'. (basically NotNull if selected: for the constraint)
     */
    public String getUpdateUser() {
        checkSpecifiedProperty("updateUser");
        return convertEmptyToNull(_updateUser);
    }

    /**
     * [set] UPDATE_USER: {NotNull, VARCHAR(200)} <br>
     * @param updateUser The value of the column 'UPDATE_USER'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateUser(String updateUser) {
        registerModifiedProperty("updateUser");
        _updateUser = updateUser;
    }

    /**
     * [get] VERSION_NO: {NotNull, BIGINT(19)} <br>
     * @return The value of the column 'VERSION_NO'. (basically NotNull if selected: for the constraint)
     */
    public Long getVersionNo() {
        checkSpecifiedProperty("versionNo");
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {NotNull, BIGINT(19)} <br>
     * @param versionNo The value of the column 'VERSION_NO'. (basically NotNull if update: for the constraint)
     */
    public void setVersionNo(Long versionNo) {
        registerModifiedProperty("versionNo");
        _versionNo = versionNo;
    }

    /**
     * For framework so basically DON'T use this method.
     * @param productStatusCode The value of the column 'PRODUCT_STATUS_CODE'. (basically NotNull if update: for the constraint)
     */
    public void mynativeMappingProductStatusCode(String productStatusCode) {
        setProductStatusCode(productStatusCode);
    }
}
