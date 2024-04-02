package ExercicioQuatorze;

import java.util.Scanner;

public class App {    
    public static void main(String[] args) {
       
        Scanner sc = new Scanner (System.in);
        int a, b;
        
        System.out.println("Informe o valor de A.");
        a = sc.nextInt();
        System.out.println("Informe o valor de B.");
        b = sc.nextInt();
        
        if (a > b){
            System.out.println("A é maior que B.");
        } else {
            System.out.println("B é maior que A.");
        }
       
        
    }
}
