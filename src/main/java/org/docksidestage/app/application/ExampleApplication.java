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
package org.docksidestage.app.application;

import org.docksidestage.dbflute.allcommon.DBFluteBeansJavaConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

/**
 * The entry point class to boot this example application by SpringBoot.
 * @author jflute
 */
@SpringBootApplication
@ComponentScan("org.docksidestage.app")
@Import(DBFluteBeansJavaConfig.class)
public class ExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExampleApplication.class, args);
    }

    // _/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/
    // [補足] DBFluteの自動生成クラスや業務フレームワーク(bizfw)をComponentScanの対象から外している。
    // スキャンスピードを少しでも早くするため必要ないことが確定しているパッケージは対象外に。
    // (このExampleでは、appパッケージ配下だけスキャン対象にするようにしている)
    //
    // DBFluteの自動生成クラスにはスキャン対象のコンポーネントはなく、
    // 代わりに自動生成されたJavaConfigをアプリケーションにてImportすること。
    // _/_/_/_/_/_/_/_/_/_/
}
