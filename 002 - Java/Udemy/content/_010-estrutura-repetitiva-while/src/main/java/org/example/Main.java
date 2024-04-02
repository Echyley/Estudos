package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //recomendado quando você deseja executar um bloco de código repetidamente enquanto uma determinada condição for verdadeira.
        int x = sc.nextInt();
        int soma = 0;

        while (x != 0) {
            soma = soma + x;
            x = sc.nextInt();
        }
        System.out.println("Esse é o resultado da soma de todos os números digitados: " + soma);

        sc.close();
    }
}