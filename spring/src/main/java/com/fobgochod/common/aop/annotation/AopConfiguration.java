package com.fobgochod.common.aop.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.fobgochod.common.aop.annotation")
@EnableAspectJAutoProxy
public class AopConfiguration {
}
