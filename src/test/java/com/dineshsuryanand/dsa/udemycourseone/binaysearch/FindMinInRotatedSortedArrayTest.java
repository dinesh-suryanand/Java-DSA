package com.dineshsuryanand.dsa.udemycourseone.binaysearch;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FindMinInRotatedSortedArrayTest {

    @Test
    void testExample() {
        assertEquals(1, FindMinInRotatedSortedArray.findMin(new int[]{3,4,5,1,2}));
    }

    @Test
    void testNoRotation() {
        assertEquals(1, FindMinInRotatedSortedArray.findMin(new int[]{1,2,3,4,5}));
    }

    @Test
    void testSingleElement() {
        assertEquals(5, FindMinInRotatedSortedArray.findMin(new int[]{5}));
    }

    @Test
    void testTwoElements() {
        assertEquals(1, FindMinInRotatedSortedArray.findMin(new int[]{2,1}));
    }
}
