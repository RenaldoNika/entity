package com.example.Entity.jdbc;
import java.util.List;
public class Main {
    public static void main(String[] args) {

//
//        List<String> names = List.of("Ana", "Ben", "Cris");
//        int i = 0;
//
//        while (i < names.size()) {
//
//            System.out.println(names.get(i));
//            i++;
//        }
        int i = 5;
        do {
            System.out.println(i); // Printohet gjithmonë të paktën një herë
            i++;
        } while (i < 5);
        System.out.println("-------------------");

        int x= 5;

        while (x < 5) {
            System.out.println(x); // Ekzekutohet vetëm nëse kushti është true që në fillim
            x++;
        }

    }
}
