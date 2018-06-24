package com.weblog.server.controller;

import com.weblog.user.UserService;
import com.weblog.user.impl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    /*@Resource(name = "userService")
    private UserService userService;*/

    @RequestMapping(value ="/user/findUser")
    @ResponseBody
    public Object findUser(){
        UserService userService = new UserServiceImpl();
        Integer userId = 1;
        return userService.getUserById(userId);
    }

}
