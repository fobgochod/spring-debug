package com.fobgochod.lesson.lesson6;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @auther: Xiao
 * @date: 2021/4/7 21:35
 * @description: 功能描述
 */
public class AnimalNamespaceHandler extends NamespaceHandlerSupport {

    @Override
    public void init() {
        registerBeanDefinitionParser("cat", new CatBeanDefinitionParser());
    }
}
