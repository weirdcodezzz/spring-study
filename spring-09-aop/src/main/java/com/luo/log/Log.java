package com.luo.log;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author luo Fuqiang
 * @date 2020/12/4 16:21
 */
@Component
public class Log implements MethodBeforeAdvice, AfterReturningAdvice {


    /**
     * @param method 要执行的目标对象的方法
     * @param args 参数
     * @param target 目标对象
     * @throws Throwable
     */
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getName() + "->" + method.getName() + "->执行了");
    }

    /**
     *
     * @param returnValue 返回值
     * @param method
     * @param args
     * @param target
     * @throws Throwable
     */
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getName() + "->" + method.getName() + "->执行了，返回的结果->" + returnValue);
    }
}
