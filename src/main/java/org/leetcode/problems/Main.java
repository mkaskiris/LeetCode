package org.leetcode.problems;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        GroupAnagrams solution = new GroupAnagrams();
//        System.out.println(solution.groupAnagrams2(new String[] {"eat","tea","tan","ate","nat","bat"}));

        TopKFrequentElements solution = new TopKFrequentElements();
        System.out.println(solution.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2));

    }
}