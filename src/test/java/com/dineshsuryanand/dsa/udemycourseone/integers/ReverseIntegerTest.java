package com.dineshsuryanand.dsa.udemycourseone.integers;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReverseIntegerTest {

    @Test
    void testPositiveNumber() {
        assertEquals(321, ReverseInteger.reverse(123));
    }

    @Test
    void testNegativeNumber() {
        assertEquals(-321, ReverseInteger.reverse(-123));
    }

    @Test
    void testEndsWithZero() {
        assertEquals(21, ReverseInteger.reverse(120));
    }

    @Test
    void testZero() {
        assertEquals(0, ReverseInteger.reverse(0));
    }

    @Test
    void testOverflow() {
        assertEquals(0, ReverseInteger.reverse(1534236469)); // Overflows
    }

    @Test
    void testNegativeOverflow() {
        assertEquals(0, ReverseInteger.reverse(-1563847412)); // Overflows
    }

    @Test
    void testNegativeNoOverflow() {
        assertEquals(-2143847412, ReverseInteger.reverse(-2147483412)); // ✅ Valid reverse
    }

}
