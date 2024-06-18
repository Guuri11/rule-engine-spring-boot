package com.guuri11.roleengine.application.rules.DniRenewalRule;

import com.guuri11.roleengine.domain.Employee;

import java.util.HashMap;
import java.util.Map;

// java 21 preview feature
import static java.lang.StringTemplate.STR;

public class DniRenewalManager {
    private final Map<String, DniRenewalRule> rules = new HashMap<>();

    public DniRenewalManager() {
        // NOTE: this could be done with external configuration files. Loading an external yaml file for example.
        rules.put("Spain", new SpainDniRenewalRule());
        rules.put("Ireland", new IrelandDniRenewalRule());
    }

    public void applyRule(Employee employee) throws IllegalAccessException {
        DniRenewalRule rule = rules.get(employee.getCountry());

        if (rule != null) {
            rule.applyRule(employee);
        } else {
            throw new IllegalAccessException(STR."No rule found for country \{employee.getCountry()}");
        }
    }
}
