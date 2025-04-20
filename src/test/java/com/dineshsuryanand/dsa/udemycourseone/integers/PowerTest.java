package com.dineshsuryanand.dsa.udemycourseone.integers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerTest {
    @Test
    void testPositiveExponent() {
        assertEquals(1024.0, Power.myPow(2.0, 10));
    }

    @Test
    void testNegativeExponent() {
        assertEquals(0.25, Power.myPow(2.0, -2));
    }

    @Test
    void testZeroExponent() {
        assertEquals(1.0, Power.myPow(5.0, 0));
    }

    @Test
    void testOne() {
        assertEquals(1.0, Power.myPow(1.0, Integer.MAX_VALUE));
    }

    @Test
    void testNegativeIntegerLimit() {
        assertEquals(0.0, Power.myPow(2.0, Integer.MIN_VALUE));
    }

}