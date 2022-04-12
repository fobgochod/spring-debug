package com.fobgochod.annotation.namespace.handler;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;
import org.springframework.stereotype.Component;

@Component
public class AnimeNamespaceHandler extends NamespaceHandlerSupport {

    @Override
    public void init() {
        registerBeanDefinitionParser("info", new InfoBeanDefinitionParser());
    }
}
