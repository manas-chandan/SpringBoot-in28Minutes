package com.learn.springboot.restfull_web_services.service;

import org.springframework.stereotype.Service;

import com.learn.springboot.restfull_web_services.entity.Employee;
import com.learn.springboot.restfull_web_services.repository.EmployeeRepository;

@Service 
public class EmployeeService {


     private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

   
    public void createTwoEmployees() {

        Employee e1 = new Employee("Manas",23);
    

        Employee e2 = new Employee("Akash",24);
    

        employeeRepository.save(e1);

        employeeRepository.save(e2);

        throw new RuntimeException("Testing rollback");
    }
    
}
