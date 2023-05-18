package ru.alex;

import org.junit.Assert;
import org.junit.Test;
import ru.alex.utils.ListHandler;

import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest {

    private final int MORE_ZERO_SUM_TEST = 37;
    private final int LESS_ZERO_SUM_TEST = -30;

    @Test
    public void getSumByFilterCondition_ValidItems_ReturnCorrectSum() {
        List<Integer> numList = List.of(11, 1, 2, 3, -9, 10, 4, -8, -6, 6, -7);

        Assert.assertEquals(ListHandler.getSumPositiveNumbers(numList), MORE_ZERO_SUM_TEST);

        Assert.assertEquals(ListHandler.getSumNegativeNumbers(numList), LESS_ZERO_SUM_TEST);
    }
}
