package com.example.Entity.Trashigimi;

import com.example.Entity.Car;

public class Main {

    public static void main(String[] args) {


        Car car=Car.Builder()
                .model("name")
                .build();


        System.out.println(car.getModel());

    }


}