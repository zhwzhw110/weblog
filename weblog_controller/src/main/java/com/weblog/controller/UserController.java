package com.weblog.controller;

import com.weblog.user.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Resource(name = "userService")
    private UserService userService;

    @PostMapping(value ="/findUser")
    public Object findUser(Integer userId){
        return userService.getUserById(userId);
    }

}
