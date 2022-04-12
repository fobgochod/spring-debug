package com.fobgochod.lesson.lesson9;

import com.fobgochod.lesson.lesson8.MyClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class Lesson9 {

    public static void main(String[] args) {

        ApplicationContext ac = new MyClassPathXmlApplicationContext("config/lesson/lesson9.xml");

    }
}
