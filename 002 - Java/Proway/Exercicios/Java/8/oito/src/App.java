package ExercícioOito;

import java.util.Scanner;

public class App {   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        float reais, valorEmDolar;
        
        System.out.println("Quantos reais você tem?");
        reais = sc. nextFloat();
        
        valorEmDolar = reais * 5;
        
        System.out.println("Esse é seu valor em dolar:" + valorEmDolar);   
    }
}
