package org.example;

import java.util.Arrays;

public class NullPointerException {
    String s;
    //Both String s and String s=null will have null value here
    //String s=null;

    public static void main(String[] args) {

        NullPointerException n = new NullPointerException();
        n.getlength("12345678");
        int len = n.s.length();
        System.out.println(len);

    }

    public void getlength(String s) {
        //s = "set";
        System.out.println(s.length());
    }

}
