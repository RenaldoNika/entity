package com.example.Entity.ExceptionHandler;

import com.example.Entity.Entity.Passport;

public class PassportNotFoundException extends RuntimeException{
    public PassportNotFoundException(String message){
        super(message);
    }
}
