package org.docksidestage.app.util;

import org.springframework.lang.Nullable;
import org.springframework.util.StringUtils;

/**
 * @author subaru
 */
public class ExampleStringUtils extends StringUtils {
    public static boolean isNotEmpty(@Nullable Object str) {
        return !isEmpty(str);
    }
}
