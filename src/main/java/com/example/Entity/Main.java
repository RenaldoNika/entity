package com.example.Entity;

public class Main {

    public static void main(String[] args) {

        Klasa klasa = new Klasa("ABX");

        Klasa klasa1 = new Klasa("HELLO");

        System.out.println(klasa.getE());

        System.out.println(klasa1.getE());


//        Motor motor1=new Motor();
//
//        System.out.println(motor1.year);


        Motor motor11=new Motor();
        motor11.year="1";
//
//        System.out.println(motor1.getYear());
//
//        Motor motor=Motor.builder()
//                .model("a")
//                .year("10")
//                .build();
//
//        System.out.println(motor.year);

    }


}