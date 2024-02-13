package org.leetcode.problems.stack;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.leetcode.problems.TestInputs.*;

@RunWith(Parameterized.class)
public class GenerateParenthesisTest {
    private int nums;
    private List<String> expected;

    public GenerateParenthesisTest(int nums, List<String> expected) {
        this.nums = nums;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(GENERATE_PARENTHESIS);
    }

    @Test
    public void test() {
        GenerateParenthesis solution = new GenerateParenthesis();
        assertEquals(expected, solution.generateParenthesis(nums));
    }
}