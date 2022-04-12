package com.fobgochod.annotation.instantiation.resolvebeforeinstantiation;

import org.springframework.stereotype.Component;

@Component
public class BeforePojo {

    public void doSomeThing() {
        System.out.println("执行do some thing....");
    }
}
