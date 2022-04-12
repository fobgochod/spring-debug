package com.fobgochod.lesson.lesson5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lesson5 {

    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:config/lesson/lesson5.xml");
        Person person2 = ac.getBean("person2", Person.class);
        System.out.println("person2 = " + person2);

    }
}
