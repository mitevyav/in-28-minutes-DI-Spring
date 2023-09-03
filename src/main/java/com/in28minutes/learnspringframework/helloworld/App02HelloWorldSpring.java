package com.in28minutes.learnspringframework.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02HelloWorldSpring {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
            var bean = context.getBean("name");
            var age = context.getBean("age");
            var person = context.getBean("person");
            var address = context.getBean("address2");
            var person2MethodCall = context.getBean("person2MethodCall");
            var person3Parameters = context.getBean("person3Parameters");
            System.out.println(bean);
            System.out.println(age);
            System.out.println(person);
            System.out.println(context.getBean(Person.class));
            System.out.println(address);
            var addressFromClass = context.getBean(Address.class);
            System.out.println(addressFromClass);
            System.out.println(person2MethodCall);
            System.out.println(person3Parameters);
            System.out.println("START");

            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }


    }

}
