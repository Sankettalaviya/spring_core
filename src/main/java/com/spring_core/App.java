package com.spring_core;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello sanket! ");

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Student std = (Student) context.getBean("studentBean");
        System.out.println(std);

    }
}
