package ExercícioSete;

import java.util.Scanner;

public class App {
       public static void main(String[] args) {
        
           Scanner sc = new Scanner (System.in);
           
           int c, f;
           
           System.out.println("Quantos graus celsius está agora?");
           c = sc.nextInt();
           
           f =(9* c + 160) / 5;
           
           System.out.println("Em Fahrenheit: " + f);
           
    }
}
