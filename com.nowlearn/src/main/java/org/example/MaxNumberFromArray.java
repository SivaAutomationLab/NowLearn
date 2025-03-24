package org.example;

import java.util.Arrays;

public class MaxNumberFromArray {

    public static void main(String[] args) {
        int[] n = {23, 45, 87, 98, 11, 9};

        //Method 2:
        Arrays.sort(n);
        System.out.println(Arrays.toString(n));
        System.out.println(n[n.length-1]);





        //Method 1 - for printing the max number in the array
        int max = n[0];
        //System.out.println(n.length);
        for (int i = 0; i < n.length; i++) {
            if (max < n[i]) {
                max = n[i];
            }
        }
        System.out.println(max);
    }
}
