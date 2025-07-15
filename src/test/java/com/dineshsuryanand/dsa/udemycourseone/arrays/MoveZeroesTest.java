package com.dineshsuryanand.dsa.udemycourseone.arrays;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.*;
import java.util.stream.Stream;

public class MoveZeroesTest {

    static Stream<org.junit.jupiter.params.provider.Arguments> data() {
        return Stream.of(
                org.junit.jupiter.params.provider.Arguments.of(
                        new int[]{0,1,0,3,12,3,2,0,0,0,0,4}, new int[]{1,3,12,3,2,4,0,0,0,0,0,0}
                ),
                org.junit.jupiter.params.provider.Arguments.of(
                        new int[]{0,0,1}, new int[]{1,0,0}
                ),
                org.junit.jupiter.params.provider.Arguments.of(
                        new int[]{1,2,3}, new int[]{1,2,3}
                )
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void testMoveZeroes(int[] input, int[] expected) {
        MoveZeroes.moveZeroes(input);
        assertArrayEquals(expected, input);
    }
}
