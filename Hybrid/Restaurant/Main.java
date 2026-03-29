package com.gla.Inheritance.Hybrid.Restaurant;

public class Main {
    public static void main(String[] args) {
        Chef c = new Chef("Aakash", 1);
        Waiter w = new Waiter("Ramesh", 2);

        c.performDuties();
        w.performDuties();
    }
}