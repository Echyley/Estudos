package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;
        String s1, s2, s3;
        // com int primeiro teremos uma quebra de linha pendente no nextLine abaixo. Pra
        // resolver isso basta colocar 1 nextLine a mais;
        x = sc.nextInt();
        sc.nextLine();
        // nextLine lê o comando inteiro, até a quebra de linha
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("Dados digitados: ");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();
    }
}