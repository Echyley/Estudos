package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Operadores BitWise, geralmente usado para aplicações em baixo nível;
        // & - O "e" quando há um 0 ele conta como falso;
        // | - "ou" no bitiwise conta verdadeiro se houver apenas um 1 dois 1;
        // ^ - "ou exclusivo" conta verdadeirto apenas se tiver 1 valor verdadeiro.

        int n1 = 89;
        int n2 = 60;

        System.out.println(n1 & n2);
        System.out.println(n1 | n2);
        System.out.println(n1 ^ n2);

        //colocamos b para declarar uma variavel em Bit
        int mask = 0b100000;
        int n = sc.nextInt();

        if ((n & mask) != 0) {
            System.out.println("6th bit is true!");
        } else {
            System.out.println("6th bit is false!");
        }

        sc.close();
    }
}