package com.dineshsuryanand.dsa.udemycourseone.arrays;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import java.util.List;
import java.util.stream.Stream;

public class SequentialDigitsTest {

    static Stream<Arguments> data() {
        return Stream.of(
            Arguments.of(100, 300, List.of(123, 234)),
            Arguments.of(1000, 13000, List.of(1234, 2345, 3456, 4567, 5678, 6789, 12345))
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void testSequentialDigits(int low, int high, List<Integer> expected) {
        assertEquals(expected, SequentialDigits.sequentialDigits(low, high));
    }
}
