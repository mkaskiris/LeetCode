package org.leetcode.problems;

import java.util.Arrays;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        char[] sorted = s.toCharArray();
        String[] sorted2 = t.split("");
        Arrays.sort(sorted);
        Arrays.sort(sorted2);
        return Arrays.toString(sorted).equals(Arrays.toString(sorted2));
    }
}
