package com.fobgochod.annotation.aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.fobgochod.annotation.aop")
@EnableAspectJAutoProxy
public class AopConfiguration {
}
