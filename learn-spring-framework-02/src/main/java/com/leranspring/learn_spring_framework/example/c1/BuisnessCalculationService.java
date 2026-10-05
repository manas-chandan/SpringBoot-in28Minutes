package com.leranspring.learn_spring_framework.example.c1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BuisnessCalculationService {


    private DataService dataService;

    public BuisnessCalculationService(@Qualifier("MySQLDataServiceQualifier") DataService dataService){
        super();
        this.dataService=dataService;
    }

    public int findMax(){
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }
}
