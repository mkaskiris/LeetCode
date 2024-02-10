package org.leetcode.problems;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;
import static org.leetcode.problems.TestInputs.*;

@RunWith(Parameterized.class)
public class ContainerMostWaterTest {
    private int[] nums;
    private int expected;

    public ContainerMostWaterTest(int[] nums, int expected) {
        this.nums = nums;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(CONTAINER_WATER);
    }

    @Test
    public void test() {
        ContainerMostWater solution = new ContainerMostWater();
        assertEquals(expected, solution.maxArea(nums));
    }
}