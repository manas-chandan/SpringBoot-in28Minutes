package com.leranspring.learn_spring_framework.example.a0;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import java.util.Arrays;
import java.util.stream.IntStream;


@Configuration
@ComponentScan("com.leranspring.learn_spring_framework.example.a1")
public class SimpleSpringContextLuncherApplication {

    public static void main(String[] args){

    try(var context =  new AnnotationConfigApplicationContext(SimpleSpringContextLuncherApplication.class)){
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        IntStream.range(0,context.getBeanDefinitionCount()).forEach(i->{
            System.out.println(context.getBeanDefinitionNames()[0]);
        });
    }
    }
}
