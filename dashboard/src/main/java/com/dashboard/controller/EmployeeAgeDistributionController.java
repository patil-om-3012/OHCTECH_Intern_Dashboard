package com.dashboard.controller;

import com.dashboard.Entity.Employee;
import com.dashboard.services.EmployeeAgeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/age-stats")
public class EmployeeAgeDistributionController {
    private final EmployeeAgeService service;

    public EmployeeAgeDistributionController(EmployeeAgeService service) {
        this.service = service;
    }

    @GetMapping
    public List<Employee> getAgeStats() {
        return service.getAllStats();
    }
}
