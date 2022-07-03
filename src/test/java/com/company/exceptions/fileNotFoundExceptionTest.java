package com.company.exceptions;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

public class fileNotFoundExceptionTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testThrowsFileNotFoundException() {
        thrown.expect(fileNotFoundException.class);
        thrown.expectMessage("something went wrong");
    }
}