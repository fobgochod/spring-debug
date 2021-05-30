package com.mashibing.lesson26.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.mashibing.lesson26.annotation")
@EnableAspectJAutoProxy
public class SpringConfiguration {
}