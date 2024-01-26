package org.leetcode.problems;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(Parameterized.class)
public class ValidAnagramTest {
    private String s;
    private String t;
    private boolean expected;

    // Constructor for parameterized test
    public ValidAnagramTest(String s, String t, boolean expected) {
        this.s = s;
        this.t = t;
        this.expected = expected;
    }

    // Define the parameters
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"anagram", "nagaram", true},
                {"rat", "car", false},
                // Add more test cases as needed
        });
    }

    // Actual test method
    @Test
    public void testValidAnagram() {
        ValidAnagram solution = new ValidAnagram();
        assertEquals(expected, solution.isAnagram(s, t));
    }
}