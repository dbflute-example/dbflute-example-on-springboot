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
package org.docksidestage.springboot.dbflute.allcommon;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.dbflute.bhv.core.BehaviorCommandInvoker;
import org.dbflute.bhv.core.InvokerAssistant;
import org.docksidestage.springboot.dbflute.allcommon.DBFluteInitializer;
import org.docksidestage.springboot.dbflute.exbhv.*;

/**
 * The Java configuration of DBFlute beans for Spring Framework. <br>
 * You can inject them by importing this class in your auto configuration class.
 * @author DBFlute(AutoGenerator)
 */
@Configuration
public class DBFluteBeansJavaConfig {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Autowired
    protected ApplicationContext _container;

    @Resource(name="dataSource")
    protected DataSource _dataSource; // name basis here for multiple DB

    // ===================================================================================
    //                                                                   Runtime Component
    //                                                                   =================
    @Bean(name="introduction")
    public DBFluteInitializer createDBFluteInitializer() { // no lazy for initialize-only component
        return new org.docksidestage.springboot.dbflute.allcommon.DBFluteInitializer(_dataSource);
    }

    @Lazy
    @Bean(name="invokerAssistant")
    public InvokerAssistant createImplementedInvokerAssistant() {
        ImplementedInvokerAssistant assistant = newImplementedInvokerAssistant();
        assistant.setDataSource(_dataSource);
        return assistant;
    }

    protected ImplementedInvokerAssistant newImplementedInvokerAssistant() {
        return new org.docksidestage.springboot.dbflute.allcommon.ImplementedInvokerAssistant();
    }

    @Lazy
    @Bean(name="behaviorCommandInvoker")
    public BehaviorCommandInvoker createBehaviorCommandInvoker() {
        BehaviorCommandInvoker invoker = newBehaviorCommandInvoker();
        invoker.setInvokerAssistant(createImplementedInvokerAssistant());
        return invoker;
    }

    protected BehaviorCommandInvoker newBehaviorCommandInvoker() {
        return new BehaviorCommandInvoker();
    }

    @Lazy
    @Bean(name="behaviorSelector")
    public ImplementedBehaviorSelector createImplementedBehaviorSelector() {
        ImplementedBehaviorSelector selector = newImplementedBehaviorSelector();
        selector.setContainer(_container);
        return selector;
    }

    protected ImplementedBehaviorSelector newImplementedBehaviorSelector() {
        return new ImplementedBehaviorSelector();
    }

    @Lazy
    @Bean(name="commonColumnAutoSetupper")
    public ImplementedCommonColumnAutoSetupper createImplementedCommonColumnAutoSetupper() {
        return newImplementedCommonColumnAutoSetupper();
    }

    protected ImplementedCommonColumnAutoSetupper newImplementedCommonColumnAutoSetupper() {
        return new ImplementedCommonColumnAutoSetupper();
    }

    // ===================================================================================
    //                                                                            Behavior
    //                                                                            ========
    @Lazy
    @Bean(name="memberBhv")
    public MemberBhv createMemberBhv() {
        MemberBhv bhv = newMemberBhv();
        bhv.setBehaviorCommandInvoker(createBehaviorCommandInvoker()); bhv.setBehaviorSelector(createImplementedBehaviorSelector());
        bhv.setCommonColumnAutoSetupper(createImplementedCommonColumnAutoSetupper());
        return bhv;
    }
    protected MemberBhv newMemberBhv() { return new MemberBhv(); }

    @Lazy
    @Bean(name="memberAddressBhv")
    public MemberAddressBhv createMemberAddressBhv() {
        MemberAddressBhv bhv = newMemberAddressBhv();
        bhv.setBehaviorCommandInvoker(createBehaviorCommandInvoker()); bhv.setBehaviorSelector(createImplementedBehaviorSelector());
        bhv.setCommonColumnAutoSetupper(createImplementedCommonColumnAutoSetupper());
        return bhv;
    }
    protected MemberAddressBhv newMemberAddressBhv() { return new MemberAddressBhv(); }

    @Lazy
    @Bean(name="memberFollowingBhv")
    public MemberFollowingBhv createMemberFollowingBhv() {
        MemberFollowingBhv bhv = newMemberFollowingBhv();
        bhv.setBehaviorCommandInvoker(createBehaviorCommandInvoker()); bhv.setBehaviorSelector(createImplementedBehaviorSelector());
        bhv.setCommonColumnAutoSetupper(createImplementedCommonColumnAutoSetupper());
        return bhv;
    }
    protected MemberFollowingBhv newMemberFollowingBhv() { return new MemberFollowingBhv(); }

