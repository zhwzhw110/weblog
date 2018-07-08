package com.weblog.mapper;


import com.domain.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BaseUserMapper{

   //@Select("SELECT * FROM USER WHERE id = #{userId} ")
   User getUserById(@Param("userId") Integer userId);

   //用户注册，插入一条数据到数据库
    int insterUser(@Param("user") User user);
}
