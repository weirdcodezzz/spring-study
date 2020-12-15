package com.luo.config;

import com.luo.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author luo Fuqiang
 * @date 2020/12/4 15:03
 */
@Configuration
@ComponentScan(value = {"com.luo.pojo"})
public class ApplicationConfig {

}
