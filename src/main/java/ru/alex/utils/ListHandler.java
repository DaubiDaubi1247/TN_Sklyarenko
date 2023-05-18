package ru.alex.utils;

import java.util.List;
import java.util.function.Predicate;

public class ListHandler {
    private static int getSumByFilterCondition(List<Integer> numList, Predicate<Integer> filterCondition) {

        return numList.stream()
                .filter(filterCondition)
                .reduce(0, Integer::sum);
    }

    public static int getSumPositiveNumbers(List<Integer> numList) {
        Predicate<Integer> isPositive = num -> num > 0;

        return getSumByFilterCondition(numList, isPositive);
    }

    public static int getSumNegativeNumbers(List<Integer> numList) {
        Predicate<Integer> isNegative = num -> num < 0;

        return getSumByFilterCondition(numList, isNegative);
    }
}
