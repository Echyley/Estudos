package ExercícioOnze;

import java.util.Scanner;

public class App {
     public static void main(String[] args) {
        
         Scanner sc = new Scanner (System.in);
         
         float valorCustoProduto,porcentagem, valorVenda;
         
        System.out.println("Qual o valor de custo do produto?");
        valorCustoProduto = sc. nextFloat();
        System.out.println("Informe a porcentagem para acrescentar no valor da Venda");
        porcentagem = sc. nextFloat();
        
        valorVenda = ((porcentagem / 100) * valorCustoProduto )+ valorCustoProduto;
        
        System.out.println("Este é o valor da venda mais a porcentagem: " +valorVenda);
                
    }
}
