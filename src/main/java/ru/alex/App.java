package ru.alex;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Integer[] arrayToReverse = new Integer[] {1, 2};
        System.out.println(Arrays.toString(arrayToReverse));

        reverseArray(arrayToReverse);
        System.out.println(Arrays.toString(arrayToReverse));
    }

    private static <T> void reverseArray(T[] arrayToReverse) {

        for (int i = 0, j = arrayToReverse.length - 1; i < arrayToReverse.length / 2; i++, j--) {
            T temp = arrayToReverse[i];
            arrayToReverse[i] = arrayToReverse[j];
            arrayToReverse[j] = temp;
        }

    }
}
