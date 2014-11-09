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

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.dbflute.bhv.BehaviorSelector;
import org.dbflute.bhv.core.BehaviorCommandInvoker;
import org.dbflute.bhv.core.InvokerAssistant;
import org.dbflute.hook.CommonColumnAutoSetupper;
import org.docksidestage.springboot.dbflute.allcommon.DBFluteInitializer;
import org.docksidestage.springboot.dbflute.exbhv.*;

/**
 * @author DBFlute(AutoGenerator)
 */
@Configuration
public class DBFluteBeansJavaConfig {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // *according to dependency order
    // and all injections use 'Resource' annotation to keep the order
    // probably 'Resource' is processed before 'Autowired'
    // besides, 'Resource' finds by name (specified or field name) first
    // but secondly finds by type (only once so not case with small performance)
    @Resource
    protected ApplicationContext _xcontainer;

    // injections are on name basic here for multiple DB
    @Resource(name="dataSource")
    protected DataSource dataSource;

    @Resource(name="invokerAssistant")
    protected InvokerAssistant invokerAssistant;

    @Resource(name="behaviorCommandInvoker")
    protected BehaviorCommandInvoker behaviorCommandInvoker;

    @Resource(name="behaviorSelector")
    protected BehaviorSelector behaviorSelector;

    @Resource(name="commonColumnAutoSetupper")
    protected CommonColumnAutoSetupper commonColumnAutoSetupper;

    // ===================================================================================
    //                                                                   Runtime Component
    //                                                                   =================
    @Bean(name="introduction")
    public DBFluteInitializer createDBFluteInitializer() {
        return new org.docksidestage.springboot.dbflute.allcommon.DBFluteInitializer(dataSource);
    }

    @Bean(name="invokerAssistant")
    public InvokerAssistant createImplementedInvokerAssistant() {
        ImplementedInvokerAssistant assistant = newImplementedInvokerAssistant();
        assistant.setDataSource(dataSource);
        return assistant;
    }

    protected ImplementedInvokerAssistant newImplementedInvokerAssistant() {
        return new org.docksidestage.springboot.dbflute.allcommon.ImplementedInvokerAssistant();
    }

    @Bean(name="behaviorCommandInvoker")
    public BehaviorCommandInvoker createBehaviorCommandInvoker() {
        BehaviorCommandInvoker invoker = newBehaviorCommandInvoker();
        invoker.setInvokerAssistant(invokerAssistant);
        return invoker;
    }

    protected BehaviorCommandInvoker newBehaviorCommandInvoker() {
        return new BehaviorCommandInvoker();
    }

    @Bean(name="behaviorSelector")
    public ImplementedBehaviorSelector createImplementedBehaviorSelector() {
        ImplementedBehaviorSelector selector = newImplementedBehaviorSelector();
        selector.setContainer(_xcontainer);
        return selector;
    }

    protected ImplementedBehaviorSelector newImplementedBehaviorSelector() {
        return new ImplementedBehaviorSelector();
    }

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
    @Bean(name="memberBhv")
    public MemberBhv createMemberBhv() {
        MemberBhv bhv = newMemberBhv();
        bhv.setBehaviorCommandInvoker(behaviorCommandInvoker); bhv.setBehaviorSelector(behaviorSelector);
        bhv.setCommonColumnAutoSetupper(commonColumnAutoSetupper);
        return bhv;
    }
    protected MemberBhv newMemberBhv() { return new MemberBhv(); }

    @Bean(name="memberAddressBhv")
    public MemberAddressBhv createMemberAddressBhv() {
        MemberAddressBhv bhv = newMemberAddressBhv();
        bhv.setBehaviorCommandInvoker(behaviorCommandInvoker); bhv.setBehaviorSelector(behaviorSelector);
        bhv.setCommonColumnAutoSetupper(commonColumnAutoSetupper);
        return bhv;
    }
    protected MemberAddressBhv newMemberAddressBhv() { return new MemberAddressBhv(); }

