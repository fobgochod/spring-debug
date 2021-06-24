package com.fobgochod.lesson8;

import org.springframework.context.ApplicationContext;

public class Lesson8 {

    public static void main(String[] args) {

        ApplicationContext ac = new MyClassPathXmlApplicationContext("config/lesson8.xml");

    }
}
