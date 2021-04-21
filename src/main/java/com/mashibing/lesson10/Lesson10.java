package com.mashibing.lesson10;

import com.mashibing.lesson8.MyClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class Lesson10 {

    public static void main(String[] args) {

        ApplicationContext ac = new MyClassPathXmlApplicationContext("config/lesson10.xml");

    }
}
