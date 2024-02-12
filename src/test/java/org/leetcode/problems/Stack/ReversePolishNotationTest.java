package org.leetcode.problems.Stack;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;
import static org.leetcode.problems.TestInputs.*;

@RunWith(Parameterized.class)
public class ReversePolishNotationTest {
    private String[] nums;
    private int expected;

    public ReversePolishNotationTest(String[] nums, int expected) {
        this.nums = nums;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
            return Arrays.asList(RPN);
    }

    @Test
    public void test() {
        ReversePolishNotation solution = new ReversePolishNotation();
        assertEquals(expected, solution.evalRPN(nums));
    }
}