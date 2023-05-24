package ru.alex.utils;

import java.util.Collections;
import java.util.List;

public class ListHandler {

    public static <T extends Comparable<T>> int binarySearch(List<T> listForSearch, T searchingElement) {

        Collections.sort(listForSearch);

        int startIndex = 0;
        int endIndex = listForSearch.size() - 1;

        while (startIndex <= endIndex) {
            int middleIndex = (startIndex + endIndex) >> 1;

            int compareValue = listForSearch.get(middleIndex).compareTo(searchingElement);

            if (compareValue == 0) {
                return middleIndex;
            }

            if (compareValue > 0) {
                endIndex = middleIndex - 1;
            } else {
                startIndex = middleIndex + 1;
            }
        }

        return -1;
    }
}
