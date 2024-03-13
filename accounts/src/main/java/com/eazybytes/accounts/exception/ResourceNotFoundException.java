package com.eazybytes.accounts.exception;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String customer, String mobileNumber, String mobileNumber1) {
        super(String.format("%s not found with the given input data %s : %s", customer, mobileNumber, mobileNumber1));
    }
}
