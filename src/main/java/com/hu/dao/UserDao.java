package com.hu.dao;

import com.hu.domain.entity.User;

import java.util.List;

/**
 * Created by hu on 2017/5/24.
 */
public interface UserDao {

    int save(User user);

    User selectById(Integer id);

    int updateById(User user);

    int deleteById(Integer id);

    List<User> queryAll();

}
