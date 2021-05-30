package com.mashibing.lesson26;

import com.mashibing.lesson21.aop.xml.MyCalculator;
import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Field;
import java.util.Properties;

/**
 * 功能描述
 *
 * @author seven
 * @date 2021/5/16
 */
public class Lesson26 {

    public static void main(String[] args) throws Exception {
        saveGeneratedCGlibProxyFiles(System.getProperty("user.dir") + "/build/proxy");
        ApplicationContext ac = new ClassPathXmlApplicationContext("config/lesson21.xml");
        MyCalculator bean = ac.getBean(MyCalculator.class);
        bean.add(1, 1);
        bean.sub(1, 1);
    }

    public static void saveGeneratedCGlibProxyFiles(String dir) throws Exception {
        Field field = System.class.getDeclaredField("props");
        field.setAccessible(true);
        Properties props = (Properties) field.get(null);
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, dir);//dir为保存文件路径
        props.put("net.sf.cglib.core.DebuggingClassWriter.traceEnabled", "true");
    }
}
