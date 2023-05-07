package ru.alex;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Integer[] a = new Integer[] {1, 2};
        System.out.println(Arrays.toString(a));

        reverseArray(a);
        System.out.println(Arrays.toString(a));
    }

    private static <T> void reverseArray(T[] arr) {

        for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {
            T temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

    }
}
