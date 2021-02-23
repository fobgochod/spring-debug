package com.mashibing.lesson16.l_16_01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * AbstractAutowireCapableBeanFactory.java:1180
 * <p>
 * boolean resolved = false;
 * boolean autowireNecessary = false;
 *
 * @author zhouxiao
 * @date 2021/2/23
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:lesson16/person.xml");
        Person bean = ac.getBean(Person.class);
        Person bean2 = ac.getBean(Person.class);
    }
}
