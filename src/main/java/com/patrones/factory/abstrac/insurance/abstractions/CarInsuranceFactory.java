package com.patrones.factory.abstrac.insurance.abstractions;

import com.patrones.factory.abstrac.insurance.IInsurancePolicyFactory;
import com.patrones.factory.abstrac.insurance.docs.IDocPolicy;
import com.patrones.factory.abstrac.insurance.docs.factories.CarInsuranceDocPolicy;
import com.patrones.factory.abstrac.insurance.policies.IInsurancePolicy;
import com.patrones.factory.abstrac.insurance.policies.factories.CarInsurancePolicy;

public class CarInsuranceFactory implements IInsurancePolicyFactory {

    @Override
    public IInsurancePolicy createInsurancePolicy() {
        // TODO Auto-generated method stub
        return new CarInsurancePolicy();
    }

    @Override
    public IDocPolicy createPolicyDocument() {
        // TODO Auto-generated method stub
        return new CarInsuranceDocPolicy();
    }

}
