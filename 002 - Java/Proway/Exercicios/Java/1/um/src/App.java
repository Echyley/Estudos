import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        float a, b, c;

        System.out.println("Determine o valor de A.");
        a = sc.nextFloat();
        System.out.println("Determine o valor de B.");
        b = sc.nextFloat();

        c = a + b;

        System.out.println("Este é o valor de c: " + c);
    }
}
