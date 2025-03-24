package org.example;

import java.util.*;

public class ArrayBoxing {
    public static void main(String[] args) {


        int[] primitiveArray = { 1, 2, 3, 4, 5 };

        Integer[] boxedArray = new Integer [primitiveArray.length];
        for ( int i =0; i<primitiveArray.length; i++){
            boxedArray[i] = Integer.valueOf(primitiveArray[i]);
        }
        Arrays.sort(boxedArray, Collections.reverseOrder());
        System.out.println(Arrays.toString(boxedArray));

    }
}
