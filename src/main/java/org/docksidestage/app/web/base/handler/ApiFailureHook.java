package org.docksidestage.app.web.base.handler;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * APIのエラーハンドラ.
 * SpringのControllerAdviceで実装しているが内容はLastaFluteのApiFailureHookを参考にしているので、クラス名はLastaFluteに合わせた.
 *
 * @author y.shimizu
 */
@RestControllerAdvice
public class ApiFailureHook {
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(BindException.class)
    public ApiErrorResponse handleValidationExceptions(BindException ex) {
        ApiErrorResponse errors = new ApiErrorResponse();

        errors.setCause("VALIDATION_ERROR");

        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.addError(fieldName, errorMessage);
        });
        return errors;
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(RuntimeException.class)
    public ApiErrorResponse handleServerErrorExceptions(RuntimeException e) {
        ApiErrorResponse errors = new ApiErrorResponse();

        errors.setCause("SERVER_ERROR");
        errors.addError(null, "Internal Server Error (500)");

        return errors;
    }
}
