package com.fobgochod.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

    @GetMapping(value = {"/api/v2/env"})
    public ResponseEntity<?> getRuntimeEnv() {
        return ResponseEntity.ok().build();
    }

}