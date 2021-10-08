package com.fobgochod.controller;

import com.fobgochod.domain.User;
import org.springframework.context.annotation.Bean;

public interface Controller {

    /**
     * ConfigurationClassParser.java:331
     * Process default methods on interfaces
     *
     * @see org.springframework.context.annotation.ConfigurationClassParser
     */
    @Bean
    default User user1() {
        return new User();
    }
}
