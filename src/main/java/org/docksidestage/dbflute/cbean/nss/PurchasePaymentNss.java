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

import org.docksidestage.dbflute.cbean.cq.PurchasePaymentCQ;

/**
 * The nest select set-upper of purchase_payment.
 * @author DBFlute(AutoGenerator)
 */
public class PurchasePaymentNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final PurchasePaymentCQ _query;
    public PurchasePaymentNss(PurchasePaymentCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * (購入)PURCHASE by my PURCHASE_ID, named 'purchase'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public PurchaseNss withPurchase() {
        _query.xdoNss(() -> _query.queryPurchase());
        return new PurchaseNss(_query.queryPurchase());
    }
}
