package ru.alex.utils;

import java.util.HashSet;
import java.util.Set;

public class BoardHandler {

    private static final char DOT_CHAR = '.';

    public static boolean isValidBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            if (!isValidRow(board[i]) && !isValidRow(convertColumnToRow(board, i))) {
                return false;
            }
        }

        return true;
    }

    private static boolean isValidRow(char[] matrixRow) {

        Set<Character> characterSet = new HashSet<>();

        for (char rowElement : matrixRow) {
            if (Character.isDigit(rowElement)) {
                if (!characterSet.contains(rowElement)) {
                    characterSet.add(rowElement);
                } else {
                    return false;
                }
            } else if (!isDotChar(rowElement)) {
                return false;
            }
        }

        return true;
    }

    private static boolean isDotChar(char rowElement) {
        return rowElement == DOT_CHAR;
    }

    private static char[] convertColumnToRow(char[][] charMatrix, int columnIndex) {
        char[] columnArray = new char[charMatrix.length];

        for (int row = 0; row < charMatrix.length; row++) {
            columnArray[row] = charMatrix[row][columnIndex];
        }

        return columnArray;
    }
}
