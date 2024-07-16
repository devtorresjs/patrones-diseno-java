package com.patrones.factory.method.payments;

import com.patrones.factory.method.payments.factories.CreditCarPaymentProcessorFactory;

public class Main {
    public static void main(String[] args) {
        IPaymentProcessorFactory tdcFactory = new CreditCarPaymentProcessorFactory();
        IPaymentProcessor tdcProcessor = tdcFactory.CreatePaymentProcessor();

        tdcProcessor.processPayment();
        tdcProcessor.authorizePayment();

    }
}
