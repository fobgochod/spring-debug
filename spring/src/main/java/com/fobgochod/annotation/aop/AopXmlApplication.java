package com.fobgochod.annotation.aop;

import com.fobgochod.annotation.aop.service.cglib.CglibCalculator;
import com.fobgochod.annotation.aop.service.jdk.Calculator;
import com.fobgochod.util.CGlibUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopXmlApplication {

    public static void main(String[] args) throws Exception {
        CGlibUtils.generatedCGlibProxyFiles("aop");
        ApplicationContext ac = new ClassPathXmlApplicationContext("config/annotation/aop.xml");

        System.out.println("JdkDynamicAopProxy=================================================================");

        Calculator jdkCalculator = ac.getBean(Calculator.class);
        jdkCalculator.add(1, 1);

        System.out.println("ObjenesisCglibAopProxy==============================================================");

        CglibCalculator cglibCalculator = ac.getBean(CglibCalculator.class);
        cglibCalculator.add(1, 1);
    }
}
