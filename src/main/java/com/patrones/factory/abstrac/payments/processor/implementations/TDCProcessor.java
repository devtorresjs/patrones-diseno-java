package com.patrones.factory.abstrac.payments.processor.implementations;

import com.patrones.factory.abstrac.payments.processor.IPaymentProcessor;

public class TDCProcessor implements IPaymentProcessor{

    @Override
    public void authorizePayment() {
        // TODO Auto-generated method stub
        System.out.println("Pago con TDC autorizado");
    }

    @Override
    public void processPayment() {
        // TODO Auto-generated method stub
        System.out.println("Pago con TDC procesado");
    }

}
