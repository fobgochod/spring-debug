package com.fobgochod.lesson.lesson11.bpp;

import com.fobgochod.lesson.lesson11.Person;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class NonBeanFactoryPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Person) {
            System.out.printf("3. BeanPostProcessor Non Order [%s] BeforeInitialization. \n", beanName);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Person) {
            System.out.printf("6. BeanPostProcessor Non Order [%s] AfterInitialization. \n", beanName);
        }
        return bean;
    }
}
