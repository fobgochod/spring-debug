package com.fobgochod.annotation.transaction;

import com.fobgochod.annotation.transaction.config.TxConfiguration;
import com.fobgochod.annotation.transaction.service.BookService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *  TransactionApplication.java
 *
 * @author fobgochod
 */
public class TransactionApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(TxConfiguration.class);
        applicationContext.refresh();
        BookService bean = applicationContext.getBean(BookService.class);
        bean.checkout("zhangsan", 1);
    }
}
