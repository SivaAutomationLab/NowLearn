package org.example;

public class OnetoHundredWithoutForLoop {
    static int i = 1;

    public static void main(String[] args) {
        add(1000);
    }

    public static int add(int n) {
        System.out.println(i);
        if (i < n) {
            i = i + 1;
            add(n);
        }

        return i;
    }
}
