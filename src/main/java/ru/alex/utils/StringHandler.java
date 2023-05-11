package ru.alex.utils;

import java.util.HashMap;
import java.util.Map;

public class StringHandler {
    private static Map<Character, Integer> getMapCharAndCountFromString (String str) {
        Map<Character, Integer> mapCharAndCount = new HashMap<>();

        for (Character character : str.toCharArray()) {
            mapCharAndCount.merge(character, 1, Integer::sum);
        }

        return mapCharAndCount;
    }

    public static boolean isAnagram(String firstStringForCompare, String secondStringForCompare) {

        if (firstStringForCompare.length() != secondStringForCompare.length()) {
            return false;
        }

        Map<Character, Integer> mapCharAndCountsFirstStr = getMapCharAndCountFromString(firstStringForCompare);

        return !firstStringForCompare.equals(secondStringForCompare)
                && mapCharAndCountsFirstStr.equals(getMapCharAndCountFromString(secondStringForCompare));
    }

}
