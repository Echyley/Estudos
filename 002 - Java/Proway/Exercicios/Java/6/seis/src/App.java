package ExercícioSeis;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b;

        System.out.println("Digite o valor de A.");
        a = sc.nextInt();
        System.out.println("Digite o valor de B.");
        b = sc.nextInt();

        System.out.println("Valor de A: " + a + " Valor de B: " + b);
        System.out.println("Valor de A trocado: " + b + " Valor de B trocado: " + a);

    }
}
