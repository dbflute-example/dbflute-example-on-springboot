/*
 * Copyright 2014-2018 the original author or authors.
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
package org.docksidestage.app.web.member;

import java.io.Serializable;
import java.time.LocalDate;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author jflute
 */
public class MemberSearchForm implements Serializable {

    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                             Condition
    //                                             ---------
    @NotEmpty
    private String memberName;
    public String memberStatus;
    public String purchaseProductName;
    public boolean unpaid;
    private LocalDate formalizedDateFrom;
    public LocalDate formalizedDateTo;

    // -----------------------------------------------------
    //                                                Paging
    //                                                ------
    private Integer pageNumber = 1;

    // ===================================================================================
    //                                                                               Reset
    //                                                                               =====
    public void reset() {
        unpaid = false;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    public String toString() {
        return "{" + memberName + ", " + memberStatus + ", " + pageNumber + "}";
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberStatus() {
        return memberStatus;
    }

    public void setMemberStatus(String memberStatus) {
        this.memberStatus = memberStatus;
    }

    public LocalDate getFormalizedDateFrom() {
        return formalizedDateFrom;
    }

    public void setFormalizedDateFrom(LocalDate formalizedDateFrom) {
        this.formalizedDateFrom = formalizedDateFrom;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }
}
