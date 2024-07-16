package com.patrones.factory.method.insurance.Implementations;

import com.patrones.factory.method.insurance.IInsurancePolicy;

public class CarInsurancePolicy implements IInsurancePolicy {

    @Override
    public void issuePolicy() {
        // TODO Auto-generated method stub
        System.out.println("Emitiendo poliza para auto");
    }

    @Override
    public void cancelPolicy() {
        // TODO Auto-generated method stub
        System.out.println("Cancelano poliza para auto");
    }

}
