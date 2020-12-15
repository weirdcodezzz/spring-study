package com.luo;

import com.luo.config.ApplicationConfig;
import com.luo.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author luo Fuqiang
 * @date 2020/12/4 15:06
 */
public class test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        User user = context.getBean("user", User.class);
        System.out.println(user);
    }
}
