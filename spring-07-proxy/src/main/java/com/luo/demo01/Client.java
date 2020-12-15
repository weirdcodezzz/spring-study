package com.luo.demo01;

/**
 * @author luo Fuqiang
 * @date 2020/12/4 15:26
 */
public class Client {

    public static void main(String[] args) {
        Host host = new Host();
        Proxy proxy = new Proxy(host);
        proxy.rent();
    }
}
