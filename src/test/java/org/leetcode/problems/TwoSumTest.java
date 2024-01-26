package org.leetcode.problems;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(Parameterized.class)
public class TwoSumTest {
    private int[] nums;
    private int target;
    private int[] expected;

    // Constructor for parameterized test
    public TwoSumTest(int[] nums, int target, int[] expected) {
        this.nums = nums;
        this.target = target;
        this.expected = expected;
    }

    // Define the parameters
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{2, 7, 11, 15}, 9, new int[]{0, 1}},
                {new int[]{3, 2, 4}, 6, new int[]{1, 2}},
                // Add more test cases as needed
        });
    }

    // Actual test method
    @Test
    public void testTwoSum() {
        TwoSum solution = new TwoSum();
        assertArrayEquals(expected, solution.twoSum(nums, target));
    }

}