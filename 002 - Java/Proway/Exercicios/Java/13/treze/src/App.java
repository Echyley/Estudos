package ExercicioTreze;

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner (System.in);
        Random rd = new Random();
        int numeroAleatorio = rd.nextInt(15);
        
        if (numeroAleatorio > 10){
        System.out.println("O número é maior que dez :D");            
        System.out.println(numeroAleatorio);
        } else { 
        System.out.println("O número não é maior que dez :( ");           
        }
        
        
    }
}
