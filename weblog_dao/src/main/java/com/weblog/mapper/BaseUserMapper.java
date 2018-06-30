package com.weblog.mapper;


import com.domain.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BaseUserMapper{

   //@Select("SELECT * FROM USER WHERE id = #{userId} ")
   User getUserById(@Param("userId") Integer userId);

}
