package com.patrones.factory.method.payments;

public interface IPaymentProcessor {

    public void authorizePayment();
    public void processPayment();

}
