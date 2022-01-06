package org.docksidestage.bizfw.utils;

import org.springframework.lang.Nullable;

/**
 * このExampleプロジェクト固有のStringゆーてぃる。
 * 
 * <p>実際の業務ではプロジェクトで選んだ "Stringゆーてぃる" を使うと思われるが、
 * Exampleプロジェクトでは何か特定のものに依存しないようにと自前で用意している。
 * (Spring Frameworkのときのお約束ゆーてぃるってある？) </p>
 * 
 * @author subaru
 * @author y.shimizu
 * @author jflute
 */
public class ExampleStringUtils {

    public static boolean isNotEmpty(@Nullable String str) {
        return str != null && !str.isEmpty();
    }

    public static boolean isEmpty(@Nullable String str) {
        return str == null || str.isEmpty();
    }
}
