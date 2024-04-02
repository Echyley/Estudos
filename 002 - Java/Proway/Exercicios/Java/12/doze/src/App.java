package ExercicioDoze;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double custoFabrica,percDistribuidor, imposto,total;
        
        System.out.println("Digite o custo de fábrica.");
        custoFabrica = sc . nextInt();
        
        imposto = custoFabrica * 0.45;
        percDistribuidor = imposto * 0.28;
        total = custoFabrica + percDistribuidor;
        
        System.out.println(total);
        
        
       
    }
}
