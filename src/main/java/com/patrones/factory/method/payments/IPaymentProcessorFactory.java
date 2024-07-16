package com.patrones.factory.method.payments;

public interface IPaymentProcessorFactory {
    IPaymentProcessor CreatePaymentProcessor();
}
