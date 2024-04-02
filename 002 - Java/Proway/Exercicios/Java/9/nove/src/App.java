package ExercícioNove;

import java.util.Scanner;

public class App {
       public static void main(String[] args) {
      
           Scanner sc = new Scanner (System.in);
           
           double valorDepositado, totalJuros;
           
           System.out.println("Qual seu valor depositado?");
           valorDepositado = sc. nextDouble();
           
           totalJuros = valorDepositado * 0.07;
           
           System.out.println("Este é o seu valor total mais o rendimento dos juros após 1 mês: " + totalJuros);
                      
    }
}
