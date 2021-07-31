package com.fobgochod.lesson10.bean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
@ComponentScan("com.fobgochod.lesson10.scan")
public class MyComponentScan {

    @ComponentScan("com.fobgochod.lesson10.cond")
    @Configuration
    @Order(10)
    class InnerClass {

    }
}
