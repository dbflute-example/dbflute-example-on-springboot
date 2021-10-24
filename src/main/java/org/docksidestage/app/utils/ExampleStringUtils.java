package org.docksidestage.app.utils;

import org.springframework.lang.Nullable;
import org.springframework.util.StringUtils;

/**
 * @author subaru
 */
public class ExampleStringUtils extends StringUtils {
    public static boolean isNotEmpty(@Nullable String str) {
        return hasLength(str);
    }
}
