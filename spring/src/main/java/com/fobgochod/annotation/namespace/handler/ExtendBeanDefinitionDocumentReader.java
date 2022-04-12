package com.fobgochod.annotation.namespace.handler;

import org.springframework.beans.factory.xml.DefaultBeanDefinitionDocumentReader;
import org.w3c.dom.Element;

public class ExtendBeanDefinitionDocumentReader extends DefaultBeanDefinitionDocumentReader {

    @Override
    protected void preProcessXml(Element root) {
        System.out.println("preProcessXml");
    }

    @Override
    protected void postProcessXml(Element root) {
        System.out.println("postProcessXml");
    }
}
