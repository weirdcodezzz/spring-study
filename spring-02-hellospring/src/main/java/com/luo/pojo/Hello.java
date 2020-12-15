package com.luo.pojo;

/**
 * @author luo Fuqiang
 * @date 2020/12/4 10:13
 */
public class Hello {
    private String str;

    public void sayHello(){
        System.out.println("hello " + str);
    }

    @Override
    public String toString() {
        return "Hello{" +
                "str='" + str + '\'' +
                '}';
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
