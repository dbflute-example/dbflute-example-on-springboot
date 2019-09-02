package org.docksidestage.app.web.base;

import org.docksidestage.app.web.base.handler.ApiErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

/**
 * API用の基底クラス.
 * エラー時のレスポンス処理を共通化しているので、各APIではこのクラスを継承して実装する.
 *
 * @author y.shimizu
 */
public class ApiBaseController {

    /**
     * LastaFluteでいうクライアントエラーの場合
     * システムの不具合ではなく、リクエストを投げたクライアントの不備によって処理が継続できないときにこのメソッドを呼ぶ.
     */
    public ResponseEntity clientError() {
        ApiErrorResponse errors = new ApiErrorResponse();

        errors.setCause("CLIENT_ERROR");

        return new ResponseEntity(errors, HttpStatus.BAD_REQUEST);
    }

    /**
     * LastaFluteでいうバリデーションエラーの場合
     * ユーザの入力不備などリトライすれば
     */
    public ResponseEntity validationError(BindingResult result) {
        ApiErrorResponse errors = new ApiErrorResponse();

        errors.setCause("VALIDATION_ERROR");

        result.getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.addError(fieldName, errorMessage);
        });

        return new ResponseEntity(errors, HttpStatus.BAD_REQUEST);
    }
}
