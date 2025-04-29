package com.fobgochod.lesson.lesson19;

import com.fobgochod.lesson.lesson18.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 功能描述
 *
 * @author fobgochod
 */
public class Lesson19 {

    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:config/lesson/lesson19.xml");
        Person person = ac.getBean("person", Person.class);
        System.out.println("person = " + person);
    }
}
