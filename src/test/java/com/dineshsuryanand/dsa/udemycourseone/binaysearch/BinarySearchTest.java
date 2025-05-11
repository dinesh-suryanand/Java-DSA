package com.dineshsuryanand.dsa.udemycourseone.binaysearch;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {

    @Test
    void testFoundMiddle() {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        assertEquals(4, BinarySearch.search(nums, 9));
    }

    @Test
    void testNotFound() {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        assertEquals(-1, BinarySearch.search(nums, 2));
    }

    @Test
    void testSingleElement() {
        int[] nums = {1};
        assertEquals(0, BinarySearch.search(nums, 1));
        assertEquals(-1, BinarySearch.search(nums, 2));
    }

    @Test
    void testEmptyArray() {
        int[] nums = {};
        assertEquals(-1, BinarySearch.search(nums, 1));
    }
    // if it has duplicates we are not sure about the taget element order
    @Test
    void testDuplicatesArray() {
        int[] nums = {1,1,1,5};
        assertEquals(1, BinarySearch.search(nums, 1));
    }
}

