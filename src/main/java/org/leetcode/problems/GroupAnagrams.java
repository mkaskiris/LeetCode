package org.leetcode.problems;

import java.util.*;

/**
Given an array of strings strs, group the anagrams together. You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 */

/**
 * split string to chars and sort in place
 * put unique items in map, along with their index in the result list
 * if item already in map get the value to find index and append original stirng
 * O(m*nlogn)
 */
public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] sorted = s.toCharArray();
            Arrays.sort(sorted);
            String sortedString = new String(sorted);
            if (!map.containsKey(sortedString)) {
                map.put(sortedString, new ArrayList<>());
            }
            map.get(sortedString).add(s);
        }
        return new ArrayList<>(map.values());
    }

    /**
     * create array of 26 representing the alphabet
     * take ascii representation of each letter to populate array
     * put array in map along with list of words which match it
     */

    public List<List<String>> groupAnagrams2(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        int ref = 'a';
        for(String s: strs) {
            int[] count = new int[26];
            for(char c: s.toCharArray()) {
                count[c - ref] += 1;
            }
            String countStr = Arrays.toString(count);
            if(map.containsKey(countStr)) {
                map.get(countStr).add(s);
            }else {
                map.put(countStr, new ArrayList<>(List.of(s)));
            }
        }
        return map.values().stream().toList();
    }
}
