package com.fobgochod.lesson.lesson11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lesson11 {

    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("config/lesson/lesson11.xml");
        Person bean = ac.getBean(Person.class);
        System.out.println("bean = " + bean);
    }
}
