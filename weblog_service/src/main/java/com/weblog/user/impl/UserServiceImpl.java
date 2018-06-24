package com.weblog.user.impl;

import com.weblog.mapper.UserMapper;
import com.weblog.model.User;
import com.weblog.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "userService")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    public User getUserById(Integer userId) {
        User user = userMapper.selectByPrimaryKey(userId);
        return user;
    }
}
