package practice;

import java.util.*;

public class JustPracticeAnyCode{

    static List <Integer> list = new ArrayList<>();

    public static void main (String []args){

        int [] arr1 = {1, 2, 3, 6, 7, 8, 0, 1, 4, 5, 6, 7};
        int [] arr2 = {1, 6, 7, 5, 7};


        System.out.println("Array 1: " + Arrays.toString(arr1));

        System.out.println("Array 2: " + Arrays.toString(arr2));

        System.out.println("Common Array: ");
        commonEle(arr1, arr2);
        Set set = new HashSet<>();
        JustPracticeAnyCode a = new JustPracticeAnyCode();
        //set.add(a.list);
        System.out.println(set);
        //set.addAll(a.list);
        System.out.println(set);
    }

    public static void commonEle(int [] arr1, int[] arr2){



        for (int i=0; i<arr1.length; i++){
            for (int j=0; j<arr2.length; j++){

                if (arr1[i] == arr2[j]){
                    list.add(arr1[i]);
                }

            }}
        System.out.println(list);
    }



}