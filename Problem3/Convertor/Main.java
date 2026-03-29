package com.gla.Interfaces.Problem3.Convertor;

public class Main {
    public static void main(String[] args) {
        double km = 10;
        double kg = 5;

        System.out.println("Miles: " + UnitConvertor.kmToMiles(km));
        System.out.println("Pounds: " + UnitConvertor.kgToPounds(kg));
    }
}
