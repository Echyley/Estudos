package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digit a value for N");
        int N = sc.nextInt();

        int fat = 1;
        for (int i = 1; i <= N; i++) {
            fat = fat * i;
        }
        System.out.println("Factorial of " + N + " is: " + fat);

        sc.close();
    }
}