package com.fobgochod.lesson10.bean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
@ComponentScan("com.fobgochod.lesson9")
public class MyComponentScan {

    @ComponentScan("com.fobgochod.lesson9")
    @Configuration
    @Order(90)
    class InnerClass{

    }

}
