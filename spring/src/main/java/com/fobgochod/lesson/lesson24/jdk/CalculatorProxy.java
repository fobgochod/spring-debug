package com.fobgochod.lesson.lesson24.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class CalculatorProxy {

    public static Calculator getProxy(final Calculator calculator) {
        ClassLoader classLoader = calculator.getClass().getClassLoader();
        Class<?>[] interfaces = calculator.getClass().getInterfaces();
        InvocationHandler invocation = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object result = null;
                try {
                    result = method.invoke(calculator, args);
                } catch (Exception ignored) {
                }
                return result;
            }
        };
        Object proxy = Proxy.newProxyInstance(classLoader, interfaces, invocation);
        return (Calculator) proxy;
    }
}
