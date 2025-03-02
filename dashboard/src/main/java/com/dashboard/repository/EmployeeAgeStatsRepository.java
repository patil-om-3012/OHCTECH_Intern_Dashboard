package com.dashboard.repository;


import com.dashboard.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeAgeStatsRepository extends JpaRepository<Employee, String> {
}
