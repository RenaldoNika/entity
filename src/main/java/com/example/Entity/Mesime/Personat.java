package com.example.Entity.Mesime;

public class Personat {

    String rrace;
    int id;

    public Personat(String rrace,int id) {
        this.rrace=rrace;
        this.id = id;
    }

    public Personat() {
    }

    static void MetodStatike() {
        System.out.println("MEtod statike");
    }

    String metodBaze() {

        return "METODE BAZE";
    }

    public void setRrace(String rrace) {
        this.rrace = rrace;
    }

    public String getRrace() {
        return rrace;
    }
}