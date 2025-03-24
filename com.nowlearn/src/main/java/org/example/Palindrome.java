package org.example;

public class Palindrome {
    public static void main(String[] args) {


        String name = "madamm";
        String newName = "";

        char[] ch = name.toCharArray();

        for (int i = ch.length - 1; i >= 0; i--) {
            newName = newName + ch[i];
        }
        System.out.println(newName);
        if (newName.equals(name)) {
            System.out.println(name + " is Palindrome");
        } else {
            System.out.println(name + " is not a Palindrome");
        }
    }
}

