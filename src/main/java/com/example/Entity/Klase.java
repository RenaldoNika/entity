package com.example.Entity;


import lombok.Setter;

@Setter
public class Klase {

    static int count = 3;

    String lastname;

    static String abs = "abs";


    public String getAbs() {
        return abs;
    }

    @Override
    public String toString() {
        return "Klase{" +
                "lastname='" + lastname + '\'' +
                ""+count+
                '}';
    }

    public void printThis() {
            System.out.println(this.toString());
        }


    void shfaqCount() {
        System.out.println(count);
    }

//    public Klase(String lastname){
//        this.lastname=lastname;
//    }
//    public Klase(){}
//    public Klase(int countt,String lastname) {
//        count=countt;
//        this.lastname=lastname;
//    }


    public static void main(String[] args) {

        Klase klase1=new Klase();
        klase1.setLastname("aaaaaaaaea");
        System.out.println(klase1.toString());








    }

}