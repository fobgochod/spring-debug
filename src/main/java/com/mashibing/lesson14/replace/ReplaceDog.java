package com.mashibing.lesson14.replace;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;
import java.util.Arrays;

public class ReplaceDog implements MethodReplacer {

    @Override
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
        System.out.println("Hello, I am a white dog...");

        System.out.println("obj = " + obj);
        System.out.println("method = " + method);
        System.out.println("args = " + Arrays.toString(args));
        return obj;
    }
}