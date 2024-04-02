import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um valor par A");
        int A = sc.nextInt();
        System.out.println("Digite um valor par B");
        int B = sc.nextInt();

        if (A == B){
            System.out.println("A é igual a B!");
        } else {
            if (A > B || B > A){
                System.out.println("Um dos números é maior que o outro e portanto não são iguais!");
            }
        }
    }
}
