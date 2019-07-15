package org.docksidestage.app.web.base.handler;

import java.util.ArrayList;
import java.util.List;

public class ApiErrorResponse {

    private String cause;

    private List<ApiError> errors = new ArrayList<>();

    public String getCause() {
        return cause;
    }
    public void setCause(String cause) {
        this.cause = cause;
    }
    public List<ApiError> getErrors() {
        return errors;
    }
    public void setErrors(List<ApiError> errors) {
        this.errors = errors;
    }

    public void addError(String field, String message) {
        this.errors.add(new ApiError(field, message));
    }
}
