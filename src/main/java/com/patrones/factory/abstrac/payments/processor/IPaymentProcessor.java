package com.patrones.factory.abstrac.payments.processor;

public interface IPaymentProcessor {
    public void authorizePayment();
    public void processPayment();

}