    @Bean(name="memberFollowingBhv")
    public MemberFollowingBhv createMemberFollowingBhv() {
        MemberFollowingBhv bhv = newMemberFollowingBhv();
        bhv.setBehaviorCommandInvoker(behaviorCommandInvoker); bhv.setBehaviorSelector(behaviorSelector);
        bhv.setCommonColumnAutoSetupper(commonColumnAutoSetupper);
        return bhv;
    }
    protected MemberFollowingBhv newMemberFollowingBhv() { return new MemberFollowingBhv(); }

    @Bean(name="memberLoginBhv")
    public MemberLoginBhv createMemberLoginBhv() {
        MemberLoginBhv bhv = newMemberLoginBhv();
        bhv.setBehaviorCommandInvoker(behaviorCommandInvoker); bhv.setBehaviorSelector(behaviorSelector);
        bhv.setCommonColumnAutoSetupper(commonColumnAutoSetupper);
        return bhv;
    }
    protected MemberLoginBhv newMemberLoginBhv() { return new MemberLoginBhv(); }

    @Bean(name="memberSecurityBhv")
    public MemberSecurityBhv createMemberSecurityBhv() {
        MemberSecurityBhv bhv = newMemberSecurityBhv();
        bhv.setBehaviorCommandInvoker(behaviorCommandInvoker); bhv.setBehaviorSelector(behaviorSelector);
        bhv.setCommonColumnAutoSetupper(commonColumnAutoSetupper);
        return bhv;
    }
    protected MemberSecurityBhv newMemberSecurityBhv() { return new MemberSecurityBhv(); }

    @Bean(name="memberServiceBhv")
    public MemberServiceBhv createMemberServiceBhv() {
        MemberServiceBhv bhv = newMemberServiceBhv();
        bhv.setBehaviorCommandInvoker(behaviorCommandInvoker); bhv.setBehaviorSelector(behaviorSelector);
        bhv.setCommonColumnAutoSetupper(commonColumnAutoSetupper);
        return bhv;
    }
    protected MemberServiceBhv newMemberServiceBhv() { return new MemberServiceBhv(); }

    @Bean(name="memberStatusBhv")
    public MemberStatusBhv createMemberStatusBhv() {
        MemberStatusBhv bhv = newMemberStatusBhv();
        bhv.setBehaviorCommandInvoker(behaviorCommandInvoker); bhv.setBehaviorSelector(behaviorSelector);
        bhv.setCommonColumnAutoSetupper(commonColumnAutoSetupper);
        return bhv;
    }
    protected MemberStatusBhv newMemberStatusBhv() { return new MemberStatusBhv(); }

    @Bean(name="memberWithdrawalBhv")
    public MemberWithdrawalBhv createMemberWithdrawalBhv() {
        MemberWithdrawalBhv bhv = newMemberWithdrawalBhv();
        bhv.setBehaviorCommandInvoker(behaviorCommandInvoker); bhv.setBehaviorSelector(behaviorSelector);
        bhv.setCommonColumnAutoSetupper(commonColumnAutoSetupper);
        return bhv;
    }
    protected MemberWithdrawalBhv newMemberWithdrawalBhv() { return new MemberWithdrawalBhv(); }

    @Bean(name="productBhv")
    public ProductBhv createProductBhv() {
        ProductBhv bhv = newProductBhv();
        bhv.setBehaviorCommandInvoker(behaviorCommandInvoker); bhv.setBehaviorSelector(behaviorSelector);
        bhv.setCommonColumnAutoSetupper(commonColumnAutoSetupper);
        return bhv;
    }
    protected ProductBhv newProductBhv() { return new ProductBhv(); }

    @Bean(name="productCategoryBhv")
    public ProductCategoryBhv createProductCategoryBhv() {
        ProductCategoryBhv bhv = newProductCategoryBhv();
        bhv.setBehaviorCommandInvoker(behaviorCommandInvoker); bhv.setBehaviorSelector(behaviorSelector);
        bhv.setCommonColumnAutoSetupper(commonColumnAutoSetupper);
        return bhv;
    }
    protected ProductCategoryBhv newProductCategoryBhv() { return new ProductCategoryBhv(); }

