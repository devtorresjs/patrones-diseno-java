package com.patrones.factory.abstrac.insurance;

import com.patrones.factory.abstrac.insurance.docs.IDocPolicy;
import com.patrones.factory.abstrac.insurance.policies.IInsurancePolicy;

public interface IInsurancePolicyFactory {
    public IInsurancePolicy createInsurancePolicy();
    public IDocPolicy createPolicyDocument();
}
