package ru.alex.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListHandler {
    public static <T> void printRepeatedElements(List<T> elements) {
        Map<T, Integer> elementCountsMap = getElementCountsMap(elements);

        for (Map.Entry<T, Integer> elementAndCount : elementCountsMap.entrySet()) {
            if (elementAndCount.getValue() > 1) {
                System.out.println(elementAndCount.getKey());
            }
        }
    }

    private static <T> Map<T, Integer> getElementCountsMap(List<T> elements) {
        Map<T, Integer> elementCountsMap = new HashMap<>();

        elements.forEach(element -> elementCountsMap.merge(element, 1, Integer::sum));

        return elementCountsMap;
    }
}
