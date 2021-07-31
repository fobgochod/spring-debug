package com.fobgochod.lesson10.scan;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyService {

    @Bean
    public String show() {
        return "msb";
    }
}
