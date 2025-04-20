package com.dineshsuryanand.dsa.udemycourseone.integers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegersTest {

    @Test
    public void test() {
        assertEquals(7,RomanToIntegers.convert("VII"));
    }

    @Test
    public void test2() {
        assertEquals(9,RomanToIntegers.convert("IX"));
    }

    @Test
    public void testComplexNumbers() {
        assertEquals(58, RomanToIntegers.convert("LVIII")); // L=50, V=5, III=3
        assertEquals(1994, RomanToIntegers.convert("MCMXCIV")); // M=1000, CM=900, XC=90, IV=4
        assertEquals(3999, RomanToIntegers.convert("MMMCMXCIX"));
    }
}