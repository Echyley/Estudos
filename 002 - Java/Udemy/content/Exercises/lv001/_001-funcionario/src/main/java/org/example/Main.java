package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("Qual seu número de funcionário?");
		int num = sc.nextInt();
		System.out.println("Qual seu número de horas?");
		int numHoras = sc.nextInt();
		System.out.println("Quanto você recebe por hora?");
		double valorHora = sc.nextDouble();

		double salario = (numHoras * valorHora);

		System.out.printf("Número do funcionário: %d%n", num);
		System.out.printf("Salário: $%.2f%n", salario);

		sc.close();
    }
}