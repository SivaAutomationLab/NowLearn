package org.example;

import interfaceDem.ClassImplementsInterface;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Sample1 extends ClassImplementsInterface {

    int j, k;
    static int l;

    static {
        l = 3;
    }

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        Sample1 s = new Sample1();
        Sample1 s1 = new Sample1();

        System.out.println(s.j);
        s.j = 1;
        s.k = 2;

        System.out.println(s.j + " " + s.k);
        System.out.println(s1.j);
        System.out.println(s.j + s.j);
        System.out.println(s.j + s1.j);
        System.out.println("l is " + l);

        l = s.j;
        System.out.println("value of l change: " + l);
        text();


    }

    static void msg() {
        System.out.println("Check if this function is called");
    }

    static void text() {
        msg();
        ClassImplementsInterface c = new ClassImplementsInterface();
        c.check();
    }


}