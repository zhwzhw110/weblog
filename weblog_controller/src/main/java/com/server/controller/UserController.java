package com.server.controller;

import com.domain.model.User;
import com.service.user.UserService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/*
 * @author zhangHaiWen
 * @date 2018/7/8 14:28
 * @desc 用户控制类
 * @param  * @param null
 * @return 
*/

@Controller
@RequestMapping(value = "/user")
public class UserController {
    private final static Log log = LogFactory.getLog(UserController.class);

    @Autowired
    private UserService userService;

    @Autowired
    private HttpServletRequest request;

    /*
     * @author zhangHaiWen
     * @date 2018/7/8 14:23
     * @desc 查找用户使用的方法
     * @param  * @param null
     * @return
    */
    @RequestMapping(value = "/findUser")
    @ResponseBody
    public Object findUser() {
        return null;
    }

    /*
     * @author zhangHaiWen
     * @date 2018/7/8 14:28
     * @desc  用户登录的方法
     * @param  * @param user
     * @return
    */
    @RequestMapping(value = "/userLogin")
    public String userLogin(User user, Model model) {
        model.addAttribute("END",new Date());
        return "/user/userlogin";
    }


    /*
     * @author zhangHaiWen
     * @date 2018/7/8 15:40
     * @desc 用户注册跳转方法
     * @param  * @param null
     * @return 
    */
    @RequestMapping(value = "/userRegister")
    public String userRegister(User user,String userPwdConfirm){
        log.info("userRegiest:{"+user+"}"+"_{"+userPwdConfirm+"}");
        //获取ip地址
        String IP = request.getRemoteAddr();
        user.setUserLastLoginIp(IP);
        user.setUserRegisterIp(IP);
        int result = userService.doRegiest(user,userPwdConfirm);
        return "/user/userRegister";
    }

}
