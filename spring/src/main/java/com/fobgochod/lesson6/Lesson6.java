package com.fobgochod.lesson6;

import com.fobgochod.lesson5.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lesson6 {

    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:config/lesson6.xml");
        Person person = ac.getBean(Person.class);
        System.out.println("person = " + person);

        ac = new ClassPathXmlApplicationContext("classpath:config/lesson6-animal.xml");
        Cat cat = ac.getBean(Cat.class);
        System.out.println("cat = " + cat);

        ApplicationContext myac = new MyClassPathXmlApplicationContext("classpath:config/lesson6-animal.xml");
        Cat cat1 = myac.getBean(Cat.class);
        System.out.println("cat1 = " + cat1);
    }
}
