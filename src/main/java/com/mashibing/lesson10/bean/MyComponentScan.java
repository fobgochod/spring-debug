package com.mashibing.lesson10.bean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
@ComponentScan("com.mashibing.lesson9")
public class MyComponentScan {

    @ComponentScan("com.mashibing.lesson9")
    @Configuration
    @Order(90)
    class InnerClass{

    }

}
