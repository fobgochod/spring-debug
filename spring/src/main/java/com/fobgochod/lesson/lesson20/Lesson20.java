package com.fobgochod.lesson.lesson20;

import com.fobgochod.lesson.lesson20.cycle.A;
import com.fobgochod.lesson.lesson20.cycle.B;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 功能描述
 *
 * @author fobgochod
 */
public class Lesson20 {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("config/lesson/lesson20.xml");
        A a = ac.getBean(A.class);
        System.out.printf("a.name = %s, a.b = %s\n", a.name(), a.getB());
        B b = ac.getBean(B.class);
        System.out.printf("b.name = %s, b.a = %s\n", b.name(), b.getA());
    }
}
