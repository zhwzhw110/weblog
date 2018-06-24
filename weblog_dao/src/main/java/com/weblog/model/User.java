package com.weblog.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "user")
public class User implements Serializable {

    public User() {
    }

    public User(Integer id, String username) {
        this.id = id;
        this.username = username;
    }

    @Id
    private Integer id;

    @Column(name = "user_name")
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
}
