package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name = "Accounts",
        description = "Schema to hold Acocunt Information"
)
public class AccountsDto {

    @Schema(
            description = "Account Number  of the customer",
            example = "1234567890"
    )
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Account number must be 10 digits")
    @NotEmpty(message = "Account number cannot be empty or Null")
    private Long accountNumber;

    @Schema(
            description = "Account type of the customer",
            example = "Savings"
    )
    @NotEmpty(message = "Account Type cannot be empty or Null")
    private String accountType;

    @Schema(
            description = "Branch Address of the customer",
            example = "123, New York"
    )
    @NotEmpty(message = "Branch Address cannot be empty or Null")
    private String branchAddress;
}
