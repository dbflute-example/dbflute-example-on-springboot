package org.docksidestage.app.web.base.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * APIのエラーハンドラ.
 * 返却するレスポンス内容はLastaFluteのApiFailureHookを元にしている.
 *
 * @author y.shimizu
 */
@RestControllerAdvice
public class ApiErrorHandler {

    private static final Logger logger = LoggerFactory.getLogger(ApiErrorHandler.class);

    /**
     * Rest APIのGETリクエストで指定されたパラメータにエラーが発生した場合、SpringでBindExceptionが発生し、Controllerは呼ばれず処理は継続されない.
     * このメソッドでハンドリングされるケースはLastaFluteのクライアントエラーに相当する.
     *
     * なお、@RestControllerを用いたSpringでのRest APIではControllerまで処理を続行できないため、LastaFluteのバリデーションエラーに相当するケースはないと考える.
     *
     * Springで発生する例外の参考：
     * http://terasolunaorg.github.io/guideline/5.5.1.RELEASE/ja/ArchitectureInDetail/WebServiceDetail/REST.html#resthowtouseexceptionhandlingforvalidationerror
     */
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(BindException.class)
    public ApiErrorResponse handleClientErrorExceptions(BindException ex) {
        logger.debug("BindException is caught", ex);

        ApiErrorResponse errors = new ApiErrorResponse();

        errors.setCause("VALIDATION_ERROR");

        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.addError(fieldName, errorMessage);
        });
        return errors;
    }

    /**
     * プログラムで継続不可能な例外が発生した場合、RuntimeExceptionがthrowされ処理が中断している.
     * このメソッドでハンドリングされるケースはLastaFluteのサーバーエラーに相当する.
     */
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(RuntimeException.class)
    public ApiErrorResponse handleServerErrorExceptions(RuntimeException e) {
        ApiErrorResponse errors = new ApiErrorResponse();

        errors.setCause("SERVER_ERROR");
        // HTTP Statusが500なので、メッセージを利用したハンドリングはされない思想の元空にしている
        // メッセージが設定されていても問題ないだろう
        errors.addError(null, "");

        return errors;
    }
}
