package com.fobgochod.lesson27;

import com.fobgochod.common.CGlibUtils;
import com.fobgochod.common.tx.xml.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 把xml配置的方式准备对象的过程画一个流程图出来
 *
 * @author seven
 * @date 2021/5/31
 */
public class Lesson27 {

    public static void main(String[] args) throws Exception {
        CGlibUtils.generatedCGlibProxyFiles("tx");
        ApplicationContext context = new ClassPathXmlApplicationContext("config/lesson27.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        bookService.checkout("zhangsan", 1);
    }
}
