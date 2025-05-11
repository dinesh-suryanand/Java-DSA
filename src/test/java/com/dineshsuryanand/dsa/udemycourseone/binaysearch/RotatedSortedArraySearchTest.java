package com.dineshsuryanand.dsa.udemycourseone.binaysearch;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RotatedSortedArraySearchTest {

    @Test
    void testExampleCase() {
        int[] nums = {4,5,6,7,0,1,2};
        assertEquals(4, RotatedSortedArraySearch.search(nums, 0));
    }

    @Test
    void testNotFound() {
        int[] nums = {4,5,6,7,0,1,2};
        assertEquals(-1, RotatedSortedArraySearch.search(nums, 3));
    }

    @Test
    void testSingleElement() {
        int[] nums = {1};
        assertEquals(0, RotatedSortedArraySearch.search(nums, 1));
        assertEquals(-1, RotatedSortedArraySearch.search(nums, 0));
    }

    @Test
    void testNoRotation() {
        int[] nums = {1, 2, 3, 4, 5};
        assertEquals(2, RotatedSortedArraySearch.search(nums, 3));
    }
}
