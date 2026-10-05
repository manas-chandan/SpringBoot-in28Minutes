package com.learn.springboot.restfull_web_services.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learn.springboot.restfull_web_services.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
     
}
