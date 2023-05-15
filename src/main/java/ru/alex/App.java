package ru.alex;

import ru.alex.utils.ListHandler;

import java.util.List;
import java.util.function.Predicate;


public class App 
{
    public static void main( String[] args ) {
        List<Integer> numList = List.of(11, 1, 2, 3, -9, 10, 4, -8, -6, 6, -7);

        Predicate<Integer> moreThanZero = num -> num > 0;
        System.out.println(ListHandler.getNumSumBySelectionCondition(numList, moreThanZero));

        Predicate<Integer> lessThanZero = num -> num < 0;
        System.out.println(ListHandler.getNumSumBySelectionCondition(numList, lessThanZero));
    }


}
