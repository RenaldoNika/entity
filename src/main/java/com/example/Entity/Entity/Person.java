package com.example.Entity.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;


    @Min(value = 18, message = "Mosha minimale duhet të jetë 18 vjeç.")
    private int age;

    @ManyToOne
    @JoinColumn(name = "passport_id", referencedColumnName = "id")
    private Passport passport;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
