package org.example;

public class Main {
    public static void main(String[] args) {

        String[] vect = new String[]{"Echy", "Kino", "Hermes"};

        for (int i = 0; i < vect.length; i++) {
            System.out.println(vect[i]);
        }

        System.out.println("------------------------");
        //O for each  é uma construção de controle de fluxo em Java que é usada para percorrer
        // elementos de coleções ou arrays sem a necessidade de índices explícitos.
        for (String obj : vect) {
            System.out.println(obj);
        }
    }
}