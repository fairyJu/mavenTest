package com.xw.service;

import com.xw.bean.User;

import java.util.List;

public interface UserService {

    List<User> selAll();

    User login(String username,String pwd);

    User ckname(String username);

    User editUser(Integer userid);

    int delUser(Integer userID);

    int insertUser(User user);
}
