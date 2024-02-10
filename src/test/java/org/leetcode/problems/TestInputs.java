package org.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

public class TestInputs {
    public static final char[][] SUDOKU_1 = new char[][] {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
    };
    public static final char[][] SUDOKU_2 = new char[][] {
            {'.','.','.','.','.','.','.','.','.'},
            {'.','.','.','.','.','6','.','.','.'},
            {'.','.','.','.','.','.','.','.','.'},
            {'.','.','.','.','8','.','.','.','.'},
            {'9','.','.','.','7','5','.','.','.'},
            {'.','.','.','.','5','.','.','8','.'},
            {'.','.','9','.','.','.','.','.','.'},
            {'2','.','6','.','.','.','.','.','.'},
            {'.','.','.','.','.','.','.','.','.'}
    };
    public static final int[] SEQUENCE_1 = new int[]{100,4,200,1,3,2};
    public static final int[] SEQUENCE_2 = new int[]{0,3,7,2,5,8,4,6,0,1};
    public static final String[] PALIDROME = {
            "A man, a plan, a canal: Panama",
            "race a car",
            " ",
            "0P"};
    public static final Object[][] TWO_SUM_NEW = new Object[][]{
            {new int[]{2, 7, 11, 15}, 9, new int[]{1, 2}},
            {new int[]{2, 3, 4}, 6, new int[]{1, 3}},
            {new int[]{-1, 0}, -1, new int[]{1, 2}}
    };

    public static final Object[][] THREE_SUM = new Object[][]{
            {new int[]{-1,0,1,2,-1,-4,-2,-3,3,0,4}, new ArrayList<>(List.of(
                    List.of(-4,0,4),List.of(-4,1,3),List.of(-3,-1,4),
                    List.of(-3,0,3),List.of(-3,1,2),List.of(-2,-1,3),List.of(-2,0,2),
                    List.of(-1,-1,2),List.of(-1,0,1)
            ))},
            {new int[]{-1,0,1,2,-1,-4}, new ArrayList<>(
            List.of(List.of(-1,-1,2), List.of(-1,0,1)))},
            {new int[]{0,1,1}, new ArrayList<>()},
            {new int[]{0,0,0}, new ArrayList<>(
                    List.of(List.of(0,0,0)))}

    };

    public static final Object[][] CONTAINER_WATER = new Object[][]{
            {new int[]{1,8,6,2,5,4,8,3,7}, 49},
            {new int[]{1,1}, 1},
            {new int[]{1,2,1}, 2}
    };

    public static final Object[][] TRAP = new Object[][] {
            {new int[]{0,1,0,2,1,0,1,3,2,1,2,1}, 6},
            {new int[]{4,2,0,3,2,5}, 9}
    };

    public static final Object[][] PARENTHESIS = new Object[][]{
            {"()", true},
            {"(])", false},
            {"[{()}]", true},
            {"[{{)}]", false},
            {"[{{()}]", false},

    };


}
