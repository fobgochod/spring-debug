package com.fobgochod.annotation.converter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ConversionServiceFactoryBean;

import java.util.Collections;

@Configuration
public class ConverterApplication {

    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext("com.fobgochod.annotation.converter");
        System.out.println("user = " + ac.getBean(User.class));
    }

    @Bean
    public ConversionServiceFactoryBean conversionService() {
        ConversionServiceFactoryBean bean = new ConversionServiceFactoryBean();
        bean.setConverters(Collections.singleton(new StudentConverter()));
        return bean;
    }
}
