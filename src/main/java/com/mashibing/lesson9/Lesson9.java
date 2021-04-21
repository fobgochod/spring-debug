package com.mashibing.lesson9;

import com.mashibing.lesson8.MyClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class Lesson9 {

    public static void main(String[] args) {

        ApplicationContext ac = new MyClassPathXmlApplicationContext("config/lesson9.xml");

    }
}
