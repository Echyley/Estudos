package ExercicioQuinze;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        /*
        Faça um algoritmo que receba um número e diga se este número está no 
        intervalo entre 100 e 200;
        */
        
        int numero;   
        Scanner leitorScanner = new Scanner(System.in);
        
        System.out.println("Digite um número :) ");
             numero = leitorScanner.nextInt();
        
        if (numero >= 100 && numero <= 200) {
            System.out.println("Número no intervalo :D");
        }else {
            System.out.println("Número Não está no intervalo :( ");
        }            
    }
}
