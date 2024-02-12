package org.leetcode.problems.Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ReversePolishNotation {


    public int evalRPN(String[] tokens) {
        List<String> operations = new ArrayList<>(Arrays.asList("+", "-", "*", "/"));
        Stack<Integer> operants = new Stack<>();
        for(String token: tokens){
            if(!operations.contains(token)){
                operants.add(Integer.parseInt(token));
            }else{
                int a = operants.pop();
                int b = operants.pop();
                int res;
                switch(token){
                    case "+" -> res = b + a;
                    case "-" -> res = b - a;
                    case "*" -> res = b * a;
                    default -> res = b / a;
                }
                operants.add(res);
            }
        }
        return operants.get(0);
    }
}
