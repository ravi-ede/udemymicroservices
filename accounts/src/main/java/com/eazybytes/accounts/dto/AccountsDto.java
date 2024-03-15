package com.eazybytes.accounts.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class AccountsDto {

    @Pattern(regexp = "(^$|[0-9]{10})", message = "Account number must be 10 digits")
    @NotEmpty(message = "Account number cannot be empty or Null")
    private Long accountNumber;

    @NotEmpty(message = "Account Type cannot be empty or Null")
    private String accountType;

    @NotEmpty(message = "Branch Address cannot be empty or Null")
    private String branchAddress;
}
