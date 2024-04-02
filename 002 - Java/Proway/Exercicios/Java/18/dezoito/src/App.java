package ExercicioDezoito;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
           
        for(int i = 0; i <= 5; i++){       
        System.out.println("Digite sua idade :) ");
        int idade;
        idade = sc.nextInt();
        
        if ((idade >= 18)){
            System.out.println("Maior de idade.");
        }else {
        System.out.println("Menor de idade");
        
      }
    }
  }
}
