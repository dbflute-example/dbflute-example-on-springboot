package org.docksidestage.app.web.base.handler;

import java.util.ArrayList;
import java.util.List;

/**
 * @author y.shimizu
 */
public class ApiErrorResponse {

    private String cause;

    private final List<ApiError> errors = new ArrayList<>();

    public String getCause() {
        return cause;
    }
    public void setCause(String cause) {
        this.cause = cause;
    }
    public List<ApiError> getErrors() {
        return errors;
    }

    public void addError(String field, String message) {
        this.errors.add(new ApiError(field, message));
    }
}
