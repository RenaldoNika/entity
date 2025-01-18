package com.example.Entity;

public class Car {

   private String type;
   private String model;
   private String year;


    private Car(Builder builder) {
        this.model = builder.model;
        this.type = builder.type;
        this.year = builder.year;
    }


    public static Builder Builder() {
        return new Builder();
    }

    public static class Builder {
        private String model;
        private String type;
        private String year;



        public Builder model(String model) {
            this.model = model;
            return this;  // Kthehet Builder për chaining
        }

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder year(String year) {
            this.year = year;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }
}
