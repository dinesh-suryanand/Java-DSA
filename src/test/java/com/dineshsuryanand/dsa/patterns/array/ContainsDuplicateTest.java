package com.dineshsuryanand.dsa.patterns.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {

    ContainsDuplicate solution = new ContainsDuplicate();

    @Test
    public void testEmptyArray() {
        int[] nums = {};
        assertFalse(solution.containsDuplicate(nums));
    }

    @Test
    public void testSingleElementArray() {
        int[] nums = {1};
        assertFalse(solution.containsDuplicate(nums));
    }

    @Test
    public void testArrayWithDuplicates() {
        int[] nums = {1, 2, 3, 1};
        assertTrue(solution.containsDuplicate(nums));
    }

    @Test
    public void testArrayWithoutDuplicates() {
        int[] nums = {1, 2, 3, 4};
        assertFalse(solution.containsDuplicate(nums));
    }

    @Test
    public void testArrayWithAllDuplicates() {
        int[] nums = {1, 1, 1, 1};
        assertTrue(solution.containsDuplicate(nums));
    }

    @Test
    public void testArrayWithMixedDuplicates() {
        int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        assertTrue(solution.containsDuplicate(nums));
    }

    @Test
    public void testArrayWithNegativeNumbers() {
        int[] nums = {-1, -2, -3, -1};
        assertTrue(solution.containsDuplicate(nums));
    }

}