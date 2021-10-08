package com.fobgochod.common.tx;

import com.fobgochod.common.tx.annotation.BookService;
import com.fobgochod.common.tx.annotation.TransactionConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @auther: Xiao
 * @date: 2021/6/1 23:23
 * @description: 功能描述
 */
public class AnnotationApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(TransactionConfiguration.class);
        applicationContext.refresh();
        BookService bean = applicationContext.getBean(BookService.class);
        bean.checkout("zhangsan", 1);
    }
}
