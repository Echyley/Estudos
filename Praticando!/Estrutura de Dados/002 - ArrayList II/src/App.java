import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        int tamanho = 10;
        int[] numeros = new int[tamanho];

        // Gerando números aleatorios inteiros para fazer parte dos 10 espaços da array
        Random rd = new Random();
        for (int i = 0; i < tamanho; i++) {
            numeros[i] = rd.nextInt(100) + 1; // Ajustando a faixa de números gerados de 1 a 100 em vez de 0 a 99.
        }

        // Exigindo números gerados
        System.out.println("Números gerados: ");
        for (int num : numeros) {
            System.out.print(num + " ");
        }

        // Iniciando numero maior na posição 0 da array
        int maior = numeros[0];
        for (int i = 1; i < tamanho; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        System.out.println("Maior número encontrado: " + maior);

    }
}
