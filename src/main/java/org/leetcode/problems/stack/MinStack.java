package org.leetcode.problems.stack;

import java.util.ArrayList;
import java.util.List;

//no test, a bit difficult to write
public class MinStack {
    List<Integer> stack;
    List<Integer> min;
    public MinStack() {
        stack = new ArrayList<>();
        min = new ArrayList<>();
    }

    public void push(int val) {
        stack.add(val);
        if(min.isEmpty() || min.get(min.size() - 1) >= val) {
            min.add(val);
        }
    }

    public void pop() {
        int item = stack.remove(stack.size()-1);
        if(min.get(min.size() - 1) == item) {
            min.remove(min.size() - 1);
        }
    }

    public int top() {
        return stack.get(stack.size()-1);
    }

    public int getMin() {
        return min.get(min.size() - 1);
    }
}
