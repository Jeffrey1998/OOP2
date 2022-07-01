package com.company.exceptions;

public class incorrectFilenameException extends Exception {
    public incorrectFilenameException(String errorMessage) {
        super(errorMessage);
    }
}
