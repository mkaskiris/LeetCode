package org.leetcode.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int start;
        int end;
        int sum;

        for(int i=0;i<nums.length;i++) {
            //skip same first number
            if(i>0 && nums[i-1] == nums[i]){
                continue;
            }
            start = i+1;
            end = nums.length - 1;
            while(start < end) {
                sum = nums[i] + nums[start] + nums[end];
                if (sum > 0) {
                    end--;
                } else if (sum < 0) {
                    start++;
                } else {
                    result.add(List.of(nums[i], nums[start], nums[end]));
                    start++;
                    while (start < nums.length && nums[start] == nums[start - 1]) {
                        start++;
                    }
                }
            }
        }
        return result;
    }
}
