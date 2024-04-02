package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 1000");
        int x = sc.nextInt();

        System.out.println("Números ímpares até o valor digitado: ");
        for (int i = 1; i <= x; i++) {
            if (i % 2 != 0) { //se o resto de i for igual a 1 saberemos os números impares!
                System.out.println(i);
            }

        }

        sc.close();
    }
}