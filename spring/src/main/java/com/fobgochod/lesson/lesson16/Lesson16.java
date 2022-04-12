package com.fobgochod.lesson.lesson16;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Person 属性注入
 * AbstractAutowireCapableBeanFactory.java:1180
 * <p>
 * boolean resolved = false;
 * boolean autowireNecessary = false;
 *
 * @author zhouxiao
 * @date 2021/2/23
 */
public class Lesson16 {

    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:config/lesson/lesson16.xml");

        // 属性注入person
        Person bean = ac.getBean(Person.class);
        Person bean2 = ac.getBean(Person.class);
        System.out.println("bean = " + bean);
        System.out.println("bean2 = " + bean2);

        // 构造器注入person2
        Person2 person = ac.getBean(Person2.class);
        Person2 person2 = ac.getBean(Person2.class);
        System.out.println("person1 = " + person);
        System.out.println("person2 = " + person2);
    }
}
