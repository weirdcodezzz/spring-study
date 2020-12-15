package com.luo.demo01;

/**
 * 房东
 * @author luo Fuqiang
 * @date 2020/12/4 15:25
 */
public class Host implements Rent {

    @Override
    public void rent() {
        System.out.println("房东要出租房子");
    }

}
