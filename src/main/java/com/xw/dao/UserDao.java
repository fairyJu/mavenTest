package com.xw.dao;

import com.xw.bean.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
/*需要和在dao层接口中的id保持一致*/
    List<User> selAll();

    User login(User user);

    User ckname(String username);

    User editUser(Integer userid);

    int delUser(Integer userID);

    int insertUser(User user);
}
