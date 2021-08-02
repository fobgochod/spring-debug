package com.fobgochod.autoconfigure;

import com.fobgochod.domain.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyAutoConfiguration {

    @Bean
    public User user() {
        return new User();
    }
}
