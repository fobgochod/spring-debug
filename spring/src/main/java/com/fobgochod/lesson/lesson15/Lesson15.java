package com.fobgochod.lesson.lesson15;

import com.fobgochod.lesson.lesson15.beforeInstantiation.BeforeInstantiation;
import com.fobgochod.lesson.lesson15.factorymethod.Person;
import com.fobgochod.lesson.lesson15.supplier.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lesson15 {

    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("config/lesson/lesson15.xml");

        // resolveBeforeInstantiation
        BeforeInstantiation bean = ac.getBean(BeforeInstantiation.class);
        bean.doSomeThing();

        // instanceSupplier
        User user = ac.getBean(User.class);
        System.out.println(user);

        // factory-method
        Person person = ac.getBean("person", Person.class);
        System.out.println(person);
        Person person2 = ac.getBean("person2", Person.class);
        System.out.println(person2);
    }
}
