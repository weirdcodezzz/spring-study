package com.luo.myself;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author luo Fuqiang
 * @date 2020/12/4 17:01
 */
@Component
@Aspect
public class AnnotationPointCut {

    @Before("execution(* com.luo.service.impl.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("-----方法之前------");
    }
}
