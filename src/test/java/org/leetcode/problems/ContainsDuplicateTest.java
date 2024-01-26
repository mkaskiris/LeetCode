package org.leetcode.problems;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(Parameterized.class)
public class ContainsDuplicateTest {

    private int[] nums;
    private boolean expected;

    public ContainsDuplicateTest(int[] nums, boolean expected){
        this.nums = nums;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1,2,3,1}, true},
                {new int[]{1,2,3,4}, false},
                {new int[]{1,1,1,3,3,4,3,2,4,2}, true},
        });
    }
    @Test
    public void containsDuplicateTest() {
        ContainsDuplicate solution = new ContainsDuplicate();
        assertEquals(expected, solution.containsDuplicate(nums));
    }
}