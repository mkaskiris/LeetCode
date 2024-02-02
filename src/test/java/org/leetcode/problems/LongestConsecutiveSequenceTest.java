package org.leetcode.problems;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;
import static org.leetcode.problems.TestInputs.*;

@RunWith(Parameterized.class)
public class LongestConsecutiveSequenceTest {
    private int[] nums;
    private int expected;

    public LongestConsecutiveSequenceTest(int[] nums, int expected) {
        this.nums = nums;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {SEQUENCE_1, 4},
                {SEQUENCE_2, 9},
                // Add more test cases as needed
        });
    }

    @Test
    public void test() {
        LongestConsecutiveSequence solution = new LongestConsecutiveSequence();
        assertEquals(expected, solution.longestConsecutive(nums));
    }
}