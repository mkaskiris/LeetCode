package org.leetcode.problems.Stack;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;
import static org.leetcode.problems.TestInputs.*;

@RunWith(Parameterized.class)
public class ValidParenthesisTest {
    private String nums;
    private boolean expected;

    public ValidParenthesisTest(String nums, boolean expected) {
        this.nums = nums;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(PARENTHESIS);
    }

    @Test
    public void test() {
        ValidParenthesis solution = new ValidParenthesis();
        assertEquals(expected, solution.isValid(nums));
    }
}