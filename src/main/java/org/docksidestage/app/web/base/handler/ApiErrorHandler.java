package org.docksidestage.app.web.base.handler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * APIのエラーハンドラ.
 *
 * @author y.shimizu
 * @author jflute
 */
@RestControllerAdvice
public class ApiErrorHandler {

    /**
     * プログラムで継続不可能な例外が発生した場合、RuntimeExceptionがthrowされ処理が中断している.
     * このメソッドでハンドリングされるケースはLastaFluteのサーバーエラーに相当する.
     * @param e The exception from API application. (NotNull)
     * @return The response of API error, containing cause and errors information. (NotNull)
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
