package com.luo;

import com.luo.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author luo Fuqiang
 * @date 2020/12/4 14:44
 */
public class test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        User user = context.getBean("user", User.class);

        System.out.println(user.name);
    }
}
