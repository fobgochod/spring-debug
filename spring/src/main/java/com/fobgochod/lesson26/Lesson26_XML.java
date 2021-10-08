package com.fobgochod.lesson26;

import com.fobgochod.common.CGlibUtils;
import com.fobgochod.common.aop.xml.MyCalculator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 功能描述
 *
 * @author seven
 * @date 2021/5/16
 */
public class Lesson26_XML {

    public static void main(String[] args) throws Exception {
        CGlibUtils.generatedCGlibProxyFiles("aop");
        ApplicationContext ac = new ClassPathXmlApplicationContext("config/lesson21.xml");
        MyCalculator bean = ac.getBean(MyCalculator.class);
        bean.add(1, 1);
        bean.sub(1, 1);
    }
}
