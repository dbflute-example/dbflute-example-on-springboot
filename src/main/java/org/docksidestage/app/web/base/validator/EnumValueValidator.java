package org.docksidestage.app.web.base.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.docksidestage.app.utils.ExampleStringUtils;

/**
 * @EnumType アノテーションが付与されたプロパティ値のバリデータ.
 *
 * @author y.shimizu
 */
public class EnumValueValidator implements ConstraintValidator<EnumType, String> {
    private EnumType annotation;

    @Override
    public void initialize(EnumType constraintAnnotation) {
        this.annotation = constraintAnnotation;
    }

    @Override
    public boolean isValid(String validationTarget, ConstraintValidatorContext constraintValidatorContext) {
        if (ExampleStringUtils.isEmpty(validationTarget)) {
            return true;
        }

        boolean result = false;

        Object[] enumValues = this.annotation.enumClass().getEnumConstants();

        if (enumValues != null) {
            for (Object enumValue : enumValues) {
                if (validationTarget.equals(enumValue.toString()) || (this.annotation.ignoreCase() && validationTarget.equalsIgnoreCase(
                        enumValue.toString()))) {
                    result = true;
                    break;
                }
            }
        }

        return result;
    }
}
