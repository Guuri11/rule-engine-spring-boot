package com.guuri11.roleengine.application;

import com.guuri11.roleengine.application.rules.DniRenewalRule.DniRenewalManager;
import com.guuri11.roleengine.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DniRenewalService {
    private final DniRenewalManager dniRenewalManager;

    @Autowired
    public DniRenewalService(DniRenewalManager dniRenewalManager) {
        this.dniRenewalManager = dniRenewalManager;
    }

    public void renewDni(Employee employee) throws IllegalAccessException {
        dniRenewalManager.applyRule(employee);
    }
}
