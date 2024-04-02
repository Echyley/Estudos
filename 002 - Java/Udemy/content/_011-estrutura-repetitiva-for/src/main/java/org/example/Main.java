package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Usa-se o FOR quando se sabe o limite do loop
        Scanner sc = new Scanner(System.in);

        System.out.println("Determine o valor do loop.");
        int loop = sc.nextInt();

        int soma = 0;
        for (int i = 0; i < loop; i++) {
            System.out.println("Determine " + loop + " valores para X.");
            int x = sc.nextInt();
            soma = soma + x;
        }
        System.out.println("Soma dos valores: " + soma);

        //Contagem com FOR

        for (int I = 1; I < 5; I++) {
            System.out.println("Contagem progressiva com for: ");
            System.out.println(I);
        }

        sc.close();
    }
}