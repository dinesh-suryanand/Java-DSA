package com.dineshsuryanand.dsa.udemycourseone.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringReverseTest {

    @Test
    void testReverse() {
        char[] input = {'h','e','l','l','o'};
        StringReverse.reverse(input);
        assertArrayEquals(new char[]{'o','l','l','e','h'}, input);
    }


}