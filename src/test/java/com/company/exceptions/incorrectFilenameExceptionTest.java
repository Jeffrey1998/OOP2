package com.company.exceptions;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

public class incorrectFilenameExceptionTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testThrowsIncorrectFileNameException() {
        thrown.expect(incorrectFilenameException.class);
        thrown.expectMessage("something went wrong");
    }
}