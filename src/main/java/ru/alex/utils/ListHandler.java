package ru.alex.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListHandler  {
    public static <T> void printRepeatedElements(List<T> elements) {

    }

    private static <T> Map<T, Integer> getElementCountsMap(List<T> elements) {
        Map<T, Integer> elementCountsMap = new HashMap<>();

        elements.forEach(element -> elementCountsMap.merge(element, 1, Integer::sum));

        return elementCountsMap;
    }
}
