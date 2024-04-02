package org.example;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student stu = new Student();

        stu.name = sc.nextLine();
        stu.grade1 = sc.nextDouble();
        stu.grade2 = sc.nextDouble();
        stu.grade3 = sc.nextDouble();

        System.out.printf("Final grade: = %.2f", stu.finalGrade());

        if (stu.finalGrade() < 60.0) {
            System.out.println(". Failed :(");
            System.out.printf("Missing %.2f points%n", stu.missingPoints());
        } else {
            System.out.println(". Passed :D");
        }

        sc.close();
    }
}