package com.dineshsuryanand.dsa.udemycourseone.integers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerToRomanTest {

    @Test
    void testSimple() {
        assertEquals("III", IntegerToRoman.toRoman(3));
        assertEquals("IV", IntegerToRoman.toRoman(4));
        assertEquals("IX", IntegerToRoman.toRoman(9));
    }

    @Test
    void testComplex() {
        assertEquals("LVIII", IntegerToRoman.toRoman(58));       // L=50, V=5, III=3
        assertEquals("MCMXCIV", IntegerToRoman.toRoman(1994));   // M=1000, CM=900, XC=90, IV=4
    }


}