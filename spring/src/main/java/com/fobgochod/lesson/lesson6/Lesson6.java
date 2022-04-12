package com.fobgochod.lesson.lesson6;

import com.fobgochod.lesson.lesson5.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lesson6 {

    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:config/lesson/lesson6.xml");
        Person person = ac.getBean(Person.class);
        System.out.println("person = " + person);

        ApplicationContext ac2 = new ClassPathXmlApplicationContext("classpath:config/lesson/lesson6-animal.xml");
        Cat cat = ac2.getBean(Cat.class);
        System.out.println("cat = " + cat);

        ApplicationContext ac3 = new MyClassPathXmlApplicationContext("classpath:config/lesson/lesson6-animal.xml");
        Cat cat1 = ac3.getBean(Cat.class);
        System.out.println("cat1 = " + cat1);
    }
}
