package org.leetcode.problems;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.leetcode.problems.TestInputs.*;

@RunWith(Parameterized.class)
public class ThreeSumTest {
    private int[] nums;
    private List<List<Integer>> expected;

    public ThreeSumTest(int[] nums, List<List<Integer>> expected) {
        this.nums = nums;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(THREE_SUM);
    }

    @Test
    public void test() {
        ThreeSum solution = new ThreeSum();
        assertEquals(expected, solution.threeSum(nums));
    }
}