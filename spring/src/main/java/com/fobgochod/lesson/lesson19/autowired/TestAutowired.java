package com.fobgochod.lesson.lesson19.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowired {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:config/lesson/lesson19-autowired.xml");
        LianController bean = applicationContext.getBean(LianController.class);
        bean.show();
    }
}
