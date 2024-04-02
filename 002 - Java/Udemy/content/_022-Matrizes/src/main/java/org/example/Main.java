package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Determine o quantas colunas e linhas terá a matriz");
        int n = sc.nextInt();
        //Colchetes duplas determinam um arranjo bidimensional ou uma matriz
        int[][] mat = new int[n][n];

        //É necessário colocar 2 fors para que o valor de n preencha toda a matriz
        for (int j = 0; j < mat.length; j++) { //<-- For para linhas
            for (int i = 0; i < mat[i].length; i++) { //<-- For para colunas
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Main Diagonal: ");
        for (int i = 0; i < mat.length; i++) {
            System.out.print(mat[i][i] + " ");
        }
        System.out.println();

        int count = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] < 0) {
                    count++;
                }
            }
        }

        System.out.println("Negative numbers: " + count);

        sc.close();

    }
}