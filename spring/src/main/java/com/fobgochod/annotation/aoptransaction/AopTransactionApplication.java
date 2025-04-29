package com.fobgochod.annotation.aoptransaction;

import com.fobgochod.annotation.aoptransaction.service.Calculator;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.fobgochod.annotation.aoptransaction")
public class AopTransactionApplication {

    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
        ac.register(AopTransactionApplication.class);
        ac.refresh();

        Calculator jdkCalculator = ac.getBean(Calculator.class);
        jdkCalculator.add(1, 1);
    }
}
