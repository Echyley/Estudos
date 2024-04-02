package Dez;

import java.util.Scanner;

public class App {    
    public static void main(String[] args) {
       
        Scanner sc = new Scanner (System.in);
        
        float valorCompra, totalPrestacoes;
                
        System.out.println("Qual o valor da compra?");
        valorCompra = sc. nextFloat();
        
        for (int i = 1; i <= 5 ; i++){
        
        totalPrestacoes = valorCompra / i;
        
        System.out.println("Suas prestações em "+i+ "x: " +totalPrestacoes);
        
        }
     
               
    }
}
