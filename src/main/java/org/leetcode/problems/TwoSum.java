package org.leetcode.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            int rem = target - nums[i];
            if(map.containsKey(rem)){
                return Arrays.stream(new int[]{i, map.get(rem)}).sorted().toArray();
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}
