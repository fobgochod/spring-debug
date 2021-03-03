package com.mashibing.lesson17;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 功能描述
 *
 * @author seven
 * @date 2021/2/23
 */
public class Test {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("classpath:lesson17/person.xml");
        Person person = ac.getBean("person", Person.class);
        ac.close();
    }
}
