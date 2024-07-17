package com.patrones.factory.abstrac.insurance;

import com.patrones.factory.abstrac.insurance.abstractions.CarInsuranceFactory;
import com.patrones.factory.abstrac.insurance.docs.IDocPolicy;
import com.patrones.factory.abstrac.insurance.policies.IInsurancePolicy;

public class Main {
    public static void main(String[] args) {
        IInsurancePolicyFactory insurancePolicyFactory = new CarInsuranceFactory();
        IDocPolicy docPolicy = insurancePolicyFactory.createPolicyDocument();
        IInsurancePolicy insurancePolicy = insurancePolicyFactory.createInsurancePolicy();

        insurancePolicy.issuePolicy();
        docPolicy.GenerateDoc();

    }
}
