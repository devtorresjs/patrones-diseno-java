package com.patrones.factory.method.payments.implementations;

import com.patrones.factory.method.payments.IPaymentProcessor;

public class CreditCardProcessor implements IPaymentProcessor {

    @Override
    public void authorizePayment() {
        // TODO Auto-generated method stub
        System.out.println("Pago con TDC autorizado");
    }

    @Override
    public void processPayment() {
        // TODO Auto-generated method stub
        System.out.println("Procesando pago con TDC");
    }

}
