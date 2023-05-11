package ru.alex;

/**
 * Hello world!
 *
 */
public class App 
{
    private final static String TEST_STRING = "12343211";

    public static void main( String[] args ) {
        System.out.println(isPalindrome(TEST_STRING));
    }

    private static boolean isPalindrome(String string) {

        String reverseString = new StringBuilder(string).reverse().toString();

        return string.equals(reverseString);
    }
}

