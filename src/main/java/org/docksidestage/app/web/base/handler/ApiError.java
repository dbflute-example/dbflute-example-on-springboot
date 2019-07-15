package org.docksidestage.app.web.base.handler;

import java.util.ArrayList;
import java.util.List;

public class ApiError {

    private String field;

    private List<String> messages = new ArrayList<>();

    public ApiError(String field, String message) {
        this.field = field;
        messages.add(message);
    }
    public String getField() {
        return field;
    }
    public void setField(String field) {
        this.field = field;
    }
    public List<String> getMessages() {
        return messages;
    }
    public void setMessages(List<String> messages) {
        this.messages = messages;
    }

}
