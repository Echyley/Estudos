import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro Positivo");
        int num = sc.nextInt();

        boolean primo = ehPrimo(num);
        if (primo) {
            System.out.println(num + " é primo!");
        } else {
            System.out.print(num + " não é primo :(");
        }
    }

    public static boolean ehPrimo(int num) {
        double raiz = Math.sqrt(num);
        System.out.println("A raiz quadrada do número digitado é: " + raiz);

        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= raiz; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