    @Bean(name="productStatusBhv")
    public ProductStatusBhv createProductStatusBhv() {
        ProductStatusBhv bhv = newProductStatusBhv();
        bhv.setBehaviorCommandInvoker(behaviorCommandInvoker); bhv.setBehaviorSelector(behaviorSelector);
        bhv.setCommonColumnAutoSetupper(commonColumnAutoSetupper);
        return bhv;
    }
    protected ProductStatusBhv newProductStatusBhv() { return new ProductStatusBhv(); }

    @Bean(name="purchaseBhv")
    public PurchaseBhv createPurchaseBhv() {
        PurchaseBhv bhv = newPurchaseBhv();
        bhv.setBehaviorCommandInvoker(behaviorCommandInvoker); bhv.setBehaviorSelector(behaviorSelector);
        bhv.setCommonColumnAutoSetupper(commonColumnAutoSetupper);
        return bhv;
    }
    protected PurchaseBhv newPurchaseBhv() { return new PurchaseBhv(); }

    @Bean(name="purchasePaymentBhv")
    public PurchasePaymentBhv createPurchasePaymentBhv() {
        PurchasePaymentBhv bhv = newPurchasePaymentBhv();
        bhv.setBehaviorCommandInvoker(behaviorCommandInvoker); bhv.setBehaviorSelector(behaviorSelector);
        bhv.setCommonColumnAutoSetupper(commonColumnAutoSetupper);
        return bhv;
    }
    protected PurchasePaymentBhv newPurchasePaymentBhv() { return new PurchasePaymentBhv(); }

    @Bean(name="regionBhv")
    public RegionBhv createRegionBhv() {
        RegionBhv bhv = newRegionBhv();
        bhv.setBehaviorCommandInvoker(behaviorCommandInvoker); bhv.setBehaviorSelector(behaviorSelector);
        bhv.setCommonColumnAutoSetupper(commonColumnAutoSetupper);
        return bhv;
    }
    protected RegionBhv newRegionBhv() { return new RegionBhv(); }

    @Bean(name="serviceRankBhv")
    public ServiceRankBhv createServiceRankBhv() {
        ServiceRankBhv bhv = newServiceRankBhv();
        bhv.setBehaviorCommandInvoker(behaviorCommandInvoker); bhv.setBehaviorSelector(behaviorSelector);
        bhv.setCommonColumnAutoSetupper(commonColumnAutoSetupper);
        return bhv;
    }
    protected ServiceRankBhv newServiceRankBhv() { return new ServiceRankBhv(); }

    @Bean(name="summaryProductBhv")
    public SummaryProductBhv createSummaryProductBhv() {
        SummaryProductBhv bhv = newSummaryProductBhv();
        bhv.setBehaviorCommandInvoker(behaviorCommandInvoker); bhv.setBehaviorSelector(behaviorSelector);
        return bhv;
    }
    protected SummaryProductBhv newSummaryProductBhv() { return new SummaryProductBhv(); }

    @Bean(name="summaryWithdrawalBhv")
    public SummaryWithdrawalBhv createSummaryWithdrawalBhv() {
        SummaryWithdrawalBhv bhv = newSummaryWithdrawalBhv();
        bhv.setBehaviorCommandInvoker(behaviorCommandInvoker); bhv.setBehaviorSelector(behaviorSelector);
        return bhv;
    }
    protected SummaryWithdrawalBhv newSummaryWithdrawalBhv() { return new SummaryWithdrawalBhv(); }

    @Bean(name="withdrawalReasonBhv")
    public WithdrawalReasonBhv createWithdrawalReasonBhv() {
        WithdrawalReasonBhv bhv = newWithdrawalReasonBhv();
        bhv.setBehaviorCommandInvoker(behaviorCommandInvoker); bhv.setBehaviorSelector(behaviorSelector);
        bhv.setCommonColumnAutoSetupper(commonColumnAutoSetupper);
        return bhv;
    }
    protected WithdrawalReasonBhv newWithdrawalReasonBhv() { return new WithdrawalReasonBhv(); }
}
