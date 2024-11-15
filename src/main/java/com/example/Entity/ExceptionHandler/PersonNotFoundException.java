package com.example.Entity.ExceptionHandler;



public class PersonNotFoundException extends RuntimeException {

    public PersonNotFoundException(String message){
        super(message);
    }
}
