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

import java.time.LocalDate;

import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author jflute
 */
@Data
public class MemberSearchForm {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                             Condition
    //                                             ---------
    @Length(max = 5)
    private String memberName;

    private String memberStatus;

    @Length(max = 10)
    private String purchaseProductName;

    private boolean unpaid;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate formalizedDateFrom;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate formalizedDateTo;

    // -----------------------------------------------------
    //                                                Paging
    //                                                ------
    private Integer pageNumber = 1;
}
