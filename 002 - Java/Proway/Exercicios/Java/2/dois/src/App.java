package Dois;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {

    System.out.println("Escreva dois números...");
    float a, b, c;
    Scanner sc = new Scanner(System.in);

    a = sc.nextFloat();
    b = sc.nextFloat();

    System.out.println("Soma entre eles:");
    c = a + b;
    System.out.println(c);

    System.out.println("Subtração entre eles:");
    c = a - b;
    System.out.println(c);

    System.out.println("Divisão entre eles:");
    c = a / b;
    System.out.println(c);

    System.out.println("Multiplicação entre eles:");
    c = a * b;
    System.out.println(c);

  }
}
