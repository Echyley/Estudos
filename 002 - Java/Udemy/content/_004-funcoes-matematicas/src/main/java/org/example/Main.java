package org.example;

public class Main {
    public static void main(String[] args) {
        double x = 3.0;
        double y = 4.0;
        double z = 5.0;
        double A, B, C;

        // Math.sqrt: calcula raiz quadrada do valor inserido na variavel, sempre vem depois da variavel;
        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);
        System.out.println("Raiz quadrada de " + x + " = " + A);
        System.out.println("Raiz quadrada de " + y + " = " + B);
        System.out.println("Raiz quadrada de 25 = " + C);

        // Math.pow calcula o valor inserido na variavel elevado ao valor digitado;
        A = Math.pow(x, y);
        B = Math.pow(x, 2.0);
        C = Math.pow(5.0, 2.0);
        System.out.println(x + " elevado a " + y + " = " + A);
        System.out.println(x + " elevado ao quadrado " + B);

        // Math.abs pega o valor abusoluto de uma variavel, excluindo negativos.
        A = Math.abs(y);
        B = Math.abs(z);
        System.out.println("Valor absoluto de " + y + " = " + A);
        System.out.println("Valor absoluto de " + z + " = " + B);

        // Ex
        double a = 5.5;
        double b = 2.0;
        double c = 3.5;
        double delta = Math.pow(b, 2.0) - 4 * a * c;

        System.out.println("Valor delta = " + delta);
    }
}