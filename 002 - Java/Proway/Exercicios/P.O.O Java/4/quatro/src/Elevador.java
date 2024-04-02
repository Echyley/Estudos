public class Elevador {
    int terreo, andar1, andar2, andar3, qtdPessoa;

    public Elevador (int totalAndares, int capacidade){
        System.out.println("Quantos adares há no prédio?");
        totalAndares = sc.nextInt();
        System.out.println("Qual a capacidade do elevador?");
        capacidade = sc.nextInt();
    }

}