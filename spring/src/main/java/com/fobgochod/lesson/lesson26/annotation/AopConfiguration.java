package com.fobgochod.lesson.lesson26.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.fobgochod.lesson.lesson26.annotation")
@EnableAspectJAutoProxy
public class AopConfiguration {
}
