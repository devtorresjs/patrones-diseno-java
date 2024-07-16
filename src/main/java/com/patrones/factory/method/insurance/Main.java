package com.patrones.factory.method.insurance;

import com.patrones.factory.method.insurance.factories.CarInsurancePolicyFactory;

public class Main {
    public static void main(String[] args) {
        IInsurancePolicyFactory carFactory = new CarInsurancePolicyFactory();
        IInsurancePolicy carPolicy = carFactory.CreateInsurance();

        carPolicy.issuePolicy();
        carPolicy.cancelPolicy();
        
    }
}
