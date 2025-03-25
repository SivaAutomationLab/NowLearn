package practice;

import java.util.Scanner;

public class Any {
    public static void main(String[] args) {
        int year = 2025, dob;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Hi "+ name+" Welcome");
        System.out.println("Enter your age");
        int age = sc.nextInt();
        dob=year-age;
        System.out.println("Is your dob "+dob);
        System.out.println("Updating now here");
        System.out.println("check 1");

    }
}
