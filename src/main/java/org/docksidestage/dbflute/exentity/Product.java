/*
 * Copyright 2015-2019 the original author or authors.
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
package org.docksidestage.dbflute.exentity;

import java.time.LocalDate;

import org.docksidestage.dbflute.bsentity.BsProduct;

/**
 * The entity of PRODUCT.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 * @author jflute
 */
public class Product extends BsProduct {

    /** PURCHASE_COUNT: Derived Referrer Alias. */
    public static final String ALIAS_purchaseCount = "PURCHASE_COUNT";
    /** LATEST_PURCHASE_DATE: Derived Referrer Alias. */
    public static final String ALIAS_latestPurchaseDate = "LATEST_PURCHASE_DATE";
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;
    /** PURCHASE_COUNT: (Derived Referrer) */
    protected Integer _purchaseCount;
    /** LATEST_PURCHASE_DATE: (Derived Referrer) */
    protected LocalDate _latestPurchaseDate;

    /**
     * [get] PURCHASE_COUNT: (Derived Referrer)
     * @return The value of the column 'PURCHASE_COUNT'. (NullAllowed)
     */
    public Integer getPurchaseCount() {
        return _purchaseCount;
    }

    /**
     * [set] PURCHASE_COUNT: (Derived Referrer)
     * @param purchaseCount The value of the column 'PURCHASE_COUNT'. (NullAllowed)
     */
    public void setPurchaseCount(Integer purchaseCount) {
        _purchaseCount = purchaseCount;
    }

    /**
     * [get] LATEST_PURCHASE_DATE: (Derived Referrer)
     * @return The value of the column 'LATEST_PURCHASE_DATE'. (NullAllowed)
     */
    public LocalDate getLatestPurchaseDate() {
        return _latestPurchaseDate;
    }

    /**
     * [set] LATEST_PURCHASE_DATE: (Derived Referrer)
     * @param latestPurchaseDate The value of the column 'LATEST_PURCHASE_DATE'. (NullAllowed)
     */
    public void setLatestPurchaseDate(LocalDate latestPurchaseDate) {
        _latestPurchaseDate = latestPurchaseDate;
    }
}
