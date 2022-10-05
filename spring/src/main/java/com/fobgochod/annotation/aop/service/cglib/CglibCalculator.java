package com.fobgochod.annotation.aop.service.cglib;

import com.fobgochod.annotation.aop.config.AopLogUtil;
import org.springframework.stereotype.Service;

@Service
public class CglibCalculator {

    public int add(int a, int b) throws NoSuchMethodException {
        int result = a + b;
        AopLogUtil.printLog("", 3, CglibCalculator.class, "add", new Object[]{a, b}, result);

        if (result == 2) {
            throw new RuntimeException("测试@AfterThrowing");
        }
        return result;
    }
}
