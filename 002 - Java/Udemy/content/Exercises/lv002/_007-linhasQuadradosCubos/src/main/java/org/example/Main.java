package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digit a value for N.");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int num = i;
            int quadrado = i * i;
            int cubo = i * i * i;

            System.out.printf("%d, %d, %d%n", num, quadrado, cubo);
        }
    }
}