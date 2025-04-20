package com.dineshsuryanand.dsa.udemycourseone.integers;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {

    private final FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void testFizzBuzz_1() {
        List<String> result = fizzBuzz.fizzBuzz(1);
        assertEquals(List.of("1"), result);
    }

    @Test
    void testFizzBuzz_5() {
        List<String> result = fizzBuzz.fizzBuzz(5);
        assertEquals(List.of("1", "2", "Fizz", "4", "Buzz"), result);
    }

    @Test
    void testFizzBuzz_15() {
        List<String> result = fizzBuzz.fizzBuzz(15);
        assertEquals(
                List.of(
                        "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz",
                        "11", "Fizz", "13", "14", "FizzBuzz"
                ),
                result
        );
    }

    @Test
    void testFizzBuzz_Zero() {
        List<String> result = fizzBuzz.fizzBuzz(0);
        assertEquals(List.of(), result);
    }
}
