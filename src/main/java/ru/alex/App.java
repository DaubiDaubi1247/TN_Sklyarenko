package ru.alex;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        System.out.println(isPalindrome("12343211"));
    }

    private static boolean isPalindrome(String str) {

        String reverseString = new StringBuilder(str).reverse().toString();

        return str.equals(reverseString);
    }
}
