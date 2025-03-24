package org.example;

public class ReverseFirstWord {

    public static void main(String[] args) {
        reverseSpecificWord("I can type anything here", 4);
    }

    public static void reverseSpecificWord(String s, int n) {
        String rev = "";
        String[] splt = s.split(" ");
        String word = splt[n];
        for (int j = word.length() - 1; j >= 0; j--) {
            rev = rev + word.charAt(j);
        }

        for (int i = 0; i < splt.length; i++) {

            if (splt[i] == word) {
                System.out.print(rev + " ");
            } else {
                System.out.print(splt[i] + " ");
            }
        }

    }
}