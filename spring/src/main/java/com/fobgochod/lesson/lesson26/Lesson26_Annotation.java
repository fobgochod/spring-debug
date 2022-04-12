package com.fobgochod.lesson.lesson26;

import com.fobgochod.lesson.lesson26.annotation.AopConfiguration;
import com.fobgochod.lesson.lesson26.annotation.MyCalculator;
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
