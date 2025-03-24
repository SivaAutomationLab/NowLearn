package org.example;

public class SubStringg {
    public static void main(String[] args) {
        String s = "abcde";
        //int length = s.length();
        for (int i = 0; i < s.length(); i++) {
            for (int k = i + 1; k <= s.length(); k++) {
                System.out.println(s.substring(i, k));

            }
        }
        System.out.println(s.indexOf('c'));
    }
}

