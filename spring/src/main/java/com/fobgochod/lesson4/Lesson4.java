package com.fobgochod.lesson4;

import org.springframework.context.ApplicationContext;

public class Lesson4 {

    public static void main(String[] args) {

//        ApplicationContext ac = new ClassPathXmlApplicationContext("config/lesson4-${username}.xml");
//        Person person = ac.getBean(Person.class);
//        System.out.println("person = " + person);

        ApplicationContext ac2 = new MyClassPathXmlApplicationContext("config/lesson4.xml");
        Person person2 = ac2.getBean(Person.class);
        System.out.println("person2 = " + person2);

    }
}
