package com.luo.mapper;

import com.luo.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author luo Fuqiang
 * @date 2020/12/4 17:42
 */
@Repository("userMapper")
public interface UserMapper {

    /**
     * 获得user列表
     * @return
     */
    List<User> getUserList();
}
