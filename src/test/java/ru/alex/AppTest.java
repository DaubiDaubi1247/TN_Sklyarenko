package ru.alex;

import org.junit.Assert;
import org.junit.Test;
import ru.alex.utils.ListHandler;

import java.util.ArrayList;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void getRepeatedElementList_CorrectItems_ReturnExpectedResult() {

        List<Integer> expectedResult = List.of(1,2,3);

        Assert.assertEquals(expectedResult, ListHandler.getRepeatedElementList(List.of(1,2,3,1,2,3)));
    }

    @Test
    public void getRepeatedElementList_WithoutDuplicates_ReturnExpectedResult() {

        List<Integer> expectedResult = new ArrayList<>();

        Assert.assertEquals(expectedResult, ListHandler.getRepeatedElementList(List.of(1,2,3)));
    }
}
