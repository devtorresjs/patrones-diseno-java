package com.patrones.factory.method.payments.factories;

import com.patrones.factory.method.payments.IPaymentProcessor;
import com.patrones.factory.method.payments.IPaymentProcessorFactory;
import com.patrones.factory.method.payments.implementations.CreditCardProcessor;

public class CreditCarPaymentProcessorFactory implements IPaymentProcessorFactory {

    @Override
    public IPaymentProcessor CreatePaymentProcessor() {
        // TODO Auto-generated method stub
        return new CreditCardProcessor();
    }

}
