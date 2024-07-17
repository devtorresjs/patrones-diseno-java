package com.patrones.factory.abstrac.insurance.policies.factories;

import com.patrones.factory.abstrac.insurance.policies.IInsurancePolicy;

public class CarInsurancePolicy implements IInsurancePolicy{

    @Override
    public void issuePolicy() {
        // TODO Auto-generated method stub
        System.out.println("Poliza para auto emitida");
    }

    @Override
    public void cancelPolicy() {
        // TODO Auto-generated method stub
        System.out.println("Poliza para auto cancelada");
    }

}
