package com.mashibing.lesson6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lesson6 {

    public static void main(String[] args) {

//        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:lesson6/lesson6.xml");

        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:lesson6/animal.xml");
        Cat cat = ac.getBean(Cat.class);
        System.out.println("cat = " + cat);

    }
}
