import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de A");
        int a = sc.nextInt();
        System.out.println("Digite o valor de B");
        int b = sc.nextInt();

        System.out.println("A soma entre A e B é: " + (a + b));
        System.out.println("A subtração entre A e B é: " + (a - b));
        System.out.println("A multiplicação entre A e B é: " + (a * b));
        System.out.println("A divisão entre A e B é: " + (a / b));

    }
}
