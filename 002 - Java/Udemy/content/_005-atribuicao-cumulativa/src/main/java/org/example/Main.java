package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double conta = 50.0;

        System.out.println("Quanto tempo você usou o telefone? Fale em minutos.");
        int min = sc.nextInt();

        if (min > 100) {
            // += substitui conta = conta +
            conta += (min - 100) * 2.0;
            System.out.printf("Valor a pagar: %.2f%n", conta);
        }

        System.out.printf("Valor a pagar: %.2f%n", conta);

        sc.close();
    }
}