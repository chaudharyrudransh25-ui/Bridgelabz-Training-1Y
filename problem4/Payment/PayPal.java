package com.gla.Interfaces.problem4.Payment;

class PayPal implements PaymentProcessor {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal");
    }
}