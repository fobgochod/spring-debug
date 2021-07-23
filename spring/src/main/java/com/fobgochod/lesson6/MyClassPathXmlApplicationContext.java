package com.fobgochod.lesson6;

import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {

    public MyClassPathXmlApplicationContext(String... configLocations) {
        super(configLocations);
    }

    @Override
    protected void initBeanDefinitionReader(XmlBeanDefinitionReader beanDefinitionReader) {
        super.initBeanDefinitionReader(beanDefinitionReader);
        beanDefinitionReader.setDocumentReaderClass(MyBeanDefinitionDocumentReader.class);
    }
}
