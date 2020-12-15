package com.luo.ioc;

import com.luo.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author luo Fuqiang
 * @date 2020/12/4 10:32
 */
public class HelloTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Hello hello = context.getBean("hello", Hello.class);
        hello.sayHello();
    }
}
