package com.gla.Inheritance.Hybrid.Restaurant;

public class Chef extends Person implements Worker {

    Chef(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println("Chef " + name + " is cooking food.");
    }
}
