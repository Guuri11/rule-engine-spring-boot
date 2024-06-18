package com.guuri11.roleengine.application.rules.DniRenewalRule;

import com.guuri11.roleengine.domain.Employee;

public class SpainDniRenewalRule implements DniRenewalRule{
    @Override
    public void applyRule(Employee employee) {
        System.out.println("Uploading DNI image");
    }
}
