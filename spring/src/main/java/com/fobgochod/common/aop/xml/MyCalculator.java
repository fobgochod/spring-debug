package com.fobgochod.common.aop.xml;

public class MyCalculator {

    public Integer add(Integer i, Integer j) throws NoSuchMethodException {
        Integer result = i + j;
        System.out.printf("add(%s, %s) = %s%n", i, j, result);
        return result;
    }

    public Integer sub(Integer i, Integer j) throws NoSuchMethodException {
        Integer result = i - j;
        System.out.printf("sub(%s, %s) = %s%n", i, j, result);
        return result;
    }

    public Integer mul(Integer i, Integer j) throws NoSuchMethodException {
        Integer result = i * j;
        System.out.printf("mul(%s, %s) = %s%n", i, j, result);
        return result;
    }

    public Integer div(Integer i, Integer j) throws NoSuchMethodException {
        Integer result = i / j;
        System.out.printf("div(%s, %s) = %s%n", i, j, result);
        return result;
    }

    public Integer show(Integer i) {
        System.out.println("show .....");
        return i;
    }
}
