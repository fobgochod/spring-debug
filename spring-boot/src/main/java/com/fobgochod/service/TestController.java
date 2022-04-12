package com.fobgochod.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Qualifier("test2")
    @Autowired
    private TestService testService;

    @GetMapping("/api/v2/test")
    public ResponseEntity<?> test() {
        testService.sayHello();
        return ResponseEntity.ok().build();
    }

}
