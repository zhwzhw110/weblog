package com.service.impl.user;


import com.domain.model.User;
import com.service.user.UserService;
import com.weblog.mapper.BaseUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private BaseUserMapper baseUserMapper;

    public User getUserById(Integer userId) {
        User user = baseUserMapper.getUserById(userId);
        return user;
    }
}
