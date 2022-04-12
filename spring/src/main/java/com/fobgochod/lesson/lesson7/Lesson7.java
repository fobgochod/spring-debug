package com.fobgochod.lesson.lesson7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lesson7 {

    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:config/lesson/lesson7.xml");

        Customer customer = ac.getBean(Customer.class);
        System.out.println("customer = " + customer);

    }
}
