package com.dineshsuryanand.dsa.udemycourseone.integers;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialTrailingZerosTest {

    @Test
    void testSmallNumbers() {
        assertEquals(0, FactorialTrailingZeros.trailingZeroes(4));
        assertEquals(1, FactorialTrailingZeros.trailingZeroes(5));
        assertEquals(2, FactorialTrailingZeros.trailingZeroes(10));
    }

    @Test
    void testLargeNumbers() {
        assertEquals(24, FactorialTrailingZeros.trailingZeroes(100));
        assertEquals(249, FactorialTrailingZeros.trailingZeroes(1000));
    }

    @Test
    void testEdgeCases() {
        assertEquals(0, FactorialTrailingZeros.trailingZeroes(0));
        assertEquals(0, FactorialTrailingZeros.trailingZeroes(1));
    }
}
