package EstruturaWhile;

import java.util.Scanner;

public class App {
       public static void main(String[] args) {
       
           int totalAlunos = 10;
           
           Scanner sc = new Scanner(System.in);
           
           while (totalAlunos > 0) {
               String nomeAluno = sc.nextLine();
               int idadeAluno = sc.nextInt();
           
               System.out.println("O nome do aluno é:" + nomeAluno +
                       "e sua idade é:" + idadeAluno);
               
               totalAlunos = totalAlunos - 1;
               
               
               
           }
           
           
    }
}
