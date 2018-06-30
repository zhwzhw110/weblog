package com.server.controller;

import com.domain.model.User;
import com.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    //@Resource(name = "userService")
    @Autowired
    private UserService userService;

    @RequestMapping(value ="/user/findUser")
    @ResponseBody
    public Object findUser(){
        Integer userId = 1;
        User userById = userService.getUserById(userId);
        return userById;
    }

}
