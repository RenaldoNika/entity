package com.example.Entity;

public class Carr {

   private String type;
   private String model;
   private String year;


    private Carr(Builder bb) {
        this.model = bb.model;
        this.type = bb.type;
        this.year = bb.year;
    }


    public static Builder builder() {
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

        public Carr build() {
            return new Carr(this);
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
