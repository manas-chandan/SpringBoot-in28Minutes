package com.leranspring.learn_spring_framework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age,Address address){};
record Address(String firstLine,int pinCode){};

@Configuration
public class HelloSpringConfiguration {

    @Bean
    public String name(){
        return "Manas";
    }


    @Bean
    public int age(){
        return 27;
    }

    @Bean
    public Person person(){
        return new Person("Akash",26,new Address("Utarkul",754208));
    }

    //Using existing bean as a parameter
    @Bean
    @Primary
    public Person person2methodCall(){
        return new Person(name(),age(),address());
    }

    @Bean
    public Person person3methodCall(String name, int age ,@Qualifier("Reema") Address address){
        return new Person(name,age,address);
    }


    @Bean(name="CustomeBeanNameAddress")
    public Address address(){
        return new Address("Tarat",754209);
    }

    @Bean(name="CustomeBeanNameAddress1")
    @Qualifier("Reema")
    public Address address1(){
        return new Address("Nayagadh",754309);
    }

}
