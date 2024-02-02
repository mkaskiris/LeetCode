package org.leetcode.problems;

import java.util.HashMap;
import java.util.Map;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        //should use set instead of map
        int longest = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i: nums) {
            map.put(i, 1);
        }
        for(int i: nums){
            if(!map.containsKey(i-1)){
                int currentNum = i;
                int tempLong = 1;
                while(true){
                    if(map.containsKey(currentNum+1)){
                        tempLong++;
                        currentNum++;
                    }else{
                        longest = Math.max(longest,tempLong);
                        break;
                    }
                }
            }
        }
        return longest;
    }
}
