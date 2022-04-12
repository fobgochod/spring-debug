package com.fobgochod.annotation.methodoverride;

import com.fobgochod.annotation.methodoverride.replaced.OriginalPojo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReplacedXmlApplication {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("config/annotation/replaced-method.xml");

        OriginalPojo dog = ac.getBean(OriginalPojo.class);
        dog.hello();
        dog.hello("woof woof");
    }
}
