package com.patrones.factory.method.insurance.factories;

import com.patrones.factory.method.insurance.IInsurancePolicy;
import com.patrones.factory.method.insurance.IInsurancePolicyFactory;
import com.patrones.factory.method.insurance.Implementations.CarInsurancePolicy;

public class CarInsurancePolicyFactory implements IInsurancePolicyFactory {

    @Override
    public IInsurancePolicy CreateInsurance() {
        // TODO Auto-generated method stub
        return new CarInsurancePolicy();
    }


}
