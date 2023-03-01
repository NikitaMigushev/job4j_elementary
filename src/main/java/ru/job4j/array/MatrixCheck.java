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

    /*checks if a given column in a two-dimensional array is completely filled with "X"*/
    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int row = 1; row < board.length; row++) {
            if (board[0][column] != board[row][column]) {
                result = false;
                break;
            }
        }
        return result;
    }

    /*fills a one-dimensional array with diagonal elements from a two-dimensional array*/
    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            rsl[i] = board[i][i];
        }
        return rsl;
    }
}