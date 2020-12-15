package com.luo.test;

import com.luo.pojo.Student;
import com.luo.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author luo Fuqiang
 * @date 2020/12/4 11:32
 */
public class DITest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Student student = context.getBean("student", Student.class);

        User user = context.getBean("user", User.class);
        System.out.println(user);

        System.out.println(student);
    }
}
