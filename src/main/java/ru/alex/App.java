package ru.alex;

import ru.alex.utils.StringHandler;

public class App
{

    private final static String TEST_STRING = "1231";
    private final static String TEST_STRING_2 = "3221";
    public static void main( String[] args ) {
        System.out.println(StringHandler.isAnagram(TEST_STRING, TEST_STRING_2));
    }
}
