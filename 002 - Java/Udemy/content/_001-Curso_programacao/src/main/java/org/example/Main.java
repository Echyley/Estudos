package org.example;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String nome = "Echy";
        int idade = 20;
        double renda = 1300.00;

        // printf além de arredondar delimita o valor a quantidade que queremos;
        // Usamos % para iniciar oq queremos escrever dentro das aspas;
        // %f para flutuantes, %d para inteiros %s para Strings e %n para quebrar a
        // linha;
        // Depois das aspas colocamos , + as variaveis na ordem das %;

        Locale.setDefault(Locale.US);
        // Locale é uma classe para determinar regras de diversas regiões ao código;

        System.out.printf("%s tem %d anos e ganha %.2f reais.%n", nome, idade, renda);

        System.out.printf("%s tem %d anos e ganha %.2f reais.%n", nome, idade, renda);
    }
}