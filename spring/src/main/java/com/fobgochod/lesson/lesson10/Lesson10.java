package com.fobgochod.lesson.lesson10;

import com.fobgochod.lesson.lesson10.scan.Person;
import com.fobgochod.lesson.lesson8.MyClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Lesson10 {

    public static void main(String[] args) {

        ApplicationContext ac = new MyClassPathXmlApplicationContext("config/lesson/lesson10.xml");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.fobgochod.lesson.lesson10");
        Person bean = context.getBean(Person.class);
        System.out.println("bean = " + bean);
    }
}
