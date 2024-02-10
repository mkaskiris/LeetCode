package org.leetcode.problems;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;
import static org.leetcode.problems.TestInputs.*;

@RunWith(Parameterized.class)
public class ValidPalindromeTest {
    private String s;
    private boolean expected;

    public ValidPalindromeTest(String s, boolean expected) {
        this.s = s;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {PALIDROME[0], true},
                {PALIDROME[1], false},
                {PALIDROME[2], true},
                {PALIDROME[3], false}
        });
    }

    @Test
    public void test() {
        ValidPalindrome solution = new ValidPalindrome();
        assertEquals(expected, solution.isPalindrome(s));
    }
}