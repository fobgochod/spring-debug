package com.fobgochod.annotation.propertysource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PropertyApplication {

    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext("com.fobgochod.annotation.propertysource");
        System.out.println("propertyPojo = " + ac.getBean(PropertyPojo.class));
    }
}
