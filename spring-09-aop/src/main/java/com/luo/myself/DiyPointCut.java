package com.luo.myself;


import org.springframework.stereotype.Component;

/**
 * @author luo Fuqiang
 * @date 2020/12/4 16:51
 */
@Component("diy")
public class DiyPointCut {

    public void before(){
        System.out.println("方法之前");
    }

    public void after(){
        System.out.println("方法之后");
    }
}
