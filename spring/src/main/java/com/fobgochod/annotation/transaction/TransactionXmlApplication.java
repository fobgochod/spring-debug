package com.fobgochod.annotation.transaction;

import com.fobgochod.annotation.transaction.service.BookService;
import com.fobgochod.util.CGlibUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *  XmlTransactionApplication.java
 *
 * @author Xiao
 * @date 2022/4/13 0:20
 */
public class TransactionXmlApplication {

    public static void main(String[] args) throws Exception {
        CGlibUtils.generatedCGlibProxyFiles("tx");
        ApplicationContext context = new ClassPathXmlApplicationContext("config/annotation/transaction.xml");
        BookService bookService = context.getBean(BookService.class);
        bookService.checkout("zhangsan", 1);
    }
}
