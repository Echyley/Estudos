package ExercicioDezesseis;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        /*
Escreva um algoritmo que leia o nome e as três notas obtidas por um aluno 
durante o semestre. Calcular a sua média (aritmética), informar o nome e sua 
menção aprovado (media >= 7), Reprovado (media <= 5) e Recuperação (media entre 
5.1 a 6.9)
        */
       
     int nota1;   
        Scanner leitorScanner = new Scanner(System.in);
        
        System.out.println("Digite sua primeira nota. ");
     
        nota1 = leitorScanner.nextInt();
        
        if (nota1 >= 7) {
            System.out.println("Aprovado :D");
        }else {
            System.out.println("Reprovado :( ");
        } 
    }
}
