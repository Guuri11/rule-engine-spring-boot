package com.guuri11.roleengine.infrastructure;

import com.guuri11.roleengine.application.DniRenewalService;
import com.guuri11.roleengine.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/dni")
public class DniController {
    DniRenewalService dniRenewalService;

    @Autowired
    public DniController(DniRenewalService dniRenewalService) {
        this.dniRenewalService = dniRenewalService;
    }

    @PostMapping("/renew")
    public ResponseEntity<String> renew(@RequestBody Employee employee) throws IllegalAccessException {
        dniRenewalService.renewDni(employee);

        return ResponseEntity.ok("DNI renewal process initiated");
    }
}