package org.example;

import java.util.*;

public class ArrayAscendingDescedingUsingArrayMethods {
    public static void main(String[] args) {

        Integer [] a = { 2, 6, 3, 7};
        Integer [] b = { 2, 0, 4, 6};
        Integer [] c = Arrays.copyOf(a, 4);
        Integer [] d = Arrays.copyOf(b, 4);
        Integer [] mergedArray =
                new Integer[a.length+b.length];

        Arrays.sort(c);
        Arrays.sort(d, Collections.reverseOrder());
        System.arraycopy(a, 0, mergedArray, 0, 4);
        System.arraycopy(b, 0,mergedArray, 4, 4 );

        System.out.println("Original array a" +Arrays.toString(a));
        System.out.println("Original array b" +Arrays.toString(b));

        System.out.println("Ascending of array a" +Arrays.toString(c));
        System.out.println("Descending of array b" +Arrays.toString(d));
        System.out.println("Merged Array" +Arrays.toString(mergedArray));
    }
}
