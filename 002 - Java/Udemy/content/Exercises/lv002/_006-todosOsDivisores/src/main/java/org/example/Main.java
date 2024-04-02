package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		System.out.println("Digit a value for N");
		int n = sc.nextInt();

		System.out.println("Divisors of " + n);
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}
		}
		sc.close();
    }
}