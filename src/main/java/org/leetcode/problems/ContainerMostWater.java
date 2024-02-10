package org.leetcode.problems;

//https://leetcode.com/problems/container-with-most-water/description/

public class ContainerMostWater {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length-1;
        int maxArea = 0;

        //area = smallest height * difference in index
        for(int i=0;i< height.length;i++) {
            while(start<end) {
                int heightStart = height[start];
                int heightEnd = height[end];
                int width = end - start;
                int curArea = Math.min(heightStart, heightEnd) * width;

                maxArea = Math.max(maxArea, curArea);

                if(height[start] > height[end]) {
                    end--;
                }else{
                    start++;
                }
            }
        }
        return maxArea;
    }
}

//1,2,1

//1,3,2,2,4,5,20,345,1,1,21

