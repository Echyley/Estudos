package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        // do-while pode ser utilzidado em alguns casos;
        // Diferente do for e do while ele primeiro executa o comando dps testa a condição.

        char resp;

        do {
            System.out.println("Digite a temperatura em celsius.");
            double C = sc.nextDouble();
            double F = 9.0 * C / 5.0 + 32.0;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);

            System.out.print("Desja repetir? (s/n)? ");
            resp = sc.next().charAt(0);
        } while (resp != 'n');

        sc.close();
    }
}