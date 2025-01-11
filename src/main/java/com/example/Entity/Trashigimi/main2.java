package com.example.Entity.Trashigimi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class main2 {
    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("RENALDO", "REno", "NALDO");
        List<String> results = stringList
                .stream().collect(Collectors.toList()); // Collects the Boolean results into a list

        System.out.println(results);


    }
}
