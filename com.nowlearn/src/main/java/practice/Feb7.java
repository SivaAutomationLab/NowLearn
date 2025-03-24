package practice;

import java.util.Scanner;

public class Feb7 {
    public static void main(String[] args) {
        int total=10000, balance;
        System.out.println("How many steps have you walked today");
        Scanner sc = new Scanner(System.in);
        int traveled = sc.nextInt();
        balance=total-traveled;
        System.out.println("You need to travel "+balance+" steps more");
    }
}
