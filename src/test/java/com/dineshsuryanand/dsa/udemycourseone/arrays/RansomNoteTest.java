package com.dineshsuryanand.dsa.udemycourseone.arrays;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.*;
import java.util.stream.Stream;

public class RansomNoteTest {

    static Stream<org.junit.jupiter.params.provider.Arguments> data() {
        return Stream.of(
            org.junit.jupiter.params.provider.Arguments.of("a", "b", false),
            org.junit.jupiter.params.provider.Arguments.of("aa", "ab", false),
            org.junit.jupiter.params.provider.Arguments.of("aa", "aab", true),
            org.junit.jupiter.params.provider.Arguments.of("bg", "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj", true)
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void testCanConstruct(String ransomNote, String magazine, boolean expected) {
        assertEquals(expected, RansomNote.canConstruct(ransomNote, magazine));
    }
}
