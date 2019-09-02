package org.docksidestage.app.web.base.handler;

import java.util.ArrayList;
import java.util.List;

/**
 * @author y,shimizu
 */
public class ApiError {

    private String field;

    private final List<String> messages = new ArrayList<>();

    public ApiError(String field) {
        this.field = field;
    }
    public String getField() {
        return field;
    }
    public List<String> getMessages() {
        return messages;
    }
    public void addMessage(String message) { messages.add(message); }

}
