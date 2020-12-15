package com.luo.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @author luo Fuqiang
 * @date 2020/12/4 14:43
 */
@Component
public class User {
    @Value("小罗")
    public String name;
}
