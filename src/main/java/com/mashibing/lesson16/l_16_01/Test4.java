package com.mashibing.lesson16.l_16_01;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 功能描述
 *
 * @author seven
 * @date 2021/2/23
 */
public class Test4 {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("classpath:lesson16/person4.xml");
        Person4 person = ac.getBean("person4", Person4.class);
        ac.close();
    }
}
