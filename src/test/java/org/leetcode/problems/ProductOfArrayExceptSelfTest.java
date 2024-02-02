package org.leetcode.problems;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(Parameterized.class)
public class ProductOfArrayExceptSelfTest {

    private int[] nums;
    private int[] expected;

    public ProductOfArrayExceptSelfTest(int[] nums, int[] expected) {
        this.nums = nums;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1,2,3,4}, new int[]{24,12,8,6}},
                {new int[]{-1,1,0,-3,3}, new int[]{0,0,9,0,0}},
        });
    }

    @Test
    public void name() {
        ProductOfArrayExceptSelf solution = new ProductOfArrayExceptSelf();
        assertArrayEquals(expected, solution.productExceptSelf(nums));
    }
}