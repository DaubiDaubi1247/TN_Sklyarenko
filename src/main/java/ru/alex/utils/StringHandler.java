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

}
