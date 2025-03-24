package org.example;

import java.util.*;

public class ElementsCommonInArray1{

    public static void FindCommonElements(String [] arr1, String [] arr2)
    {

        Set<String> set = new HashSet<>();

        for ( int i=0; i<arr1.length; i++){

            for (int j=0; j<arr2.length;j++){

                if (arr1[i] == arr2[j]){
                    set.add(arr1[i]);
                    //break;
                }

            }

        }
        //for (String i : set) {
            System.out.print(set);
        //}
    }

    public static void main(String [] args)

    {
        String[] arr1 = {"Raj", "Canda", "Min", "Kate"};
        String[] arr2 = {"Kole", "Gonx", "Gonx", "Kate", "Canda" };

        System.out.println ("Elements in Array 1:" + Arrays.toString(arr1));
        System.out.println("Elements in Array 2:" + Arrays.toString(arr2));

        System.out.println ("Common Elements in the array:" );

        FindCommonElements(arr1, arr2);
    }
}
