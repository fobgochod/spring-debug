package com.fobgochod.annotation.aop.service.jdk;

import org.springframework.stereotype.Service;

@Service
public class JdkCalculator implements Calculator {

    @Override
    public Integer add(Integer i, Integer j) throws NoSuchMethodException {
        Integer result = i + j;
        System.out.printf("%s.add(%s, %s) = %s%n", this.getClass().getName(), i, j, result);
        return result;
    }
}
