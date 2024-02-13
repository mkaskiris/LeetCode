package org.leetcode.problems.stack;

import java.util.Stack;

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>(); //this stack should hold the index of each

        for(int i=0;i<temperatures.length;i++) {
            while(!stack.empty() && temperatures[i] > temperatures[stack.peek()]) {
                result[stack.peek()] = i - stack.pop();
            }
            stack.push(i);
        }
        return result;
    }
}

    /*
        go through all temperatures
        if temp at position i is greater than the top of the stack find difference in index and pop
        continue doing this for all values in the stack
        stack should be monotonic decreasing this way
     */
