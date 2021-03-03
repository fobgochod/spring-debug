package com.mashibing.lesson16;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Person 构造器注入
 * AbstractAutowireCapableBeanFactory.java:1180
 * <p>
 * boolean resolved = false;
 * boolean autowireNecessary = false;
 *
 * @author zhouxiao
 * @date 2021/2/23
 */
public class Test2 {

    public static void main(String[] args) {

        /**
         * 构造器注入person2.xml
         */
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:lesson16/person2.xml");
        Person2 bean = ac.getBean(Person2.class);
        Person2 bean2 = ac.getBean(Person2.class);
    }
}
