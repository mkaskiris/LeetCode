package org.leetcode.problems.binarySearch;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;
import static org.leetcode.problems.TestInputs.*;

@RunWith(Parameterized.class)
public class TwoDMatrixTest {
    private int[][] nums;
    private int target;
    private boolean expected;

    public TwoDMatrixTest(int[][] nums, int target, boolean expected) {
        this.nums = nums;
        this.target = target;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(TWO_D_MATRIX);
    }

    @Test
    public void test() {
        TwoDMatrix solution = new TwoDMatrix();
        assertEquals(expected, solution.searchMatrix(nums, target));
    }
}