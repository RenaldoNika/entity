package com.example.Entity.ExceptionHandler;




public class PassportNotFoundException extends RuntimeException{
    public PassportNotFoundException(String message){
        super(message);
    }
}
