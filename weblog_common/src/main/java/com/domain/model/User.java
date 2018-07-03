package com.domain.model;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Null;
import java.io.Serializable;

public class User implements Serializable {

    public User() {
    }

    public User(Integer id, String username) {
        this.id = id;
        this.username = username;
    }
    @Null
    private Integer id;
    @NotEmpty
    private  String username;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @AssertTrue
    public boolean isVaild(){
        //在这儿添加校验
        //例如校验 姓名是否为zhw
        if(!"zhw".equals(getUsername())){
            return false;
        }
        return true;
    }

}
