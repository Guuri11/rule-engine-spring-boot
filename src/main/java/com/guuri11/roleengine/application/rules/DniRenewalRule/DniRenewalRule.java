package com.guuri11.roleengine.application.rules.DniRenewalRule;

import com.guuri11.roleengine.domain.Employee;

public interface DniRenewalRule {
    void applyRule(Employee employee);
}
