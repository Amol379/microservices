package com.adsoft.accounts.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.*;
import lombok.Data;

@Data
@Schema(
        name = "Customer",
        description = "Schema to hold customer and Account information"
)
public class CustomerDto {

    @Schema(description = "Email address of the customer",example = "adeshmukh@gmail.com")
    @NotEmpty(message = "Email can not br null or empty")
    @Email(message = "Email address should be valid value")
    private String email;

    @Schema(description = "Name of the customer",example = "Amol")
    @NotEmpty(message = "Name can not be null or empty")
    @Size(min = 4, max = 30, message = "The length of customer name should be between 4 and 30")
    private String name;

    @Schema(description = "Mobile number of the customer",example = "9090909090")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits")
    private String mobileNumber;

    @Schema(description = "Account details of the customer")
    private AccountDto accountDto;
}
