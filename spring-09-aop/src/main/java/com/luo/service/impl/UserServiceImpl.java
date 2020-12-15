package com.luo.service.impl;

import com.luo.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author luo Fuqiang
 * @date 2020/12/4 16:19
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Override
    public void add() {
        System.out.println("增加");
    }

    @Override
    public void delete() {
        System.out.println("删除");
    }

    @Override
    public void update() {
        System.out.println("修改");
    }

    @Override
    public void select() {
        System.out.println("查询");
    }
}
