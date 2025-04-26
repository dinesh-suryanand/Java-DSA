package com.dineshsuryanand.dsa.udemycourseone.strings;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;
import java.util.stream.Stream;

public class RepeatedDNASequenceTest {

    static Stream<org.junit.jupiter.params.provider.Arguments> dnaTestCases() {
        return Stream.of(
                org.junit.jupiter.params.provider.Arguments.of("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT", List.of("AAAAACCCCC", "CCCCCAAAAA")),
                org.junit.jupiter.params.provider.Arguments.of("AAAAAAAAAAAAA", List.of("AAAAAAAAAA")),
                org.junit.jupiter.params.provider.Arguments.of("ACGTACGTAC", List.of()), // No repeats
                org.junit.jupiter.params.provider.Arguments.of("", List.of()) // Empty input
        );
    }

    @ParameterizedTest
    @MethodSource("dnaTestCases")
    void testFindRepeatedDnaSequences(String input, List<String> expected) {
        List<String> result = RepeatedDNASequence.findRepeatedDnaSequences(input);
        assertEquals(new HashSet<>(expected), new HashSet<>(result)); // compare sets to avoid order issues
    }



    //normal test
    @Test
    void testMultipleRepeats() {
        String input = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        List<String> expected = List.of("AAAAACCCCC", "CCCCCAAAAA");
        List<String> result = RepeatedDNASequence.findRepeatedDnaSequences(input);

        assertEquals(new HashSet<>(expected), new HashSet<>(result));
    }

}
