package org.leetcode.problems.stack;

import java.util.*;

public class ReversePolishNotation {


    public int evalRPN(String[] tokens) {
        List<String> operations = new ArrayList<>(Arrays.asList("+", "-", "*", "/"));
        Deque<Integer> operands = new ArrayDeque<>();
        for(String token: tokens){
            if(!operations.contains(token)){
                operands.push(Integer.parseInt(token));
            }else{
                int a = operands.pop();
                int b = operands.pop();
                int res;
                switch(token){
                    case "+" -> res = b + a;
                    case "-" -> res = b - a;
                    case "*" -> res = b * a;
                    default -> res = b / a;
                }
                operands.push(res);
            }
        }
        return operands.getFirst();
    }
}
