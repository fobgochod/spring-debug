package com.fobgochod.controller;

import com.fobgochod.domain.User;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController extends BaseController implements Controller {

    /**
     * ConfigurationClassParser.java:325
     * Process individual @Bean methods
     *
     * @see org.springframework.context.annotation.ConfigurationClassParser
     */
    @Bean
    public User user2() {
        return new User();
    }

    @GetMapping(value = {"/api/v2/env"})
    public ResponseEntity<?> getEnv() {
        return ResponseEntity.ok().build();
    }

}
