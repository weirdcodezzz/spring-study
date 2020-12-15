package com.luo.ioc;

import com.luo.pojo.Hello;
import com.luo.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author luo Fuqiang
 * @date 2020/12/4 10:52
 */
public class CreateWayTest {


    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user1 = context.getBean("user1", User.class);
        //User user2 = context.getBean("user", User.class);
        //System.out.println(user1 == user2);
        System.out.println(user1);
    }
}
