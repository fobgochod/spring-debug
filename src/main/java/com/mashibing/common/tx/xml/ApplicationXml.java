package com.mashibing.common.tx.xml;

import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

/**
 * @auther: Xiao
 * @date: 2021/6/1 23:22
 * @description: 功能描述
 */
public class ApplicationXml {

    public static void main(String[] args) throws SQLException {
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "/build/tx");
        ApplicationContext context = new ClassPathXmlApplicationContext("tx.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        bookService.checkout("zhangsan", 1);
    }
}
