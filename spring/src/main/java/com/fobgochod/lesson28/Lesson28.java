package com.fobgochod.lesson28;

import com.fobgochod.common.tx.annotation.BookService;
import com.fobgochod.common.tx.annotation.TxConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;

public class Lesson28 {

    public static void main(String[] args) throws SQLException {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(TxConfig.class);
        applicationContext.refresh();
        BookService bean = applicationContext.getBean(BookService.class);
        bean.checkout("zhangsan", 1);
    }
}
