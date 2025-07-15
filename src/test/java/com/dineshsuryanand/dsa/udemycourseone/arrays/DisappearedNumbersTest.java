package com.dineshsuryanand.dsa.udemycourseone.arrays;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class DisappearedNumbersTest {

    static Stream<Arguments> data() {
        return Stream.of(
            Arguments.of(new int[]{4, 3, 2, 7, 8, 2, 3, 1}, List.of(5, 6)),
            Arguments.of(new int[]{1, 1}, List.of(2)),
            Arguments.of(new int[]{2, 2}, List.of(1))
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void testFindDisappearedNumbers(int[] input, List<Integer> expected) {
        assertEquals(expected, DisappearedNumbers.findDisappearedNumbers(input.clone()));
    }
}
