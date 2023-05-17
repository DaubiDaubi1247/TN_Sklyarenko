package ru.alex;

import org.junit.Assert;
import org.junit.Test;
import ru.alex.utils.StringHandler;

/**
 * Unit test for simple App.
 */
public class AppTest {

    private final static String TEST_STRING = "1231";
    private final static String TEST_STRING_2 = "3211";

    private final static String TEST_STRING_3 = "1232";

    @Test
    public void isAnagram_CorrectStrings_ReturnTrue() {
        Assert.assertTrue(StringHandler.isAnagram(TEST_STRING, TEST_STRING_2));
    }

    @Test
    public void isAnagram_InCorrectStrings_ReturnFalse() {
        Assert.assertFalse(StringHandler.isAnagram(TEST_STRING, TEST_STRING_3));
    }
}
