package org.leetcode.problems.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LargestRectangle {
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        Stack<List<Integer>> stack = new Stack<>();
        for(int i=0;i<heights.length;i++) {
            if(stack.empty() || stack.peek().get(1) < heights[i]) {
                stack.push(List.of(i, heights[i]));
            }else {
                List<Integer> temp = new ArrayList<>();
                while(!stack.empty() && stack.peek().get(1) >= heights[i]) {
                    temp = stack.pop();
                    maxArea = Math.max(maxArea, temp.get(1) * (i - temp.get(0)));
                }
                stack.push(List.of(temp.get(0), heights[i]));
            }
        }
        while(!stack.empty()) {
            List<Integer> temp = stack.pop();
            maxArea = Math.max(maxArea, temp.get(1) * (heights.length - temp.get(0)));
        }
        return maxArea;
    }
}

/*
should not sort the array
go through the array
    if stack is empty add height & index to stack
    if next element is bigger than top of stack add to stack
    else if element is smaller
        find max height of top element
            barArea = height * (curIndex - heightInx)
        add element to stack with index of last popped element


Math.max(column area = height, combined column area = smallest height * number of columns)

find the biggest rectangle for that position
results = []
    for i in heights
        h = heights[i]
        h[i] = heights[i]
 */

