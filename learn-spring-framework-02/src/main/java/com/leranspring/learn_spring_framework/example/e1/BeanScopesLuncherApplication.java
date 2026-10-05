package com.leranspring.learn_spring_framework.example.e1;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.stream.IntStream;

@Component
class NormalClass{

}

@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class PrototypeCLass{

}


@Configuration
@ComponentScan
public class BeanScopesLuncherApplication {

    public static void main(String[] args){

    try(var context =  new AnnotationConfigApplicationContext(BeanScopesLuncherApplication.class)){
//        IntStream.range(0,context.getBeanDefinitionCount()).forEach(i->{
//            System.out.println(i+" : "+context.getBeanDefinitionNames()[i]);
//        });

        System.out.println(context.getBean(NormalClass.class));
        System.out.println(context.getBean(NormalClass.class));
        System.out.println(context.getBean(NormalClass.class));


        System.out.println(context.getBean(PrototypeCLass.class));
        System.out.println(context.getBean(PrototypeCLass.class));
        System.out.println(context.getBean(PrototypeCLass.class));

    }
    }
}
