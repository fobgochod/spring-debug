package com.fobgochod.annotation.aoptransaction.service;

import com.fobgochod.annotation.aop.config.AopLogUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class JdkCalculator implements Calculator {

    @Transactional
    @Override
    public int add(int a, int b) {
        int result = a + b;
        AopLogUtil.printLog("", 3, JdkCalculator.class, "add", new Object[]{a, b}, result);
        return result;
    }
}
