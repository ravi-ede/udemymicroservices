package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(
        name = "Customer",
        description = "Schema to hold Customer and Account information"
)
public class CustomerDto {

    @Schema(
            description = "Name of the customer",
            example = "Ravikumar Ede"
    )
    @NotEmpty(message = "Name cannot be empty or Null")
    @Size(min = 5, max = 30, message = "The length of the customer name should be between 5 and 30")
    private String name;

    @Schema(
            description = "Email of the customer",
            example = "ravi.ede@gmail.com"
    )
    @Email(message = "Email address should be a valid value")
    @NotEmpty(message = "Email address cannot be empty or Null")
    private String email;

    @Schema(
            description = "Mobile Numer of the customer",
            example = "9686203067"
    )
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits")
    private String mobileNumber;

    @Schema(
            description = "Account Details of the customer"
    )
    private AccountsDto accountsDto;
}
