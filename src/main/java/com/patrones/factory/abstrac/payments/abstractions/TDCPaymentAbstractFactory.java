package com.patrones.factory.abstrac.payments.abstractions;

import com.patrones.factory.abstrac.payments.IPaymentAbstractFactory;
import com.patrones.factory.abstrac.payments.processor.IPaymentProcessor;
import com.patrones.factory.abstrac.payments.processor.implementations.TDCProcessor;
import com.patrones.factory.abstrac.payments.verifier.IPaymentVerifier;
import com.patrones.factory.abstrac.payments.verifier.implementations.TDCVerifier;

public class TDCPaymentAbstractFactory implements IPaymentAbstractFactory{

    @Override
    public IPaymentProcessor createPaymentProcessor() {
        // TODO Auto-generated method stub
        return new TDCProcessor();
    }

    @Override
    public IPaymentVerifier createPaymentVerifier() {
        // TODO Auto-generated method stub
        return new TDCVerifier();
    }

}
