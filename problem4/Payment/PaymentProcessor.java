package com.gla.Interfaces.problem4.Payment;

interface PaymentProcessor {
    void pay(double amount);

    default void refund(double amount) {
        System.out.println("Refund of " + amount + " initiated");
    }
}