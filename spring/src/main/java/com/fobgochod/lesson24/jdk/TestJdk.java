package com.fobgochod.lesson24.jdk;

public class TestJdk {

    public static void main(String[] args) {
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        Calculator proxy = CalculatorProxy.getProxy(new MyCalculator());
        proxy.add(1, 1);
        System.out.println(proxy.getClass());
    }
}