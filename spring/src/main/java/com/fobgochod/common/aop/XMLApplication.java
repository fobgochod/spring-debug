package com.fobgochod.common.aop;

import com.fobgochod.common.CGlibUtils;
import com.fobgochod.common.aop.xml.Calculator;
import com.fobgochod.common.aop.xml.MyCalculator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLApplication {

    public static void main(String[] args) throws Exception {
        CGlibUtils.generatedCGlibProxyFiles("aop");
        ApplicationContext ac = new ClassPathXmlApplicationContext("aop.xml");
        MyCalculator bean = ac.getBean(MyCalculator.class);
        bean.add(1, 1);
        Calculator bean2 = ac.getBean(Calculator.class);
        bean2.sub(2, 1);
    }
}
