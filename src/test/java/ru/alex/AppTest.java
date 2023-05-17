package ru.alex;

import org.junit.Assert;
import org.junit.Test;
import ru.alex.utils.ListHandler;

import java.util.List;
import java.util.function.Predicate;

/**
 * Unit test for simple App.
 */
public class AppTest {

    private final int MORE_ZERO_SUM_TEST = 37;
    private final int LESS_ZERO_SUM_TEST = -30;

    @Test
    public void getSumByFilterCondition_ValidItems_ReturnCorrectSum() {
        List<Integer> numList = List.of(11, 1, 2, 3, -9, 10, 4, -8, -6, 6, -7);

        Predicate<Integer> moreThanZero = num -> num > 0;
        Assert.assertEquals(ListHandler.getSumByFilterCondition(numList, moreThanZero), MORE_ZERO_SUM_TEST);

        Predicate<Integer> lessThanZero = num -> num < 0;
        Assert.assertEquals(ListHandler.getSumByFilterCondition(numList, lessThanZero), LESS_ZERO_SUM_TEST);
    }
}
