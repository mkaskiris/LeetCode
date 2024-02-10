package org.leetcode.problems;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String newS = s.replaceAll("[^a-zA-Z0-9]", "");
        String[] split = newS.split("");
        int start = 0;
        int end = split.length-1;

        for(int i=0;i<split.length/2;i++){
            if(!split[start].equalsIgnoreCase(split[end])){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
