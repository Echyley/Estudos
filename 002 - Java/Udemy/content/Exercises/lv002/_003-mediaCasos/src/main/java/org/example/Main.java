package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digit the number of cases.");
        int n = sc.nextInt();

        System.out.println("Now digit 3 real numbers for each cases.");

        for (int i = 0; i < n; i++) {
            double case1 = sc.nextDouble();
            double case2 = sc.nextDouble();
            double case3 = sc.nextDouble();

            double media = (case1 * 2.0 + case2 * 3.0 + case3 * 5.0) / 10.0;

            System.out.printf("This is our average: %.1f%n.", media);
            sc.close();
        }
    }
}