package com.leranspring.learn_spring_framework.example.c1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import java.util.Arrays;
import java.util.stream.IntStream;


@Configuration
@ComponentScan
public class RealWordSpringContextLuncherApplication {

    public static void main(String[] args){

    try(var context =  new AnnotationConfigApplicationContext(RealWordSpringContextLuncherApplication.class)){
        System.out.println(context.getBean(BuisnessCalculationService.class).findMax());
    }
    }
}
