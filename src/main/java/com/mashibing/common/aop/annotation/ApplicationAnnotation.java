package com.mashibing.common.aop.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationAnnotation {

    public static void main(String[] args) throws NoSuchMethodException {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
        ac.register(AopConfig.class);
        ac.refresh();
        MyCalculator bean = ac.getBean(MyCalculator.class);
        System.out.println(bean.add(1, 1));
    }
}
