package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Echy"); //Adicionar elemento a lista.
        list.add("Kino");
        list.add("Hermes");
        list.add("KinoII");
        list.add("Kaoru");
        list.add("Kenji");

        list.add(1, "Kenshin"); //Adicionar de acordo com posição.

        System.out.println(list.size()); //Ver tamanho.

        list.remove("KinoII"); //Remover elemento da lista, por nome da variável ou posição.

        System.out.println("-------------------");
        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("-------------------");
        list.removeIf(x -> x.charAt(0) == 'E'); // Remover elemento da lista de acordo com predicado
        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("-------------------");
        System.out.println("Index of Kenshin: " + list.indexOf("Kenshin")); //Ver posição do elemento retornando -1 quando n encontrado.

        //Filtra os elementos q contem K a partir de uma expressão Lambda.
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'K').collect(Collectors.toList());
        System.out.println("Filtering who hav 'K' as first word: ");
        for (String x : result) {
            System.out.println(result);
        }

        System.out.println("-------------------");
        //Filtra o primeiro elemento com 'K' e aplica uma exceção caso seja nulo.
        String name = list.stream().filter(x -> x.charAt(0) == 'K').findFirst().orElse(null);
        System.out.println(name);
    }
}