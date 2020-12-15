package com.luo;

import com.luo.pojo.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author luo Fuqiang
 * @date 2020/12/4 14:03
 */
public class test {

    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Person person = context.getBean("person", Person.class);

        person.getCat().shout();
        person.getDog().shout();
        System.out.println(person);
    }
}
