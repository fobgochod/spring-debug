package com.fobgochod.annotation.proxy.jdk;

public class StandardCalculator implements Calculator {

    @Override
    public int add(int i, int j) {
        return i + j;
    }
}
