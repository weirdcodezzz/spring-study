package com.luo.demo02;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author luo Fuqiang
 * @date 2020/12/4 15:43
 */
public class ProxyInvocationHandler implements InvocationHandler {

    /**
     * 被代理的接口
     */
    private Object target;

    public void setRent(Object target) {
        this.target = target;
    }

    /**
     * 生成得到代理类
     * @return
     */
    public Object getProxy(){
        Object instance = Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
        return instance;
    }

    /**
     * 处理代理实例并返回结果
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method.getName());
        if(args != null){
            for (Object arg : args) {
                System.out.println(arg);
            }
        }
        Object result = method.invoke(target, args);
        return result;
    }
}
