package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        // Entrada de dados com Scanner

        // String
        String x;
        System.out.println("Digite um texto.");
        x = sc.next();
        System.out.println("você digitou: " + x);

        // Int
        int X;
        System.out.println("Digite um número inteiro.");
        X = sc.nextInt();
        System.out.println("você digitou: " + X);

        // Double
        double y;
        System.out.println("Digite um número flutuante.");
        y = sc.nextDouble();
        System.out.println("você digitou: " + y);

        // Char
        char Y;
        System.out.println("Digite um qualquer coisa.");
        Y = sc.next().charAt(0);// CharAt vai pegar o caractere indicado pelo número em ();
        System.out.println("você digitou: " + Y);

        // Para ler vários dados na mesma linha basta colocar a variavel com seu comando
        // sc correpondente um seguido do outro.
        String a;
        int b;
        double c;
        System.out.println("Digite um texto, um valor inteiro e um valor flutuante um de cada vez.");
        a = sc.next();
        b = sc.nextInt();
        c = sc.nextDouble();
        System.out.println("Dados digitados: ");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        sc.close();
    }
}