package ru.alex.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListHandler {
    public static <T> List<T> getRepeatedElementList(List<T> elements) {
        Map<T, Integer> elementCountsMap = getElementCountsMap(elements);
        List<T> uniqueElements = new ArrayList<>();

        for (Map.Entry<T, Integer> elementAndCount : elementCountsMap.entrySet()) {
            if (elementAndCount.getValue() > 1) {
                uniqueElements.add(elementAndCount.getKey());
            }
        }

        return uniqueElements;
    }

    private static <T> Map<T, Integer> getElementCountsMap(List<T> elements) {
        Map<T, Integer> elementCountsMap = new HashMap<>();

        elements.forEach(element -> elementCountsMap.merge(element, 1, Integer::sum));

        return elementCountsMap;
    }
}
