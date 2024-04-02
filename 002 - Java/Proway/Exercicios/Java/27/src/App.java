import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int car1 = 40000;
        int car2 = 50000;
        int car3 = 70000;

        System.out.println("Nós da concessionária CARANGO estamos com ótimos descontos! Escolha seu carro:");
        System.out.println("1 - Onix Maleta (Melhor que nada) - " + car1 + "R$");
        System.out.println("2 - Tesla Uno (Tem alguma coisa errada...) - " + car2 + "R$");
        System.out.println("3 - Ferrari Zero Bala (Um brinco!) - " + car3 + "R$");
        System.out.println("4 - Se já for cliente");
        int resp = sc.nextInt();

        int valorVeiculo = 0;
        int faltaPagar = 0;

        switch (resp) {
            case 1:
                valorVeiculo = car1;
                break;
            case 2:
                valorVeiculo = car2;
                break;
            case 3:
                valorVeiculo = car3;
                System.out.println("Desconto não se aplica a carros Zero!");
                return;
            case 4:
                System.out.println(
                        "Digite o valor original do seu veículo que foi comprado conosco para verificar a possibilidade de desconto para você.");
                valorVeiculo = sc.nextInt();

                System.out.println("Quanto deste valor já foi pago?");
                int valorPago = sc.nextInt();

                faltaPagar = valorVeiculo - valorPago;
                System.out.println("Falta pagar: " + faltaPagar + ". Vamos verificar a possibilidade de desconto!");
                valorVeiculo = faltaPagar;
                break;
            default:
                System.out.println("Opção inválida.");
                sc.close();
                return;
        }

        double desconto = 0;

        System.out.println("Agora escolha o combustível: ");
        System.out.println("1 - Álcool");
        System.out.println("2 - Gasolina");
        System.out.println("3 - Diesel");
        int tipoCombustivel = sc.nextInt();

        switch (tipoCombustivel) {
            case 1:
                desconto = valorVeiculo * 0.25;
                break;
            case 2:
                desconto = valorVeiculo * 0.21;
                break;
            case 3:
                desconto = valorVeiculo * 0.14;
                break;
            default:
                System.out.println("Opção de combustível inválida.");
                sc.close();
                return;
        }

        double totalComDesconto = valorVeiculo - desconto;

        System.out.println("Seu desconto é de: " + desconto + " R$");
        System.out.println("Esse é o valor total a pagar com o desconto: " + totalComDesconto + " R$");

    }

}
