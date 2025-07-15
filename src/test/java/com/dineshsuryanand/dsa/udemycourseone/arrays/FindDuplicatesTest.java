package com.dineshsuryanand.dsa.udemycourseone.arrays;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import java.util.List;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.*;

public class FindDuplicatesTest {

    static Stream<Arguments> data() {
        return Stream.of(
            Arguments.of(new int[]{4,3,2,7,8,2,3,1}, List.of(2, 3)),
            Arguments.of(new int[]{1,1,2}, List.of(1)),
            Arguments.of(new int[]{1}, List.of())
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void testFindDuplicates(int[] input, List<Integer> expected) {
        assertEquals(expected, FindDuplicates.findDuplicates(input.clone()));
    }
}
