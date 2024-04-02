import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String[] numExtenso = {
                "Zero", "Um", "Dois", "Três", "Quatro", "Cinco"
        };

        System.out.println("Digite um número.");
        int num = sc.nextInt();

        if (num >= 0 && num <= 5) {
            System.out.println("Seu número é " + numExtenso[num] + " e está no intervalo!");
        } else {
            System.out.println("Número inválido!");
        }
    }
}
