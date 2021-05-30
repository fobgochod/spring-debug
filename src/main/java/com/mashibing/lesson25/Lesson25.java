package com.mashibing.lesson25;

import com.mashibing.lesson21.aop.xml.MyCalculator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 功能描述
 *
 * @author seven
 * @date 2021/5/16
 */
public class Lesson25 {

    public static void main(String[] args) throws Exception {
        ApplicationContext ac = new ClassPathXmlApplicationContext("config/lesson21.xml");
        MyCalculator calculator = ac.getBean(MyCalculator.class);
        calculator.add(1, 1);
        System.out.println("calculator = " + calculator);
    }
}
