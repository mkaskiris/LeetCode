package org.leetcode.problems.binarySearch;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;
import static org.leetcode.problems.TestInputs.*;

@RunWith(Parameterized.class)
public class BinarySearchTest {
    private int[] nums;
    private int target;
    private int expected;

    public BinarySearchTest(int[] nums, int target, int expected) {
        this.nums = nums;
        this.target = target;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(BINARY_SEARCH);
    }

    @Test
    public void test() {
        BinarySearch solution = new BinarySearch();
        assertEquals(expected, solution.search(nums, target));
    }
}