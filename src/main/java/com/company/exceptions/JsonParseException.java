package com.company.exceptions;

public class JsonParseException extends RuntimeException {
    public JsonParseException(String errorMessage) {
        super(errorMessage);
    }

    public void printStackTrace() {
        // this is the error stack trace, in case needed
    }
}
