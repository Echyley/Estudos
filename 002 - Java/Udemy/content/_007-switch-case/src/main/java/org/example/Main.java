package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digita um numero de 1 a 7 para representar um dia da semana");
        int x = sc.nextInt();
        String dia;

        switch (x) {
            case 1:
                dia = "domingo";
                System.out.println(dia);
                break;
            case 2:
                dia = "segunda";
                System.out.println(dia);
                break;
            case 3:
                dia = "terça";
                System.out.println(dia);
                break;
            case 4:
                dia = "quarta";
                System.out.println(dia);
                break;
            case 5:
                dia = "quinta";
                System.out.println(dia);
                break;
            case 6:
                dia = "sexta";
                System.out.println(dia);
                break;
            case 7:
                dia = "sábado";
                System.out.println(dia);
                break;
            default:
                dia = "valor invalido";
                break;
        }

        sc.close();
    }
}