package com.fobgochod.common.tx;

import com.fobgochod.common.CGlibUtils;
import com.fobgochod.common.tx.xml.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @auther: Xiao
 * @date: 2021/6/1 23:22
 * @description: 功能描述
 */
public class XMLApplication {

    public static void main(String[] args) throws Exception {
        CGlibUtils.generatedCGlibProxyFiles("tx");
        ApplicationContext context = new ClassPathXmlApplicationContext("tx.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        bookService.checkout("zhangsan", 1);
    }
}
