package com.hu.service.impl;

import com.hu.dao.UserDao;
import com.hu.domain.User;
import com.hu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by hu on 2017/5/25.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void fun() {
        User user = new User();
        user.setName("aaa");
        user.setAge(111);
        userDao.save(user);
    }
}
