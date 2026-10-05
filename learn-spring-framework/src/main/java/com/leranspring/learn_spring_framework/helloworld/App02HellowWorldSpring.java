package com.leranspring.learn_spring_framework.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HellowWorldSpring {
    public static void main(String[] args){

        try( var context=new AnnotationConfigApplicationContext(HelloSpringConfiguration.class)){
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
            System.out.println(context.getBean("CustomeBeanNameAddress"));
//        System.out.println(context.getBean(Address.class));

            System.out.println(context.getBean("person2methodCall"));
            System.out.println(context.getBean("person"));

            var allBeans = context.getBeanDefinitionNames();
//        System.out.println(context.getBeanDefinitionCount());
//        System.out.println(allBeans.length);
//        for(int i=1;i<= allBeans.length-1;i++){
//            System.out.println(i+": "+allBeans[i]);
//        }
//        Arrays.stream(allBeans).forEach(System.out::println);
//        Arrays.stream(allBeans)
//                .forEach(bean -> System.out.println(bean));

//        IntStream.range(0,allBeans.length).forEach(i ->{
//            System.out.println("-> "+ allBeans[i]);
//        });


            System.out.println(context.getBean(Person.class));
            System.out.println(context.getBean("person3methodCall"));
        }


    }
}
