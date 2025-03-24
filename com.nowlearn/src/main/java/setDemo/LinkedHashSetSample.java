package setDemo;

import java.util.*;

public class LinkedHashSetSample {


    public static void main(String[] args) {
        int[] a = {1, 9, 5, 7, 2, 0};
        int[] b = {6, 43, 2, 6, 7, 89, 0, 9};

        //When linkedHashSet is used, it maintains the insertion order
        Set<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    set.add(a[i]);
                }
            }

        }
        System.out.println(set);
    }
}

