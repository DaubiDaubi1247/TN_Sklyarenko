package ru.alex.utils;

import java.util.HashSet;
import java.util.Set;

public class BoardHandler {

    private static final char DOT_CHAR = '.';

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
}
