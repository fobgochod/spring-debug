package com.mashibing.lesson20;

import com.mashibing.lesson20.cycle.A;
import com.mashibing.lesson20.cycle.B;
import com.mashibing.lesson20.cycle.C;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 功能描述
 *
 * @author seven
 * @date 2021/5/16
 */
public class Lesson20 {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("config/lesson20.xml");
        A a = ac.getBean(A.class);
        System.out.println("a.b = " + a.getB());
        B b = ac.getBean(B.class);
        System.out.println("b.c = " + b.getC());
        C c = ac.getBean(C.class);
        System.out.println("c.a = " + c.getA());
    }
}
