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
package org.docksidestage.dbflute.cbean.nss;

import org.docksidestage.dbflute.cbean.cq.ProductCQ;

/**
 * The nest select set-upper of product.
 * @author DBFlute(AutoGenerator)
 */
public class ProductNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final ProductCQ _query;
    public ProductNss(ProductCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * (商品カテゴリ)PRODUCT_CATEGORY by my PRODUCT_CATEGORY_CODE, named 'productCategory'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public ProductCategoryNss withProductCategory() {
        _query.xdoNss(() -> _query.queryProductCategory());
        return new ProductCategoryNss(_query.queryProductCategory());
    }
    /**
     * With nested relation columns to select clause. <br>
     * (商品ステータス)PRODUCT_STATUS by my PRODUCT_STATUS_CODE, named 'productStatus'.
     */
    public void withProductStatus() {
        _query.xdoNss(() -> _query.queryProductStatus());
    }
}
