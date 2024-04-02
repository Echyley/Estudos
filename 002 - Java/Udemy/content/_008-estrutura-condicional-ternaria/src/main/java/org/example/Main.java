package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		//Melhor do que usar um monte de ifs!

		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.5;
		System.out.println("Esse é o deconto: " + desconto);

		sc.close();
    }
}