package com.example.Entity.Mesime;

import java.util.Objects;


public class Personi extends Personat {

    String emer;

    public Personi(String rr,int id,String emer) {
        super(rr,id);
        this.emer = emer;
    }


    public Personi() {
    }

    public String getEmer() {
        return emer;
    }

    public static void main(String[] args) {

        Personi personi = new Personi("Human",54, "RENO");
        System.out.println(personi.getRrace());

    }

}
