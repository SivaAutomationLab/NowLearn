package org.example;

public class Fibonacci {
    public static void main(String[] args) {
        int initialValue = 0;
        int secondValue = 1;
        int total = 0;

        for (int i = 0; i < 6; i++) {
            System.out.println(total);
            total = initialValue + secondValue;
            initialValue = secondValue;
            secondValue = total;

        }
    }
}