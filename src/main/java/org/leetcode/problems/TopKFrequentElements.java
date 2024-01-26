package org.leetcode.problems;

import java.util.*;

public class TopKFrequentElements {

    /**
     * create a map occurances of each element
     * go through all items in map and place in index of bucket according to occurance
     */
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer>[] bucket = new List[nums.length+1];
        //initialize bucket
        for(int i=0; i<bucket.length; i++){
            bucket[i] = new ArrayList<>();
        }
        //populate frequency with all numbers and their frequencies
        for(int i: nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        //get keyset of map
        for(Map.Entry<Integer,Integer> entry: map.entrySet()) {
            bucket[entry.getValue()].add(entry.getKey());
        }
        List<Integer> result = new ArrayList<>();
        for(int i=bucket.length-1; i>0; i--){
            result.addAll(bucket[i]);
            if(result.size() == k) {
                return result.stream().mapToInt(Integer::intValue).toArray();
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
