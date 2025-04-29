package com.fobgochod.lesson.lesson6;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class AnimalNamespaceHandler extends NamespaceHandlerSupport {

    @Override
    public void init() {
        registerBeanDefinitionParser("cat", new CatBeanDefinitionParser());
    }
}
