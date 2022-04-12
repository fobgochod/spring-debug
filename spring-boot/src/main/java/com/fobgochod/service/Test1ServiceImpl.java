package com.fobgochod.service;

import org.springframework.stereotype.Service;

@Service("test1")
public class Test1ServiceImpl implements TestService {

    @Override
    public void sayHello() {
        System.out.println("hello test1...");
    }
}
