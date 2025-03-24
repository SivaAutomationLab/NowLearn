package org.example;

import java.util.*;

public class ArrayAscendingDescendingAndMergeUsingForLoop {
    public static void main(String[] args) {
        int [] a1 = {0, 1, 2, 3};
        int [] a2 = { 2, 3, 5, 6};
        int [] a3  = new int[a1.length];
        int [] a4 = new int[a2.length];
        int [] a5 = new int [a1.length + a2.length];
        for ( int i=0; i<a1.length; i++){
            a3[i] = a1[i];
            a5[i] = a1[i];
        }
        System.out.println("Array a3 is  "+Arrays.toString(a3));
        int i=0;
        for(int j=a2.length-1; j>=0; j--){

            a4[i]= a2[j];

            i= i+1;

        }
        int j=0;
        for (int k=a1.length;k<a5.length; k++){
            a5[k] = a2[j];
            j=j+1;
        }


        System.out.println("Array a4 is  "+Arrays.toString(a4));
        System.out.println("Array a5 is  "+Arrays.toString(a5));

    }
}
