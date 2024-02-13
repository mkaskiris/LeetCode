package org.leetcode.problems.stack;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        String cur = "";
        generate(0,0,n,cur,result);
        return result;
    }

    private void generate(int start, int end, int n, String cur, List<String>result) {
        if(start == end && start ==  n) {
            result.add(cur);
        }
        else if(start > end) {
            if(start < n){
                generate(start + 1, end, n, cur+"(", result);
            }
            generate(start, end + 1, n, cur+")", result);
        }
        else {
            generate(start + 1, end, n, cur+"(", result);
        }
    }
}


//open > close
//stop when open == close == n

