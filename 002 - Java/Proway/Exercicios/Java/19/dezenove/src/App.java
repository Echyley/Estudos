package dezenove;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        String nome;
        int sexo, totalhomi, totalmuie;
        
        totalhomi = 0;
        totalmuie = 0;
        
        for(int i = 0; i <= 5; i++){
        
        System.out.println("Digite seu nome :) ");
        nome = sc.nextLine();
        System.out.println("Digite seu gênero, 1 para masculino e 2 para feminino.");
        sexo = sc.nextInt();
        sc.nextLine();
        
        if ((sexo == 1)){
            System.out.println(nome + " é homi :) ");
            totalhomi += 1;
        }else {
        System.out.println(nome + " é muié :D");
        totalmuie += 1;
      }
     }
        System.out.println("Este é o total de homi: " + totalhomi);
        System.out.println("Este é o total de muié: " + totalmuie);
    }
}
