package com.fobgochod.lesson.lesson6;

import org.springframework.beans.factory.xml.DefaultBeanDefinitionDocumentReader;
import org.w3c.dom.Element;

public class MyBeanDefinitionDocumentReader extends DefaultBeanDefinitionDocumentReader {

    @Override
    protected void preProcessXml(Element root) {
        System.out.println("preProcessXml");
    }

    @Override
    protected void postProcessXml(Element root) {
        System.out.println("postProcessXml");
    }
}
