package org.leetcode.problems.stack;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;
import static org.leetcode.problems.TestInputs.*;

@RunWith(Parameterized.class)
public class DailyTemperaturesTest {
    private int[] nums;
    private int[] expected;

    public DailyTemperaturesTest(int[] nums, int[] expected) {
        this.nums = nums;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(DAILY_TEMPS);
    }

    @Test
    public void test() {
        DailyTemperatures solution = new DailyTemperatures();
        assertArrayEquals(expected, solution.dailyTemperatures(nums));
    }
}