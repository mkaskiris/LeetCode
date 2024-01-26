package org.leetcode.problems;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(Parameterized.class)
public class GroupAnagramsTest {

    private String[] s;
    private List<List<String>> expected;

    public GroupAnagramsTest(String[] s, List<List<String>> expected) {
        this.s = s;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"anagram", "nagaram", true},
                {"rat", "car", false},
                // needs changing
        });
    }

    @Test
    public void test() {
        GroupAnagrams solution = new GroupAnagrams();
        assertEquals(expected, solution.groupAnagrams(s));
    }
}