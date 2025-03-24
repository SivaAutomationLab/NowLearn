package org.example;

public class ChangeStringToAlternateCase {
    public static void main(String[] args) {
        String s = "This is Sivaraj";
        s= s.toLowerCase();
        String[] splitString = s.split(" ");
        for (String word: splitString){
            char[] ch = word.toCharArray();
            for (int i=0; i<ch.length; i=i+2){
                ch[i]=Character.toUpperCase(ch[i]);
            }
            System.out.print(new String(ch)+" ");
        }

    }
}
