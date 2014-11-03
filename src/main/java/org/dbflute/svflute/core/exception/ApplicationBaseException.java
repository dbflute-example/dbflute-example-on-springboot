/*
 * Copyright 2014-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.dbflute.svflute.core.exception;

/**
 * The base exception caused by application user's operation.
 * @author jflute
 */
public abstract class ApplicationBaseException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected String messageKey;
    protected Object[] args;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public ApplicationBaseException(String debugMsg) {
        super(debugMsg);
    }

    public ApplicationBaseException(String debugMsg, Throwable cause) {
        super(debugMsg, cause);
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public String getErrorKey() {
        return messageKey;
    }

    public Object[] getErrorArgs() {
        return args;
    }

    public void saveErrors(String messageKey, Object... args) {
        this.messageKey = messageKey;
        this.args = args;
    }
}
