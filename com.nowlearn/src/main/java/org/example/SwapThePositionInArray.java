package org.example;

import java.util.Arrays;

//to swap 3rd and 6th index in the array
public class SwapThePositionInArray {
    public static void main(String[] args) {
        int[] arr={ 10, 4, 6, 78, 768, 3, 5, 7};
        String beforeSwap = Arrays.toString(arr);
        int thirdIndex=3, sixthIndex=6;
        int temp=arr[sixthIndex];
        arr[sixthIndex] = arr[thirdIndex];
        arr[thirdIndex] = temp;
        String afterSwap= Arrays.toString(arr);
        System.out.println(beforeSwap);
        System.out.println(afterSwap);

    }
}
