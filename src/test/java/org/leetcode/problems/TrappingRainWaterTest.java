package org.leetcode.problems;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;
import static org.leetcode.problems.TestInputs.*;

@RunWith(Parameterized.class)
public class TrappingRainWaterTest {
    private int[] nums;
    private int expected;

    public TrappingRainWaterTest(int[] nums, int expected) {
        this.nums = nums;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(TRAP);
    }

    @Test
    public void test() {
        TrappingRainWater solution = new TrappingRainWater();
        assertEquals(expected, solution.trap(nums));
    }
}