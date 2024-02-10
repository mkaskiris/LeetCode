package org.leetcode.problems.Stack;

import java.util.*;

public class ValidParenthesis {

    public boolean isValid(String s) {
        Stack<String> stack = new Stack<>();
        Map<String, String> stuffToAdd = new HashMap<>();
        stuffToAdd.put("(", ")");
        stuffToAdd.put("[", "]");
        stuffToAdd.put("{", "}");

        for(String c: s.split("")) {
            if(stack.isEmpty()) {
                stack.push(c);
            }else if(stuffToAdd.containsKey(c)){
                stack.push(c);
            }else if(c.equals(stuffToAdd.get(stack.peek()))) {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
