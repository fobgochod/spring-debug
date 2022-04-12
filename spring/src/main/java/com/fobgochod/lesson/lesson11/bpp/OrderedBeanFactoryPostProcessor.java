package com.fobgochod.lesson.lesson11.bpp;

import com.fobgochod.lesson.lesson11.Person;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
public class OrderedBeanFactoryPostProcessor implements BeanPostProcessor, Ordered {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Person) {
            System.out.printf("2. BeanPostProcessor Ordered [%s] BeforeInitialization. \n", beanName);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Person) {
            System.out.printf("5. BeanPostProcessor Ordered [%s] AfterInitialization. \n", beanName);
        }
        return bean;
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
