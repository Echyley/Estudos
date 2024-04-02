import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> nomes = new ArrayList<String>();
        ArrayList<Integer> idades = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);

        int i = 0;
        while (i < 3) {
            System.out.println("Diga seu nome.");
            String nome = sc.nextLine();
            nomes.add(nome);

            System.out.println("Diga sua idade.");
            int idade = sc.nextInt();
            idades.add(idade);
            sc.nextLine();
            i++;

        }

        System.out.println("Nomes registrados: " + nomes);
        System.out.println("Nomes registrados: " + idades);

        sc.close();
    }
}
