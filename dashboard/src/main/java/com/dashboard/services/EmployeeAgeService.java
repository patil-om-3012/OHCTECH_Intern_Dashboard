package com.dashboard.services;

import com.dashboard.Entity.Employee;
import com.dashboard.repository.EmployeeAgeStatsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeAgeService {
    private final EmployeeAgeStatsRepository repository;

    public EmployeeAgeService(EmployeeAgeStatsRepository repository) {
        this.repository = repository;
    }

    public List<Employee> getAllStats() {
        return repository.findAll();
    }
}


