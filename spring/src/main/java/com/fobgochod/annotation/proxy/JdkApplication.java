package com.fobgochod.annotation.proxy;

import com.fobgochod.annotation.proxy.jdk.Calculator;
import com.fobgochod.annotation.proxy.jdk.CalculatorProxy;
import com.fobgochod.annotation.proxy.jdk.StandardCalculator;

public class JdkApplication {

    public static void main(String[] args) {
        Calculator calculator = CalculatorProxy.getProxy(new StandardCalculator());
        int add = calculator.add(1, 2);
        System.out.println("add = " + add);
        System.out.println("calculator = " + calculator.getClass());
    }
}
