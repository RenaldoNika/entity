package com.example.Entity.intefaraceDouble;

public class TransportManager {

    public static Transport getTransport(String type) {

        if (type.equalsIgnoreCase("car")) {
            return new Car();  // Kthen një instancë të klasës Car
        } else if (type.equalsIgnoreCase("bicycle")) {
            return new Bicycle();
        }
        return null;

    }

    public static void main(String[] args) {


        Transport transport = TransportManager.getTransport("b");
        if (transport != null) {
            transport.start();
        } else {
            System.out.println("Tipi i transportit nuk është i njohur.");
        }
    }
}
