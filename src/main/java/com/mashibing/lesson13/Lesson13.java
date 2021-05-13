package com.mashibing.lesson13;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lesson13 {

    public static void main(String[] args) throws Exception {

        ApplicationContext ac = new ClassPathXmlApplicationContext("config/lesson13.xml");

        User user = ac.getBean(User.class);
        System.out.println("user = " + user.getUsername());

        MyFactoryBean myFactoryBean = (MyFactoryBean) ac.getBean("&myFactoryBean");
        System.out.println("myFactoryBean = " + myFactoryBean);


        User user1 = (User) ac.getBean("myFactoryBean");
        System.out.println(user1);
        User user2 = (User) ac.getBean("myFactoryBean");
        System.out.println(user2);
    }
}
