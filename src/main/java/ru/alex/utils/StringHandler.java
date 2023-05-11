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

    public static boolean isAnagram(String stringForCompare1, String stringForCompare2) {

        if (stringForCompare1.length() != stringForCompare2.length()) {
            return false;
        }

        Map<Character, Integer> mapCharAndCountsFirstStr = getMapCharAndCountFromString(stringForCompare1);

        return !stringForCompare1.equals(stringForCompare2)
                && mapCharAndCountsFirstStr.equals(getMapCharAndCountFromString(stringForCompare2));
    }

}
