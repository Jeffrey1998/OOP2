package com.company.exceptions;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

class JsonParseExceptionTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void JsonParseExceptionTest() {
        thrown.expect(incorrectFilenameException.class);
        thrown.expectMessage("something went wrong");
    }
}