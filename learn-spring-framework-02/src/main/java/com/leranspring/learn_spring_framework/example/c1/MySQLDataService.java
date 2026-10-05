package com.leranspring.learn_spring_framework.example.c1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("MySQLDataServiceQualifier")
public class MySQLDataService implements DataService{
    public int[] retrieveData(){
        return new int[] {11,22,33,44,55};
    }
}
