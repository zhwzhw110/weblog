package com.service.user;


import com.domain.model.User;

public interface UserService{

    /**
     * 查找单个用户
     * @param userId
     * @return
     */
    User getUserById(Integer userId);

    /**
     * 用户注册
     * @param user
     * @param userPwdConfirm
     * @return
     */
    int doRegiest(User user, String userPwdConfirm);
}
