package com.patrones.factory.abstrac.payments.verifier.implementations;

import com.patrones.factory.abstrac.payments.verifier.IPaymentVerifier;

public class TDCVerifier implements IPaymentVerifier {

    @Override
    public boolean createPaymentVerifier() {
        // TODO Auto-generated method stub
        System.out.println("Validando TDC...");

        return true;
    }

}
