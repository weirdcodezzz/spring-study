package com.luo.pojo;

/**
 * @author luo Fuqiang
 * @date 2020/12/4 11:26
 */
public class Address {
    private String address;

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                '}';
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
