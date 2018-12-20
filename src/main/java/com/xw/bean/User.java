package com.xw.bean;

public class User {

    private Integer userid;
    private String username;

    public User(String username, String pwd) {
        this.username = username;
        this.pwd = pwd;
    }

    private String pwd;
    private String email;


    public Integer getUserid() {
        return userid;
    }

    public User setUserid(Integer userid) {
        this.userid = userid;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public User setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPwd() {
        return pwd;
    }

    public User setPwd(String pwd) {
        this.pwd = pwd;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public User(Integer userid, String username, String pwd, String email) {
        this.userid = userid;
        this.username = username;
        this.pwd = pwd;
        this.email = email;
    }
}
