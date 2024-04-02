import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        float distanciaTotal, combustivelGasto, media;
        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos decobrir seu consumo médio!");
        System.out.println("Diga a distancia percorrida...");
        distanciaTotal = sc.nextFloat();
        System.out.println("Diga quanto combustivel foi gasto...");
        combustivelGasto = sc.nextFloat();

        media = distanciaTotal / combustivelGasto;

        System.out.println("Sua média é: " + media);
    }
}
