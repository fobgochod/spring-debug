package com.fobgochod.lesson.lesson17;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 功能描述
 *
 * @author seven
 * @date 2021/2/23
 */
public class Lesson17 {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("classpath:config/lesson/lesson17.xml");
        Person person = ac.getBean(Person.class);
        System.out.println("person = " + person);
        ac.close();
    }
}
