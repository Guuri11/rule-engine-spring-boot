package com.guuri11.roleengine.application.rules.DniRenewalRule;

import com.guuri11.roleengine.domain.Employee;

public class IrelandDniRenewalRule implements DniRenewalRule{
    @Override
    public void applyRule(Employee employee) {
        System.out.println("Uploading DNI image");
        System.out.println("Sending notification to RRHH to review");
    }
}
