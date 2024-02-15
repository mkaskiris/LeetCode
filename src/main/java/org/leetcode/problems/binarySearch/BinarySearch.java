package org.leetcode.problems.binarySearch;

import java.util.Arrays;

public class BinarySearch {

    public int searchBetter(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while(low <= high){
            int mid = (low + high) / 2;
            if(nums[mid] == target) return mid;

            else if(target > nums[mid]) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public int search(int[] nums, int target) {
        int number = nums[nums.length / 2];
        int[] temp = nums;
        while(number != target) {
            if(temp.length == 1){
                return -1;
            }
            if(number > target) {
                temp = Arrays.copyOfRange(temp, 0, temp.length / 2);
            }else {
                temp = Arrays.copyOfRange(temp, temp.length / 2, temp.length);
            }
            number = temp[temp.length / 2];
        }
        for(int i=0;i<nums.length;i++) {
            if(nums[i] == number) {
                return i;
            }
        }
        return -1;
    }
}
