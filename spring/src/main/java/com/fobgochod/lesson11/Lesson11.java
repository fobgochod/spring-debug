package com.fobgochod.lesson11;

import com.fobgochod.lesson8.MyClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class Lesson11 {

    public static void main(String[] args) {

        ApplicationContext ac = new MyClassPathXmlApplicationContext("config/lesson10.xml");

    }
}
