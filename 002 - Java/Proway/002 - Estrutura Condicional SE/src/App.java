package EstruturaCondicionalSE;

import java.util.Scanner;

public class App {
    /*
     * Operadores Relacionais:
     * >: Maior;
     * >=: Maior ou igual;
     * <: Menor;
     * <=: Menor ou igual;
     * ==: Compara igualdade;
     * !=: Diferente.
     * &&: Funciona quando tudo é verdadeiro;
     * ||: Funciona apenas quando uma opção é verdadeira;
     * !: Negação.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double nota1, nota2, nota3, media;

        System.out.println("Diga a nota 1.");
        nota1 = sc.nextDouble();
        System.out.println("Diga a nota 2.");
        nota2 = sc.nextDouble();
        System.out.println("Diga a nota 3.");
        nota3 = sc.nextDouble();

        media = nota1 + nota2 + nota3;

        if (media >= 7.0) {
            if (media >= 7) {
                System.out.println("Aprovado!");
            } else {
                System.out.println("Recuperção!");
            }
        } else {
            System.out.println("Reprovado :(");
        }

        System.out.println("Sua média é: " + media);

    }
}
