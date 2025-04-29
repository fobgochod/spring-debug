package com.fobgochod.lesson.lesson26;

import com.fobgochod.lesson.lesson26.xml.MyCalculator;
import com.fobgochod.util.CGlibUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 功能描述
 *
 * @author fobgochod
 */
public class Lesson26_XML {

    public static void main(String[] args) throws Exception {
        CGlibUtils.generatedCGlibProxyFiles("aop");
        ApplicationContext ac = new ClassPathXmlApplicationContext("config/lesson/lesson21.xml");
        MyCalculator bean = ac.getBean(MyCalculator.class);
        bean.add(1, 1);
        bean.sub(1, 1);
    }
}
