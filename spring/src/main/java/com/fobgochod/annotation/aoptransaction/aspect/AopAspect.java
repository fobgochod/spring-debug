package com.fobgochod.annotation.aoptransaction.aspect;

import com.fobgochod.annotation.aop.config.AopLogUtil;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.aop.aspectj.annotation.AnnotationAwareAspectJAutoProxyCreator;
import org.springframework.aop.aspectj.annotation.ReflectiveAspectJAdvisorFactory;
import org.springframework.stereotype.Component;

/**
 * 通过注解实现AOP
 * 排序规则：{@link ReflectiveAspectJAdvisorFactory#adviceMethodComparator}
 *
 * @author Xiao
 * @date 2022/10/5 12:35
 * @see AnnotationAwareAspectJAutoProxyCreator
 */
@Aspect
@Component
public class AopAspect {

    @Pointcut("execution(public int com.fobgochod.annotation.aoptransaction.service.JdkCalculator.add(int, int))")
    public void pointCut() {
    }

    @Around("pointCut()")
    public Object aroundMethod(ProceedingJoinPoint pjp) throws Throwable {
        Signature signature = pjp.getSignature();
        Object[] args = pjp.getArgs();
        Object result = null;
        try {
            AopLogUtil.annotationLog(1, Around.class, signature.getName(), pjp.getArgs(), null);
            //通过反射的方式调用目标的方法，相当于执行method.invoke(),可以自己修改结果值
            result = pjp.proceed(args);

            AopLogUtil.annotationLog(6, Around.class, signature.getName(), args, result);
        } finally {
            AopLogUtil.annotationLog(7, Around.class, signature.getName(), args, result);
        }
        return result;
    }


    @Before(value = "pointCut()")
    private int beforeMethod(JoinPoint joinPoint) {
        //获取方法签名
        Signature signature = joinPoint.getSignature();
        //获取参数信息
        Object[] args = joinPoint.getArgs();

        AopLogUtil.annotationLog(2, Before.class, signature.getName(), args, null);
        return 100;
    }

    @AfterReturning(value = "pointCut()", returning = "result")
    public void afterReturningMethod(JoinPoint joinPoint, Object result) {
        Signature signature = joinPoint.getSignature();
        AopLogUtil.annotationLog(4, AfterReturning.class, signature.getName(), new Object[]{}, result);
    }

    @AfterThrowing(value = "pointCut()", throwing = "e")
    public void afterThrowingMethod(JoinPoint joinPoint, Exception e) {
        Signature signature = joinPoint.getSignature();
        AopLogUtil.annotationLog(4, AfterThrowing.class, signature.getName(), new Object[]{}, e.getMessage());
    }

    @After("pointCut()")
    public void afterMethod1(JoinPoint joinPoint) {
        Signature signature = joinPoint.getSignature();
        AopLogUtil.annotationLog(5, After.class, signature.getName(), joinPoint.getArgs(), null);
    }
}
