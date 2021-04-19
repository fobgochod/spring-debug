package com.mashibing.lesson16;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * AbstractAutowireCapableBeanFactory.java:1200
 * AutowiredAnnotationBeanPostProcessor.java:258
 *
 * <p>
 * boolean resolved = false;
 * boolean autowireNecessary = false;
 *
 * @author zhouxiao
 * @date 2021/2/23
 */
public class Lesson16_2 {

    /**
     * 获取构造器集合
     * 如果有多个Autowired，required为true，不管有没有默认构造方法，会报异常
     * 如果只有一个Autowired，required为false，没有默认构造方法，会报警告
     * 如果没有Autowired注解，定义了两个及以上有参数的构造方法，没有无参构造方法，就会报错 ???
     * 其他情况都可以，但是以有Autowired的构造方法优先，然后才是默认构造方法
     *
     * @param args
     */
    public static void main(String[] args) {

        /**
         * 构造器注入person3.xml
         */
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:config/person16-3.xml");
        Person3 bean = ac.getBean(Person3.class);
        Person3 bean2 = ac.getBean(Person3.class);
    }
}
