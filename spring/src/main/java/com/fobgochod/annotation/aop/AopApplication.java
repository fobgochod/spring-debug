package com.fobgochod.annotation.aop;

import com.fobgochod.annotation.aop.config.AopConfiguration;
import com.fobgochod.annotation.aop.service.cglib.CglibCalculator;
import com.fobgochod.annotation.aop.service.jdk.Calculator;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopApplication {

    public static void main(String[] args) throws NoSuchMethodException {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
        ac.register(AopConfiguration.class);
        ac.refresh();

        System.out.println("JdkDynamicAopProxy=================================================================");

        Calculator jdkCalculator = ac.getBean(Calculator.class);
        jdkCalculator.add(1, 1);

        System.out.println("ObjenesisCglibAopProxy==============================================================");

        CglibCalculator cglibCalculator = ac.getBean(CglibCalculator.class);
        cglibCalculator.add(1, 1);
    }
}
