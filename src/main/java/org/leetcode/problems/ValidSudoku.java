package org.leetcode.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, List<Character>> rows = new HashMap<>();
        Map<Integer,List<Character>> cols = new HashMap<>();
        Map<Integer,List<Character>> boxes = new HashMap<>();

        for(int i=0; i<9; i++) {
            for(int j=0; j<9;j++){
                char position = board[i][j];
                if(position == '.'){
                    continue;
                }

                int boxPos = j/3;
                if(i>2){ boxPos+=3;}
                if(i>5){boxPos+=3;}

                //add to row
                if(rows.containsKey(i)){
                    if(rows.get(i).contains(position)){
                        return false;
                    }
                    rows.get(i).add(position);
                }else{
                    rows.put(i, new ArrayList<>(List.of(position)));
                }

                //add col
                if(cols.containsKey(j)){
                    if(cols.get(j).contains(position)){
                        return false;
                    }
                    cols.get(j).add(position);
                }else{
                    cols.put(j, new ArrayList<>(List.of(position)));
                }
                //add box
                if(boxes.containsKey(boxPos)){
                    if(boxes.get(boxPos).contains(position)){
                        return false;
                    }
                    boxes.get(boxPos).add(position);
                }else{
                    boxes.put(boxPos, new ArrayList<>(List.of(position)));
                }
            }
        }
        return true;
    }
}
/**
 * 0,0 = 0
 * 0,3 = 1
 * 0,6=2
 * 1,0=0
 * 1,3=1
 * 1,6=2
 * 2,0=0
 * 2,3=1
 * 2,6=2
 * 3,0 = 3
 * 3,3 = 4
 * 3,6 = 5
 * 4,0 = 3
 * 4,3 = 4
 * 4,6 = 5
 * 6,0 = 6
 * 6,3=7
 * 6,6=8
 */
