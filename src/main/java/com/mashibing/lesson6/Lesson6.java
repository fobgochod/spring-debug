package com.mashibing.lesson6;

import com.mashibing.lesson5.Person;
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

    }
}
