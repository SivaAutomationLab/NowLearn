package org.example;

import java.util.Arrays;

public class PrintonlyAtoZChars {
    public static void main(String[] args) {
        String str = "Siva@12345";

        String a = str.replaceAll("[^0-9]", "");

        String b = str.replaceAll("[^A-Za-z]", "");

        System.out.println(a);

        System.out.println(b);

    }

}
