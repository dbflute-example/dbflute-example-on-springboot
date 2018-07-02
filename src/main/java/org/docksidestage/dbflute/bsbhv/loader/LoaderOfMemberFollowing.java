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
package org.docksidestage.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.docksidestage.dbflute.exbhv.*;
import org.docksidestage.dbflute.exentity.*;

/**
 * The referrer loader of (会員フォローイング)MEMBER_FOLLOWING as TABLE. <br>
 * <pre>
 * [primary key]
 *     MEMBER_FOLLOWING_ID
 *
 * [column]
 *     MEMBER_FOLLOWING_ID, MY_MEMBER_ID, YOUR_MEMBER_ID, FOLLOW_DATETIME
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MEMBER_FOLLOWING_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     MEMBER
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     memberByMyMemberId, memberByYourMemberId
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMemberFollowing {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MemberFollowing> _selectedList;
    protected BehaviorSelector _selector;
    protected MemberFollowingBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMemberFollowing ready(List<MemberFollowing> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MemberFollowingBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MemberFollowingBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMember _foreignMemberByMyMemberIdLoader;
    public LoaderOfMember pulloutMemberByMyMemberId() {
        if (_foreignMemberByMyMemberIdLoader == null)
        { _foreignMemberByMyMemberIdLoader = new LoaderOfMember().ready(myBhv().pulloutMemberByMyMemberId(_selectedList), _selector); }
        return _foreignMemberByMyMemberIdLoader;
    }

    protected LoaderOfMember _foreignMemberByYourMemberIdLoader;
    public LoaderOfMember pulloutMemberByYourMemberId() {
        if (_foreignMemberByYourMemberIdLoader == null)
        { _foreignMemberByYourMemberIdLoader = new LoaderOfMember().ready(myBhv().pulloutMemberByYourMemberId(_selectedList), _selector); }
        return _foreignMemberByYourMemberIdLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MemberFollowing> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
