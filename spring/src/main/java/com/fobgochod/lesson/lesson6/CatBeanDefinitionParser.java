package com.fobgochod.lesson.lesson6;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

public class CatBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

    @Override
    protected Class<?> getBeanClass(Element element) {
        return Cat.class;
    }

    @Override
    protected void doParse(Element element, BeanDefinitionBuilder builder) {
        // 获取标签具体的属性值
        String id = element.getAttribute("id");
        String name = element.getAttribute("name");
        String kind = element.getAttribute("kind");

        if (StringUtils.hasText(id)) {
            builder.addPropertyValue("id", id);
        }
        if (StringUtils.hasText(name)) {
            builder.addPropertyValue("name", name);
        }
        if (StringUtils.hasText(kind)) {
            builder.addPropertyValue("kind", kind);
        }
    }
}
