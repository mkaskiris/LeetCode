package org.leetcode.problems;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;
import static org.leetcode.problems.TestInputs.SUDOKU_1;
import static org.leetcode.problems.TestInputs.SUDOKU_2;

@RunWith(Parameterized.class)
public class ValidSudokuTest {

    private char[][] board;
    private boolean expected;

    public ValidSudokuTest(char[][] board, boolean expected) {
        this.board = board;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {SUDOKU_1, true},
                {SUDOKU_2, false},
        });
    }

    @Test
    public void name() {
        ValidSudoku solution = new ValidSudoku();
        assertEquals(expected, solution.isValidSudoku(board));
    }
}