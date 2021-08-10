package com.fobgochod.controller;

import com.fobgochod.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;

public class BaseController {

    protected static final Logger logger = LoggerFactory.getLogger(BaseController.class);

    @Bean
    public User user3() {
        return new User();
    }
}
