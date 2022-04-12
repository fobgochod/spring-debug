package com.fobgochod.lesson.lesson26.annotation;

import org.springframework.stereotype.Service;

@Service
public class SecondCalculator implements Calculator {

    @Override
    public Integer add(Integer i, Integer j) throws NoSuchMethodException {
        return i + j;
    }

    @Override
    public Integer sub(Integer i, Integer j) throws NoSuchMethodException {
        return i - j;
    }

    @Override
    public Integer mul(Integer i, Integer j) throws NoSuchMethodException {
        return i * j;
    }

    @Override
    public Integer div(Integer i, Integer j) throws NoSuchMethodException {
        return i / j;
    }
}
