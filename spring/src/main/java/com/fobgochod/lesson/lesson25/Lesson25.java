package com.fobgochod.lesson.lesson25;

import com.fobgochod.lesson.lesson26.xml.MyCalculator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 功能描述
 *
 * @author fobgochod
 */
public class Lesson25 {

    public static void main(String[] args) throws Exception {
        ApplicationContext ac = new ClassPathXmlApplicationContext("config/lesson/lesson21.xml");
        MyCalculator calculator = ac.getBean(MyCalculator.class);
        calculator.add(1, 1);
        System.out.println("calculator = " + calculator);
    }
}
