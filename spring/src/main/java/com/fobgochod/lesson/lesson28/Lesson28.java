package com.fobgochod.lesson.lesson28;

import com.fobgochod.lesson.lesson28.config.TransactionConfig;
import com.fobgochod.lesson.lesson28.service.BookService;
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
