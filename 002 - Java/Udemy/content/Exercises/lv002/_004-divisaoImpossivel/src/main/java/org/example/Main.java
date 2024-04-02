package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            int x = sc.nextInt();
            int y = sc.nextInt();

            if (y == 0) {
                System.out.println("Divisão impossivel");
            } else {
                double div = (double) x / y;
                System.out.printf("Divisão entre os dois números: %.1f%n", div);
                sc.close();
            }
        }
    }
}