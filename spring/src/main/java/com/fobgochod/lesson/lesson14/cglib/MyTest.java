package com.fobgochod.lesson.lesson14.cglib;

import org.springframework.cglib.proxy.Enhancer;

/**
 * Cglib动态代理
 *
 * @author fobgochod
 */
public class MyTest {

    public static void main(String[] args) {
        // 通过Cglib动态代理获取代理对象的过程，创建调用对象
        Enhancer enhancer = new Enhancer();
        // 设置enhancer对象的父类
        enhancer.setSuperclass(MyCalculator.class);
        // 设置enhancer的回调对象
        enhancer.setCallback(new MyCglib());
        // 创建代理对象
        MyCalculator myCalculator = (MyCalculator) enhancer.create();
        // 通过代理对象调用目标方法
        myCalculator.add(1, 1);
        System.out.println("myCalcuator = " + myCalculator.getClass());
    }
}
