package ru.alex.utils;

import java.util.List;
import java.util.function.Predicate;

public class ListHandler {
    public static int getSumByFilterCondition(List<Integer> numList, Predicate<Integer> filterCondition) {

        return numList.stream()
                .filter(filterCondition)
                .reduce(0, Integer::sum);
    }
}
