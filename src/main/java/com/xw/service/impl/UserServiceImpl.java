package com.xw.service.impl;

import com.xw.bean.User;
import com.xw.dao.UserDao;
import com.xw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("UserService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao ud;

    @Override
    public List<User> selAll() {
        return ud.selAll();
    }

    @Override
    public User login(String username, String pwd) {

        /*当使用的不是全参构造的时候需要创建  单独使用的构造方法*/
        return ud.login(new User(null, username, pwd,null));
    }

    @Override
    public User ckname(String username) {

        return ud.ckname(username);
    }

    @Override
    public User editUser(Integer userid) {
        return ud.editUser(userid);
    }

    @Override
    public int delUser(Integer userID) {
        return ud.delUser(userID);
    }

    @Override
    public int insertUser(User user) {
        return ud.insertUser(user);
    }

}
