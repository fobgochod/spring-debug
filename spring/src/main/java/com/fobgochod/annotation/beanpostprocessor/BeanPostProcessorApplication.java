package com.fobgochod.annotation.beanpostprocessor;

import com.fobgochod.annotation.populatebean.populate.domain.PopulatePojo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.fobgochod.annotation.beanpostprocessor")
public class BeanPostProcessorApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
        ac.register(BeanPostProcessorApplication.class);
        ac.refresh();
    }

    @Bean
    public PopulatePojo populatePojo() {
        return new PopulatePojo();
    }
}
