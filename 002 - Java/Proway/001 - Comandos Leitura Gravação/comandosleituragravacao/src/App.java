import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in); //Scanner permite o usuário digitar um valor
        // comandos de entrada:
        int idade = leitor.nextInt();
        float cotacaoDolar = leitor.nextFloat();
        double cotacaoEuro = leitor.nextDouble();
        String nome = leitor.nextLine();
        String codigoRua = leitor.next();
        // comandos de saída:
        System.out.println("Texto que será exibido no console."); // O println deixa o cursor no final da linha.
        System.out.print("Texto que será exibido no console.");// O print pula pra prox linha.

    }
}
