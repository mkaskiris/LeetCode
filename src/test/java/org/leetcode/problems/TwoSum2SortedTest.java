package org.leetcode.problems;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;
import static org.leetcode.problems.TestInputs.*;

@RunWith(Parameterized.class)
public class TwoSum2SortedTest {
    private int[] nums;
    private int target;
    private int[] expected;

    public TwoSum2SortedTest(int[] nums, int target, int[] expected) {
        this.nums = nums;
        this.target = target;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(TWO_SUM_NEW);
    }

    @Test
    public void test() {
        TwoSum2Sorted solution = new TwoSum2Sorted();
        assertArrayEquals(expected, solution.twoSum(nums,target));
    }
}