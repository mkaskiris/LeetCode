package org.leetcode.problems;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(Parameterized.class)
public class TopKFrequentElementsTest {
    private int[] nums;
    private int k;
    private int[] expected;

    public TopKFrequentElementsTest(int[] nums, int k, int[] expected) {
        this.nums = nums;
        this.k = k;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 1, 1, 2, 2, 3}, 2, new int[]{1,2}},
                {new int[]{1}, 1, new int[]{1}},
        });
    }

    @Test
    public void name() {
        TopKFrequentElements solution = new TopKFrequentElements();
        assertEquals(expected, solution.topKFrequent(nums,k));
    }
}