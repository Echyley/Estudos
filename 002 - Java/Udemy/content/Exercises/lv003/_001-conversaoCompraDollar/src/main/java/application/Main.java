package application;

import entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

import static entities.CurrencyConverter.Conversion;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price?");
        double dollar = sc.nextDouble();

        System.out.print("How many dollars will be bought?");
        double bDollar = sc.nextDouble();

        CurrencyConverter converter = new CurrencyConverter(bDollar, dollar);
        System.out.printf("Amount to be paid in reais: %.2f", converter.Conversion());

        sc.close();
    }
}