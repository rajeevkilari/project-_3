package com.spring.demo.Thymeleaf.customer_info;

import jakarta.validation.constraints.*;

public class CustomerEntity {
    public String firstName;
    @NotNull(message="is required")
    @Size(min=3, message="is required")
    public String lastName;

    @Min(value = 1, message = "must be greater than or equal to one")
    @Max(value = 10, message = "must be less than or equal to ten")
    @NotNull(message= "is required")
    public int freePasses;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message= "only 5 characters/digits")
    public String postalCode;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public int getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(int freePasses) {
        this.freePasses = freePasses;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
