package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int n = sc.nextInt();
        //É assim que se faz um vetor em java :D
        //Um vetor nada mais é do que uma variável com mais de um valor
        double[] vect = new double[n];

        //Podemos usar o for para acessar e declarar os valores do vetor
        for (int i = 0; i < n; i++) {
            vect[i] = sc.nextDouble();
        }

        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += vect[i];
        }

        double avg = sum / n;
        System.out.printf("Average Height: %.2f%n", avg);

        sc.close();
    }
}