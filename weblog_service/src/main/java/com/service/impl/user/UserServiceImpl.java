package com.service.impl.user;


import com.domain.model.User;
import com.domain.paraminfo.CommonInfo;
import com.domain.utils.ObjectUtils;
import com.domain.utils.StringUtils;
import com.service.user.UserService;
import com.weblog.mapper.BaseUserMapper;
import org.apache.shiro.crypto.hash.Md5Hash;
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

        /*
         * @author zhangHaiWen
         * @date 2018/7/8 19:47
         * @desc 用户注册实现方法
         * @param  * @param user 用户对象
         * @param userPwdConfirm 第二次密码校验
         * @return java.lang.String
        */
    @Override
    public int doRegiest(User user, String userPwdConfirm) {
        //生成4位的随机字符串
        int result = 0;
        if(ObjectUtils.ObjectIsNotNull(user)&&StringUtils.isNotNULL(user.getUserPwd())&&StringUtils.isNotNULL(userPwdConfirm)&&user.getUserPwd().equals(userPwdConfirm)){
            String salt = StringUtils.getRandomStr(CommonInfo.RANDOM_LEN);
            String userPwd = new Md5Hash(user.getUserPwd(), salt, CommonInfo.HASH_INTERATIONS).toString();
            user.setUserPwd(userPwd);
            user.setUserSalt(salt);
            result=baseUserMapper.insterUser(user);

        }
        return result;
    }
}
