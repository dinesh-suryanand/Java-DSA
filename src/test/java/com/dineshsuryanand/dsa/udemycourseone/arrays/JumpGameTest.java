package com.dineshsuryanand.dsa.udemycourseone.arrays;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;

public class JumpGameTest {

    static Stream<Arguments> data() {
        return Stream.of(
            Arguments.of(new int[]{2,3,1,1,4}, true),
            Arguments.of(new int[]{3,2,1,0,4}, false),
            Arguments.of(new int[]{0}, true),
            Arguments.of(new int[]{2,0,0}, true),
            Arguments.of(new int[]{1,0,1,0}, false)
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void testCanJump(int[] nums, boolean expected) {
        assertEquals(expected, JumpGame.canJump(nums));
    }
}
