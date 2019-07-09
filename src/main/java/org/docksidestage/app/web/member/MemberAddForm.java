package org.docksidestage.app.web.member;

import java.time.LocalDate;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author jflute
 */
@Data
public class MemberAddForm {
    @NotEmpty
    private String memberName;

    @NotEmpty
    private String memberAccount;

    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthdate;

    @NotEmpty
    private String memberStatus;
}
