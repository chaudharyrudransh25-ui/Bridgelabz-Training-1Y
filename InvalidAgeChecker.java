package com.gla.ExceptionHandling;

public class InvalidAgeChecker extends Exception{
    public InvalidAgeChecker(String msg){
        super(msg);
    }
}