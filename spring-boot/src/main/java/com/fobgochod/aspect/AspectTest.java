package com.fobgochod.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 应用缓存清除
 *
 * @author linli
 * @date 2021/03/17
 */
@Aspect
@Component
public class AspectTest {

    private static final Logger logger = LoggerFactory.getLogger(AspectTest.class);

    @Before("execution(public * com.fobgochod.service.TestService.sayHello(..))")
    public void test1(JoinPoint joinPoint) {
        try {
            Object[] args = joinPoint.getArgs();

        } catch (Exception ex) {
            logger.error("清除应用缓存出错", ex);
        }
    }

    @Before("execution(public * com.fobgochod.service.TestService.sayHello(..))")
    public void test2(JoinPoint joinPoint) {
        try {
            Object[] args = joinPoint.getArgs();

        } catch (Exception ex) {
            logger.error("清除应用缓存出错", ex);
        }
    }
}
