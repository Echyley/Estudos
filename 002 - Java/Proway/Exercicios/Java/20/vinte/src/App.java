import java.util.Scanner;

public class App {
    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double desconto, valorPagar;
        int anoCarro, valorTotal, calculo, totalSemiNovos = 0, totalCarrosAntigos = 0;

        System.out.println("Digite 1 para Sim.");
        System.out.println("Digite 2 para Não.");
        System.out.println("Deseja calcular o valor dos carros com o desconto?");
        calculo = sc.nextInt();

        switch (calculo) {
            case 1:
                while (calculo == 1) {
                    System.out.println("Qual o ano do carro?");
                    anoCarro = sc.nextInt();
                    System.out.println("Qual o valor total do carro?");
                    valorTotal = sc.nextInt();

                    if (anoCarro <= 2000) {
                        desconto = valorTotal * 0.12f;
                        valorPagar = valorTotal - desconto;
                        System.out.println("O desconto foi no valor de: " + desconto);
                        System.out.println("O valor que deve ser pago é: " + valorPagar);

                    } else if (anoCarro >= 2001) {
                        desconto = valorTotal * 0.07f;
                        valorPagar = valorTotal - desconto;
                        totalSemiNovos++;
                        System.out.println("O desconto foi no valor de: " + desconto);
                        System.out.println("O valor que deve ser pago é: " + valorPagar);
                    }
                    totalCarrosAntigos++;

                    System.out.println("Total de carros antigos: " + totalCarrosAntigos);
                    System.out.println("Total de carros semi novos: " + totalSemiNovos);

                    System.out.println("Deseja continuar?");
                    calculo = sc.nextInt();
                }

            case 2:
                System.out.println("Você saiu.");
                break;
        }
    }
}
