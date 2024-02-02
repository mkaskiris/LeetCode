package org.leetcode.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 * You must write an algorithm that runs in O(n) time and without using the division operation.
 */
public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int suffix = 1;
        int[] result = new int[nums.length];
        Arrays.fill(result, 1);
        //forward pass
        for(int i=0;i< nums.length-1;i++){
            result[i+1] = nums[i] * result[i];
        }
        //backward pass
        for(int i=nums.length-1;i>0;i--) {
            result[i-1] = nums[i] * suffix * result[i-1];
            suffix *= nums[i];
        }

        return result;
    }
}
