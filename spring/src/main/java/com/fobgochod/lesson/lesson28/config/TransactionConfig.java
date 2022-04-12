package com.fobgochod.lesson.lesson28.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.fobgochod.lesson.lesson28.dao.BookDao;
import com.fobgochod.lesson.lesson28.service.BookService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@PropertySource("classpath:config/database.properties")
@EnableTransactionManagement
public class TransactionConfig {

    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.driverClassName}")
    private String driverClassname;

    @Bean
    public DataSource dataSource() {
        DruidDataSource data = new DruidDataSource();
        data.setUsername(username);
        data.setPassword(password);
        data.setUrl(url);
        data.setDriverClassName(driverClassname);
        return data;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

    @Bean
    public BookDao bookDao() {
        return new BookDao();
    }

    @Bean
    public BookService bookService() {
        bookDao();
        return new BookService();
    }

    @Bean
    public PlatformTransactionManager transactionManager(DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }
}
