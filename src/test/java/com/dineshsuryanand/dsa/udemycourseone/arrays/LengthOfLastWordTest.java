package com.dineshsuryanand.dsa.udemycourseone.arrays;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.*;
import java.util.stream.Stream;

public class LengthOfLastWordTest {

    static Stream<org.junit.jupiter.params.provider.Arguments> data() {
        return Stream.of(
            org.junit.jupiter.params.provider.Arguments.of("Hello World", 5),
            org.junit.jupiter.params.provider.Arguments.of("   fly me   to   the moon  ", 4),
            org.junit.jupiter.params.provider.Arguments.of("luffy is still joyboy", 6),
            org.junit.jupiter.params.provider.Arguments.of("a", 1),
            org.junit.jupiter.params.provider.Arguments.of("day  ", 3)
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void testLengthOfLastWord(String input, int expected) {
        assertEquals(expected, LengthOfLastWord.lengthOfLastWord(input));
    }
}
