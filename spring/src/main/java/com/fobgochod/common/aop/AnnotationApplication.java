package com.fobgochod.common.aop;

import com.fobgochod.common.aop.annotation.AopConfiguration;
import com.fobgochod.common.aop.annotation.Calculator;
import com.fobgochod.common.aop.annotation.MyCalculator;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationApplication {

    public static void main(String[] args) throws NoSuchMethodException {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
        ac.register(AopConfiguration.class);
        ac.refresh();
        MyCalculator bean = ac.getBean(MyCalculator.class);
        bean.add(1, 1);
        Calculator bean2 = ac.getBean(Calculator.class);
        bean2.sub(2, 1);
    }
}
