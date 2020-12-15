package com.luo.pojo;

/**
 * @author luo Fuqiang
 * @date 2020/12/4 10:50
 */
public class User {
    private String name;

    public User() {
        System.out.println("User 无参构造");
    }

    public User(String name) {
        this.name = name;
        System.out.println("User 有参构造");
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
