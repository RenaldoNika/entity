package com.example.Entity.Trashigimi;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Femij extends Prindi{


    public Femij(int age) {
        super(age);
    }

    @Override
    public String toString() {
        return "Femij{" +
                "age=" + age +
                '}';
    }

    public static void main(String[] args) {

        Femij femij=new Femij(55);
        femij.veprim();
        System.out.println(femij.toString());


        List<String>stringList= Arrays.asList("Reno","RENALDO");

        for (String s:stringList){
            System.out.println(s.toString());
        }


    }

}