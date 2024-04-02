package quatro;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {

    String nome;
    double salario, vendas, total;
    Scanner sc = new Scanner(System.in);

    System.out.println("Informe seu nome.");
    nome = sc.nextLine();
    System.out.println("Informe seu salário");
    salario = sc.nextDouble();
    System.out.println("Informe suas vendas no mês:");
    vendas = sc.nextDouble();

    total = salario + (vendas * 0.15);

    System.out.println(nome + ", Seu salário mais os 15% das vendas é:");
    System.out.println(total);

  }
}