package org.example;

public class Main {
    public static void main(String[] args) {
        String original = "abcde FGHI ABC abc DEFG  ";

        String s01 = original.toLowerCase(); // dxa em minusculo
        String s02 = original.toUpperCase(); // dxa em maiusculo
        String s03 = original.trim(); // elimina os espaços
        String s04 = original.substring(2); // cria nova string de uma posição determinada
        String s05 = original.substring(2, 9); // cria nova string de uma posição e termina de outra
        String s06 = original.replace('a', 'b'); // com '' troca apenas um caractere pelo outro
        String s07 = original.replace("abc", "yey"); // com "" troca mais de um caractere por outros
        int i = original.indexOf("bc"); // pega o 1º valor da string e guarda numa variavel
        int j = original.lastIndexOf("bc"); // pega o ultimo valor da string e guarda numa variavel

        System.out.println("Original: -" + original + "-");
        System.out.println("toLowerCase: -" + s01 + "-");
        System.out.println("toUpperCase: -" + s02 + "-");
        System.out.println("trim: " + s03 + "-");
        System.out.println("substring(2): " + s04 + "-");
        System.out.println("substring(2, 9): " + s05 + "-");
        System.out.println("replace('a', 'b') : " + s06 + "-");
        System.out.println("replace: ('abc', 'yey') " + s07 + "-");
        System.out.println("Index of 'bc': " + i);
        System.out.println("Last index of 'bc': " + j);

        //--------------------------------------------------------------------------------//

        String s = "potato apple lemon";
        String[] vect = s.split(" "); //split recorta valores de uma variavel alocando-os em outras

        System.out.println(s);
        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);
    }
}