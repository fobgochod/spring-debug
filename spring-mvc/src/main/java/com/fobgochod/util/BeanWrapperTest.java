package com.fobgochod.util;

import com.fobgochod.bean.User;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.PropertyAccessorFactory;
import org.springframework.beans.PropertyValue;

public class BeanWrapperTest {

    public static void main(String[] args) {
        User user = new User();
        BeanWrapper beanWrapper = PropertyAccessorFactory.forBeanPropertyAccess(user);
        beanWrapper.setPropertyValue("name", "张三");
        System.out.println(user.getName());

        PropertyValue value = new PropertyValue("name", "李四");
        beanWrapper.setPropertyValue(value);
        System.out.println(user.getName());
    }
}
