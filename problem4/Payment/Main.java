package com.gla.Interfaces.problem4.Payment;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor p1 = new PayPal();
        PaymentProcessor p2 = new Stripe();

        p1.pay(500);
        p1.refund(200);

        p2.pay(1000);
        p2.refund(300);
    }
}