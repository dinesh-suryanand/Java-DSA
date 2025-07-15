package com.dineshsuryanand.dsa.udemycourseone.arrays;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import java.util.stream.Stream;
import java.util.Arrays;

public class ProductExceptSelfTest {

    static Stream<Arguments> data() {
        return Stream.of(
            Arguments.of(new int[]{1,2,3,4}, new int[]{24,12,8,6}),
            Arguments.of(new int[]{-1,1,0,-3,3}, new int[]{0,0,9,0,0}),
            Arguments.of(new int[]{2,3,4,5}, new int[]{60,40,30,24})
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void testProductExceptSelf(int[] input, int[] expected) {
        assertArrayEquals(expected, ProductExceptSelf.productExceptSelf(input));
    }
}
