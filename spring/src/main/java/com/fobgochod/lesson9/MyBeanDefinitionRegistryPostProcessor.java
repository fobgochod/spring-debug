package com.fobgochod.lesson9;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.core.PriorityOrdered;

public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor, PriorityOrdered {
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        System.out.println("执行postProcessBeanDefinitionRegistry---MyBeanDefinitionRegistryPostProcessor");
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(MySelfBeanDefinitionRegistryPostProcessor.class);
        builder.addPropertyValue("name", "zhangsan");
        registry.registerBeanDefinition("msb", builder.getBeanDefinition());

        BeanDefinitionBuilder builder2 = BeanDefinitionBuilder.rootBeanDefinition(Teacher.class);
        builder2.addPropertyValue("name", "lisi");
        registry.registerBeanDefinition("teacher", builder2.getBeanDefinition());
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("执行postProcessBeanFactory---MyBeanDefinitionRegistryPostProcessor");
        BeanDefinition msb = beanFactory.getBeanDefinition("msb");
        msb.getPropertyValues().getPropertyValue("name").setConvertedValue("lisi");
        System.out.println("===============");
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
