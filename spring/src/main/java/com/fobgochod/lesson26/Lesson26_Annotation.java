package com.fobgochod.lesson26;

import com.fobgochod.common.aop.annotation.AopConfiguration;
import com.fobgochod.common.aop.annotation.MyCalculator;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Lesson26_Annotation {

    public static void main(String[] args) throws NoSuchMethodException {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
        ac.register(AopConfiguration.class);
        ac.refresh();
        MyCalculator bean = ac.getBean(MyCalculator.class);
        bean.add(1, 1);
    }
}
