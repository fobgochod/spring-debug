package com.mashibing.lesson28;

import com.mashibing.common.tx.annotation.BookService;
import com.mashibing.common.tx.annotation.TransactionConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;

public class Lesson28 {

    public static void main(String[] args) throws SQLException {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(TransactionConfig.class);
        applicationContext.refresh();
        BookService bean = applicationContext.getBean(BookService.class);
        bean.checkout("zhangsan", 1);
    }
}
