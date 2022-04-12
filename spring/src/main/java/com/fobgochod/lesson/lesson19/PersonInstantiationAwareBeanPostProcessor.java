package com.fobgochod.lesson.lesson19;

import com.fobgochod.lesson.lesson18.Person;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;

public class PersonInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        Person person = null;
        if (bean instanceof Person) {
            System.out.println("PersonInstantiationAwareBeanPostProcessor---After被调用执行");
            person = (Person) bean;
            person.setName("zhangsan");
            // 返回false会终止后续执行
        }
        return true;
    }
}
