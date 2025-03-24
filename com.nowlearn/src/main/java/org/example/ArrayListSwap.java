package org.example;

import java.util.*;

public class ArrayListSwap {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("h");
        list.add("he");
        list.add("hel");
        list.add("helo");
        list.add("o");
        System.out.println(list);
        Collections.swap(list, 0, 4);
        System.out.println(list);
    }
}
