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
package org.docksidestage.springboot.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.docksidestage.springboot.dbflute.exbhv.*;
import org.docksidestage.springboot.dbflute.exentity.*;

/**
 * The referrer loader of SUMMARY_PRODUCT as VIEW. <br>
 * <pre>
 * [primary key]
 *     
 *
 * [column]
 *     PRODUCT_ID, PRODUCT_NAME, PRODUCT_HANDLE_CODE, PRODUCT_STATUS_CODE, LATEST_PURCHASE_DATETIME
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfSummaryProduct {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<SummaryProduct> _selectedList;
    protected BehaviorSelector _selector;
    protected SummaryProductBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfSummaryProduct ready(List<SummaryProduct> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected SummaryProductBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(SummaryProductBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<SummaryProduct> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
