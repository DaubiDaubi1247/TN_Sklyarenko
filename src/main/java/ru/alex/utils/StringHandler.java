package ru.alex.utils;

import java.util.Arrays;

public class StringHandler {
    private static char[] getSortedCharArrayFromString(String str) {

        char[] charArrayFromStr = str.toCharArray();
        Arrays.sort(charArrayFromStr);

        return charArrayFromStr;
    }

    public static boolean isAnagram(String firstStringForCompare, String secondStringForCompare) {

        if (firstStringForCompare.length() != secondStringForCompare.length()
                || firstStringForCompare.equals(secondStringForCompare)) {

            return false;
        }

        char[] sortedCharArrayFromString = getSortedCharArrayFromString(firstStringForCompare);

        return Arrays.equals(sortedCharArrayFromString, getSortedCharArrayFromString(secondStringForCompare));
    }

}
