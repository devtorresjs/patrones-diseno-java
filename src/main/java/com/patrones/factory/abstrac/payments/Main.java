package com.patrones.factory.abstrac.payments;

import com.patrones.factory.abstrac.payments.abstractions.TDCPaymentAbstractFactory;
import com.patrones.factory.abstrac.payments.processor.IPaymentProcessor;
import com.patrones.factory.abstrac.payments.verifier.IPaymentVerifier;

public class Main {
    public static void main(String[] args) {
        IPaymentAbstractFactory paymentAbstractFactory = new TDCPaymentAbstractFactory();
        IPaymentProcessor paymentProcessor = paymentAbstractFactory.createPaymentProcessor();
        IPaymentVerifier paymentVerifier = paymentAbstractFactory.createPaymentVerifier();

        paymentProcessor.processPayment();
        var TDCVerifier = paymentVerifier.createPaymentVerifier();
        System.out.println("Pago verificado: " + TDCVerifier);
        paymentProcessor.authorizePayment();
    }
}
