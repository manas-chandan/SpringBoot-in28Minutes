package com.learn.springboot.restfull_web_services.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.springboot.restfull_web_services.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeContorller {

    private final EmployeeService employeeService;

    public EmployeeContorller(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/save")
    public String saveEmployee() {
        employeeService.createTwoEmployees();

        return "2 Employee Saved";
    }

    @GetMapping("/save1")
    public String saveEmployeee() {

        return "2 Employee Saved";
    }

}
