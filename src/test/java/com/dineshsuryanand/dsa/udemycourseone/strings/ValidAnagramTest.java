package com.dineshsuryanand.dsa.udemycourseone.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

public class ValidAnagramTest {

    @ParameterizedTest
    @CsvSource({
        "'anagram', 'nagaram', true",     // Anagram test
        "'rat', 'car', false",            // Not anagram
        "'a', 'ab', false",               // Different lengths
        "'', '', true"                    // Empty strings
    })
    void testIsAnagram(String s, String t, boolean expected) {
        assertEquals(expected, ValidAnagram.isAnagram(s, t));
    }
}
