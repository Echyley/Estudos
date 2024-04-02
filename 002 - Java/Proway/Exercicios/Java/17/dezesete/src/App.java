package ExercicioDezesete;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        int a;
        Scanner sc = new Scanner (System.in);
           
        for(int i = 0; i <= 5; i++){
       
        System.out.println(i);
        System.out.println("Digite um número :) ");
        a = sc.nextInt();
        
        if ((a >= 10 && a <= 150)){
            System.out.println("Está no intervalo :D");
        }else {
        System.out.println("Não está no intervalo :C");
        }
    }
  }
}