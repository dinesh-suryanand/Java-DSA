package com.dineshsuryanand.dsa.udemycourseone.arrays;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import java.util.Arrays;

public class RotateArrayTest {

    static Stream<org.junit.jupiter.params.provider.Arguments> data() {
        return Stream.of(
            org.junit.jupiter.params.provider.Arguments.of(
                new int[]{1,2,3,4,5,6,7}, 3, new int[]{5,6,7,1,2,3,4}),
            org.junit.jupiter.params.provider.Arguments.of(
                new int[]{-1,-100,3,99}, 2, new int[]{3,99,-1,-100}),
            org.junit.jupiter.params.provider.Arguments.of(
                new int[]{1}, 0, new int[]{1}),
            org.junit.jupiter.params.provider.Arguments.of(
                new int[]{1}, 5, new int[]{1})
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void testRotate(int[] nums, int k, int[] expected) {
        RotateArray.rotate(nums, k);
        assertArrayEquals(expected, nums);
    }
}
