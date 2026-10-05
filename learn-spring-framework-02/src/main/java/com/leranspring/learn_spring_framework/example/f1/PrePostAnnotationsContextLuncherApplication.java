package com.leranspring.learn_spring_framework.example.f1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.stream.IntStream;

@Component
class ClassA{

}
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class ClassB{

    private ClassA classA;

    public ClassB(ClassA classA){
        this.classA= classA;
        System.out.println("B objet is cereated ");
    }

    @PostConstruct
    public void initialize(){
        System.out.println("call after bean creation");
    }


    @PreDestroy
    public void beforeDestroy()
    {
        System.out.println("call before destory");
    }

}


@Configuration
@ComponentScan
public class PrePostAnnotationsContextLuncherApplication {

    public static void main(String[] args){

    try(var context =  new AnnotationConfigApplicationContext(PrePostAnnotationsContextLuncherApplication.class)){
        IntStream.range(0,context.getBeanDefinitionCount()).forEach(i->{
            System.out.println(i+" : "+context.getBeanDefinitionNames()[i]);
        });

        ClassB b1 = context.getBean(ClassB.class);
        ClassB b2 = context.getBean(ClassB.class);
    }
    }
}
