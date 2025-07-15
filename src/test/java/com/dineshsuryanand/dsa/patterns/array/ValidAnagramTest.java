package com.dineshsuryanand.dsa.patterns.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramTest {

    ValidAnagram validAnagram = new ValidAnagram();

    @Test
    public void testFalse() {
        assertFalse(validAnagram.isAnagram("apple","dappl"));
    }

    @Test
    public void testEmptyStrings() {
        assertTrue(validAnagram.isAnagram("",""));
    }

    @Test
    public void testAlphaNumericStrings() {

        assertTrue(validAnagram.isAnagram("listen2", "si2lent"));
    }
}