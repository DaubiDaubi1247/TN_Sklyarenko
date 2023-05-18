package ru.alex.utils;

import java.util.HashSet;
import java.util.Set;

public class BoardHandler {

    private static final char DOT_CHAR = '.';

    public static boolean isValidBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            Set<Character> rowSet = new HashSet<>();
            Set<Character> colSet = new HashSet<>();

            for (int j = 0; j < board[i].length; j++) {
                char rowElement = board[i][j];
                char colElement = board[j][i];

                if (!isValidElement(rowElement, rowSet) || !isValidElement(colElement, colSet)) {
                    return false;
                }
            }
        }

        return true;
    }

    private static boolean isValidElement(char element, Set<Character> set) {
        return isDotChar(element) || (Character.isDigit(element) && set.add(element));
    }

    private static boolean isDotChar(char rowElement) {
        return rowElement == DOT_CHAR;
    }

}