    @Lazy
    @Bean(name="memberLoginBhv")
    public MemberLoginBhv createMemberLoginBhv() {
        MemberLoginBhv bhv = newMemberLoginBhv();
        bhv.setBehaviorCommandInvoker(createBehaviorCommandInvoker()); bhv.setBehaviorSelector(createImplementedBehaviorSelector());
        bhv.setCommonColumnAutoSetupper(createImplementedCommonColumnAutoSetupper());
        return bhv;
    }
    protected MemberLoginBhv newMemberLoginBhv() { return new MemberLoginBhv(); }

    @Lazy
    @Bean(name="memberSecurityBhv")
    public MemberSecurityBhv createMemberSecurityBhv() {
        MemberSecurityBhv bhv = newMemberSecurityBhv();
        bhv.setBehaviorCommandInvoker(createBehaviorCommandInvoker()); bhv.setBehaviorSelector(createImplementedBehaviorSelector());
        bhv.setCommonColumnAutoSetupper(createImplementedCommonColumnAutoSetupper());
        return bhv;
    }
    protected MemberSecurityBhv newMemberSecurityBhv() { return new MemberSecurityBhv(); }

    @Lazy
    @Bean(name="memberServiceBhv")
    public MemberServiceBhv createMemberServiceBhv() {
        MemberServiceBhv bhv = newMemberServiceBhv();
        bhv.setBehaviorCommandInvoker(createBehaviorCommandInvoker()); bhv.setBehaviorSelector(createImplementedBehaviorSelector());
        bhv.setCommonColumnAutoSetupper(createImplementedCommonColumnAutoSetupper());
        return bhv;
    }
    protected MemberServiceBhv newMemberServiceBhv() { return new MemberServiceBhv(); }

    @Lazy
    @Bean(name="memberStatusBhv")
    public MemberStatusBhv createMemberStatusBhv() {
        MemberStatusBhv bhv = newMemberStatusBhv();
        bhv.setBehaviorCommandInvoker(createBehaviorCommandInvoker()); bhv.setBehaviorSelector(createImplementedBehaviorSelector());
        bhv.setCommonColumnAutoSetupper(createImplementedCommonColumnAutoSetupper());
        return bhv;
    }
    protected MemberStatusBhv newMemberStatusBhv() { return new MemberStatusBhv(); }

    @Lazy
    @Bean(name="memberWithdrawalBhv")
    public MemberWithdrawalBhv createMemberWithdrawalBhv() {
        MemberWithdrawalBhv bhv = newMemberWithdrawalBhv();
        bhv.setBehaviorCommandInvoker(createBehaviorCommandInvoker()); bhv.setBehaviorSelector(createImplementedBehaviorSelector());
        bhv.setCommonColumnAutoSetupper(createImplementedCommonColumnAutoSetupper());
        return bhv;
    }
    protected MemberWithdrawalBhv newMemberWithdrawalBhv() { return new MemberWithdrawalBhv(); }

    @Lazy
    @Bean(name="productBhv")
    public ProductBhv createProductBhv() {
        ProductBhv bhv = newProductBhv();
        bhv.setBehaviorCommandInvoker(createBehaviorCommandInvoker()); bhv.setBehaviorSelector(createImplementedBehaviorSelector());
        bhv.setCommonColumnAutoSetupper(createImplementedCommonColumnAutoSetupper());
        return bhv;
    }
    protected ProductBhv newProductBhv() { return new ProductBhv(); }

    @Lazy
    @Bean(name="productCategoryBhv")
    public ProductCategoryBhv createProductCategoryBhv() {
        ProductCategoryBhv bhv = newProductCategoryBhv();
        bhv.setBehaviorCommandInvoker(createBehaviorCommandInvoker()); bhv.setBehaviorSelector(createImplementedBehaviorSelector());
        bhv.setCommonColumnAutoSetupper(createImplementedCommonColumnAutoSetupper());
        return bhv;
    }
    protected ProductCategoryBhv newProductCategoryBhv() { return new ProductCategoryBhv(); }

