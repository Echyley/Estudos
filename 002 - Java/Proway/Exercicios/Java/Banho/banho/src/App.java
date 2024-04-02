package banho;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int banho, pes, sovaco, cabelo;

        pes = 0;
        sovaco = 0;
        cabelo = 0;

        System.out.println("1 Para sim;");
        System.out.println("2 Para não;");
        System.out.println("3 Para sair;");
        System.out.println("Você já tomou banho?");
        banho = sc.nextInt();

        switch (banho) {
            case 1:
                System.out.println("Então responda: ");
                System.out.println("Já lavou os pés?");
                pes = sc.nextInt();
                System.out.println("O sovaco?");
                sovaco = sc.nextInt();
                System.out.println("E o cabelo?");
                cabelo = sc.nextInt();

                if (pes + sovaco + cabelo == 3) {
                    System.out.println("Parabéns por ter tomado banho :)");
                    System.out.println("Você saiu cheiroso :D");
                } else if ((pes == 2) || (sovaco == 2) || (cabelo == 2)) {
                    System.out.println("É feio mentir ;-;");
                    System.out.println("Você saiu, mas não se esqueça de tomar banho >:( ");

                }
                break;
            case 2:
                System.out.println("Então vai tomar >:( ");
                break;

            case 3:
                System.out.println("Você saiu.");
                break;
        }
    }
}
