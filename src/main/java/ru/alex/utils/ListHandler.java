package ru.alex.utils;

import java.util.List;
import java.util.function.Predicate;

public class ListHandler {
    public static int getSumBySelectionCondition(List<Integer> numList, Predicate<Integer> selectionCondition) {

        return numList.stream()
                .filter(selectionCondition)
                .reduce(0, Integer::sum);
    }
}
