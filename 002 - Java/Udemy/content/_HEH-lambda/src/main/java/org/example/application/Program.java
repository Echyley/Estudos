package org.example.application;

import org.example.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static int compareProduct(Product p1, Product p2){
        return p1.getPrice().compareTo(p2.getPrice());
    }
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));

        //list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
        list.sort(Program::compareProduct);

        for (Product p : list) {
            System.out.println(p);
        }
    }
}