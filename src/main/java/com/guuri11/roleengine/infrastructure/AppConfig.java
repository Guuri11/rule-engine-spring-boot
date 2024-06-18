package com.guuri11.roleengine.infrastructure;

import com.guuri11.roleengine.application.rules.DniRenewalRule.DniRenewalManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public DniRenewalManager dniRenewalManager() {
        return new DniRenewalManager();
    }
}
