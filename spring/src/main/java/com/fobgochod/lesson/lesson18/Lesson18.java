package com.fobgochod.lesson.lesson18;

import com.fobgochod.lesson.lesson18.annotation.PersonController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 功能描述
 *
 * @author fobgochod
 */
public class Lesson18 {

    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:config/lesson/lesson18.xml");
        Person person = ac.getBean("person", Person.class);
        System.out.println("person = " + person);


        PersonController controller = ac.getBean(PersonController.class);
        System.out.println("controller = " + controller);
    }
}
