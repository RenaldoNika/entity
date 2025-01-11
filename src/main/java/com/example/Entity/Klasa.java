package com.example.Entity;

public class Klasa {

    private static  String fjale = "Statike";




    public Klasa(String a){
        fjale=a;
    }
    public String getE(){
        return fjale;
    }



    public Klasa(){}

    public static void setFjale(String fjale) {
        Klasa.fjale = fjale;
    }

    public class KlaseBrendshem {

        void metoda() {
            System.out.println(fjale);
        }
    }

    public static void main(String[] args) {



        System.out.println(Klasa.fjale);



//        Klasa klasa = new Klasa();
//        Klasa.KlaseBrendshem klaseBrendshem = klasa.new KlaseBrendshem();
//        klaseBrendshem.metoda();
    }


}
