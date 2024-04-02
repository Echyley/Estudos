package quentefrio;

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        int numeroAleatorio = rd.nextInt(10);

        System.out.println("Há um valor dado como certo entre 1 e 10, tente encontrá-lo :D");

        int numero = 0;
        while (numero != numeroAleatorio) {
            numero = sc.nextInt();
            if (numero >= 1 && numero <= 10) {
                if (numero == numeroAleatorio) {
                    System.out.println("O número está no intervalo :D");
                    break;
                } else {
                    int diferenca = Math.abs(numero - numeroAleatorio);
                    if (diferenca <= 2) {
                        System.out.println("Quente!");
                    } else {
                        System.out.println("Frio!");
                    }
                }
            }

        }

    }
}
