package org.docksidestage.app.utils;

import org.springframework.lang.Nullable;

/**
 * @author subaru
 */
public class ExampleStringUtils {
    public static boolean isNotEmpty(@Nullable String str) {
        return str != null && !str.isEmpty();
    }

    public static boolean isEmpty(@Nullable String str) {
        return str == null || str.isEmpty();
    }
}
