package org.example;

public class Main {
    public static void main(String[] args) {
        // Ex1
        int x, y;
        x = 5;
        y = 2 * x;
        System.out.println(x);
        System.out.println(y);

        // Ex2
        int X;
        double Y;
        X = 5;
        Y = 2 * X;
        System.out.println(X);
        System.out.println(Y);

        // Ex3
        double b, B, h, area;
        b = 6.0;
        B = 8.0;
        h = 5.0;
        area = (b + B) / 2 * h;
        System.out.println(area);

        // Ex4
        int a, c;
        double result;
        a = 5;
        c = 2;
        result = (double) a / c; // Se não convertemos para double, ele vai cortar valores fluantes em inteiros.
        System.out.println(result);

        // Ex5
        double e;
        int f;
        e = 5.0;
        f = (int) e; // Converter o tipo da variavel se chama casting.
    }
}