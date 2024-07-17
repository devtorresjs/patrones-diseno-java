package com.patrones.factory.abstrac.insurance.docs.implementations;

import com.patrones.factory.abstrac.insurance.docs.IDocPolicy;

public class CarInsuranceDocPolicy implements IDocPolicy{

    @Override
    public void GenerateDoc() {
        // TODO Auto-generated method stub
        System.out.println("Poliza generada");
    }

}
