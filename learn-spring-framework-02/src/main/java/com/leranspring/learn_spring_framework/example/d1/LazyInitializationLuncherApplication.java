package com.leranspring.learn_spring_framework.example.d1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.stream.IntStream;

@Component
class ClassA{

}

@Component
@Lazy
class ClassB{

    private ClassA classA;

    public ClassB(ClassA classA)
    {
        System.out.println("some initialization logic");
        this.classA=classA;
    }
}


@Configuration
@ComponentScan
public class LazyInitializationLuncherApplication {

    public static void main(String[] args){

    try(var context =  new AnnotationConfigApplicationContext(LazyInitializationLuncherApplication.class)){
//        IntStream.range(0,context.getBeanDefinitionCount()).forEach(i->{
//            System.out.println(context.getBeanDefinitionNames()[i]);
//        });
    }
    }
}
