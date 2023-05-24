package ru.alex;

import org.junit.jupiter.api.Test;
import ru.alex.utils.ListHandler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {

    @Test
    public void testBinarySearch_FoundElement() {
        List<Integer> list = Arrays.asList(1, 3, 5, 7, 9);

        int searchElement = 5;
        int expectedResult = 2;
        int actualResult = ListHandler.binarySearch(list, searchElement);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testBinarySearch_NotFoundElement() {
        List<Integer> list = Arrays.asList(2, 4, 6, 8, 10);

        int searchElement = 7;
        int expectedResult = -1;
        int actualResult = ListHandler.binarySearch(list, searchElement);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testBinarySearch_FirstElement() {
        List<Integer> list = Arrays.asList(3, 6, 9, 12, 15);

        int searchElement = 3;
        int expectedResult = 0;
        int actualResult = ListHandler.binarySearch(list, searchElement);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testBinarySearch_LastElement() {
        List<Integer> list = Arrays.asList(2, 4, 6, 8, 10);

        int searchElement = 10;
        int expectedResult = 4;
        int actualResult = ListHandler.binarySearch(list, searchElement);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testBinarySearch_NotStandardClass_LastElement() {
        List<User> list = new ArrayList<>();
        list.add(new User("a", 1));
        list.add(new User("b", 2));
        list.add(new User("c", 3));
        list.add(new User("d", 4));
        list.add(new User("e", 5));

        User searchElement = new User("e", 5);
        int expectedResult = 4;
        int actualResult = ListHandler.binarySearch(list, searchElement);

        assertEquals(expectedResult, actualResult);
    }
}

