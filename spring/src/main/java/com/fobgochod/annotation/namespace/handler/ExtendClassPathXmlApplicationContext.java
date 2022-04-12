package com.fobgochod.annotation.namespace.handler;

import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExtendClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {

    public ExtendClassPathXmlApplicationContext(String... configLocations) {
        super(configLocations);
    }

    @Override
    protected void initBeanDefinitionReader(XmlBeanDefinitionReader beanDefinitionReader) {
        super.initBeanDefinitionReader(beanDefinitionReader);
        beanDefinitionReader.setDocumentReaderClass(ExtendBeanDefinitionDocumentReader.class);
    }
}
