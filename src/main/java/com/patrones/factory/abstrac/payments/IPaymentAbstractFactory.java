package com.patrones.factory.abstrac.payments;

import com.patrones.factory.abstrac.payments.processor.IPaymentProcessor;
import com.patrones.factory.abstrac.payments.verifier.IPaymentVerifier;

public interface IPaymentAbstractFactory {
    IPaymentProcessor createPaymentProcessor();
    IPaymentVerifier createPaymentVerifier();
}
