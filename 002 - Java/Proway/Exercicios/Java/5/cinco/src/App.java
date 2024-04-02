package cinco;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        String nome;
        float a, b, c;
        double media;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu nome.");
        nome = sc.nextLine();
        System.out.println("Informe sua primeira nota.");
        a = sc.nextFloat();
        System.out.println("Informe sua segunda nota.");
        b = sc.nextFloat();
        System.out.println("Informe sua terceira nota.");
        c = sc.nextFloat();

        System.out.println(nome + ", sua media é:");
        media = a + b + c / 3;
        System.out.println(media);

    }
}
