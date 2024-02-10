package org.leetcode.problems;

public class TrappingRainWater {
    public int trap(int[] height) {
        int start = 0;
        int end = height.length-1;
        int water = 0;
        int maxL = 0;
        int maxR = 0;
        int res;

        while (start < end) {
            if (maxR < maxL) {

                res = maxR - height[end];
                if(res > 0){
                    water += res;
                }
                maxR = Math.max(maxR, height[end]);
                end--;
            } else {

                res = maxL - height[start];
                if(res > 0){
                    water += res;
                }
                maxL = Math.max(maxL, height[start]);
                start++;
            }
        }
        return water;
    }
}