    @Lazy
    @Bean(name="productStatusBhv")
    public ProductStatusBhv createProductStatusBhv() {
        ProductStatusBhv bhv = newProductStatusBhv();
        bhv.setBehaviorCommandInvoker(createBehaviorCommandInvoker()); bhv.setBehaviorSelector(createImplementedBehaviorSelector());
        bhv.setCommonColumnAutoSetupper(createImplementedCommonColumnAutoSetupper());
        return bhv;
    }
    protected ProductStatusBhv newProductStatusBhv() { return new ProductStatusBhv(); }

    @Lazy
    @Bean(name="purchaseBhv")
    public PurchaseBhv createPurchaseBhv() {
        PurchaseBhv bhv = newPurchaseBhv();
        bhv.setBehaviorCommandInvoker(createBehaviorCommandInvoker()); bhv.setBehaviorSelector(createImplementedBehaviorSelector());
        bhv.setCommonColumnAutoSetupper(createImplementedCommonColumnAutoSetupper());
        return bhv;
    }
    protected PurchaseBhv newPurchaseBhv() { return new PurchaseBhv(); }

    @Lazy
    @Bean(name="purchasePaymentBhv")
    public PurchasePaymentBhv createPurchasePaymentBhv() {
        PurchasePaymentBhv bhv = newPurchasePaymentBhv();
        bhv.setBehaviorCommandInvoker(createBehaviorCommandInvoker()); bhv.setBehaviorSelector(createImplementedBehaviorSelector());
        bhv.setCommonColumnAutoSetupper(createImplementedCommonColumnAutoSetupper());
        return bhv;
    }
    protected PurchasePaymentBhv newPurchasePaymentBhv() { return new PurchasePaymentBhv(); }

    @Lazy
    @Bean(name="regionBhv")
    public RegionBhv createRegionBhv() {
        RegionBhv bhv = newRegionBhv();
        bhv.setBehaviorCommandInvoker(createBehaviorCommandInvoker()); bhv.setBehaviorSelector(createImplementedBehaviorSelector());
        bhv.setCommonColumnAutoSetupper(createImplementedCommonColumnAutoSetupper());
        return bhv;
    }
    protected RegionBhv newRegionBhv() { return new RegionBhv(); }

    @Lazy
    @Bean(name="serviceRankBhv")
    public ServiceRankBhv createServiceRankBhv() {
        ServiceRankBhv bhv = newServiceRankBhv();
        bhv.setBehaviorCommandInvoker(createBehaviorCommandInvoker()); bhv.setBehaviorSelector(createImplementedBehaviorSelector());
        bhv.setCommonColumnAutoSetupper(createImplementedCommonColumnAutoSetupper());
        return bhv;
    }
    protected ServiceRankBhv newServiceRankBhv() { return new ServiceRankBhv(); }

    @Lazy
    @Bean(name="summaryProductBhv")
    public SummaryProductBhv createSummaryProductBhv() {
        SummaryProductBhv bhv = newSummaryProductBhv();
        bhv.setBehaviorCommandInvoker(createBehaviorCommandInvoker()); bhv.setBehaviorSelector(createImplementedBehaviorSelector());
        return bhv;
    }
    protected SummaryProductBhv newSummaryProductBhv() { return new SummaryProductBhv(); }

    @Lazy
    @Bean(name="summaryWithdrawalBhv")
    public SummaryWithdrawalBhv createSummaryWithdrawalBhv() {
        SummaryWithdrawalBhv bhv = newSummaryWithdrawalBhv();
        bhv.setBehaviorCommandInvoker(createBehaviorCommandInvoker()); bhv.setBehaviorSelector(createImplementedBehaviorSelector());
        return bhv;
    }
    protected SummaryWithdrawalBhv newSummaryWithdrawalBhv() { return new SummaryWithdrawalBhv(); }

    @Lazy
    @Bean(name="withdrawalReasonBhv")
    public WithdrawalReasonBhv createWithdrawalReasonBhv() {
        WithdrawalReasonBhv bhv = newWithdrawalReasonBhv();
        bhv.setBehaviorCommandInvoker(createBehaviorCommandInvoker()); bhv.setBehaviorSelector(createImplementedBehaviorSelector());
        bhv.setCommonColumnAutoSetupper(createImplementedCommonColumnAutoSetupper());
        return bhv;
    }
    protected WithdrawalReasonBhv newWithdrawalReasonBhv() { return new WithdrawalReasonBhv(); }
}
