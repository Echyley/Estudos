package application;

import entities.Funcionario;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionario fun = new Funcionario();

        System.out.print("Name: ");
        fun.name = sc.nextLine();
        System.out.print("Gross salary: ");
        fun.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        fun.tax = sc.nextDouble();

        System.out.println("Name: " + fun.name);
        System.out.printf("Gross salary: " + fun.grossSalary);
        System.out.printf(", Tax: " + fun.tax);

        System.out.println();
        System.out.print("Employee: " + fun);
        System.out.println();
        System.out.print("Which percentage to increase salary: ");
        double percentage = sc.nextDouble();
        fun.increaseSalary(percentage);

        System.out.println();
        System.out.println("Updated data: " + fun);
        sc.close();
    }
}