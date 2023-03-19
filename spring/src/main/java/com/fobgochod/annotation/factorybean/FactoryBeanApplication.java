package com.fobgochod.annotation.factorybean;

import com.fobgochod.annotation.factorybean.factory.CustomFactoryBean;
import com.fobgochod.annotation.factorybean.factory.FactoryBeanPojo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.fobgochod.annotation.factorybean.factory")
public class FactoryBeanApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
        ac.register(FactoryBeanApplication.class);
        ac.refresh();

        CustomFactoryBean customFactoryBean = ac.getBean("&customFactoryBean", CustomFactoryBean.class);
        System.out.println("customFactoryBean = " + customFactoryBean);

        FactoryBeanPojo pojo1 = ac.getBean("customFactoryBean", FactoryBeanPojo.class);
        System.out.println(pojo1);
        FactoryBeanPojo pojo2 = ac.getBean("customFactoryBean", FactoryBeanPojo.class);
        System.out.println(pojo2);
    }
}
