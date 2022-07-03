package com.company.exceptions;

public class fileNotFoundException extends Exception {
    public fileNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}