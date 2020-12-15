package com.luo.demo02;

import java.lang.reflect.InvocationHandler;

/**
 * @author luo Fuqiang
 * @date 2020/12/4 15:42
 */
public class Host implements Rent {
    @Override
    public void rent(String str) {
        System.out.println("房东要出租房子" + str);
    }
}
