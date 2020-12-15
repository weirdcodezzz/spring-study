package com.luo.demo01;

/**
 * @author luo Fuqiang
 * @date 2020/12/4 15:27
 */
public class Proxy implements Rent {

    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }


    @Override
    public void rent() {
        host.rent();
    }
}
