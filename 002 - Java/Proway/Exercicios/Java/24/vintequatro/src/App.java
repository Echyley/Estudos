import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner leitorScanner = new Scanner (System.in);
        
        char desejaContinuar = 'S';
        while (desejaContinuar == 'S'|| desejaContinuar == 's'){
            
            System.out.println("digite um número");
            
            int numero = leitorScanner.nextInt();
            
            if (numero == 0){
                System.out.println("O número é zero");               
            } else {
              if (numero > 0){
                  System.out.println("O número é maior que zero");
              } else {
                  System.out.println("O número é menor que zero");
              }
              }
            System.out.println("Deseja continuar? S - Sim / N - Não.");
            desejaContinuar = leitorScanner.next().charAt(0);
            
            }
               
            
        }        
    }
