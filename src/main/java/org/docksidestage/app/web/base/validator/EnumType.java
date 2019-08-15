package org.docksidestage.app.web.base.validator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

/**
 * Stringの値が指定されたEnum型で取り得る値かどうかチェックしたい場合に付与するアノテーション.
 *
 * <pre>
 * 利用方法例：StringプロパティproductStatusがCDef.ProductStatusで取り得る値かチェックする
 *
 * @EnumType(enumClass = CDef.ProductStatus.class)
 * private String productStatus;
 * </pre>
 *
 * @author y.shimizu
 */
@Constraint(validatedBy = { EnumValueValidator.class })
@Target({ ElementType.FIELD, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
public @interface EnumType {
    String message() default "";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    Class<? extends java.lang.Enum<?>> enumClass();

    // lastaflute-example-harborでは大文字と小文字を区別していないのでデフォルトtrueとする
    boolean ignoreCase() default true;
}
