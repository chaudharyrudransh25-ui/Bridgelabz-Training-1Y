package com.gla.Interfaces.problem1.MultiVehicle;

class Bike implements Vehicle {
    public void rent() {
        System.out.println("Bike rented");
    }

    public void returnVehicle() {
        System.out.println("Bike returned");
    }
}