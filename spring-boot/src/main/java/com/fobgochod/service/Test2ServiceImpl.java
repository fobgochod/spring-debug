package com.fobgochod.service;

import org.springframework.stereotype.Service;

@Service("test2")
public class Test2ServiceImpl implements TestService {

    @Override
    public void sayHello() {
        System.out.println("hello test2...");
    }
}
