package ru.job4j.array;

public class MatrixCheck {
    /*checks if a given row in a two-dimensional array is completely filled with "X"*/
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int cell = 1; cell < board.length; cell++) {
            if (board[row][0] != board[row][cell]) {
                result = false;
                break;
            }
        }
        return result;
    }
}