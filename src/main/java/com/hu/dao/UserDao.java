package com.hu.dao;

import com.hu.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by hu on 2017/5/24.
 */
@Mapper
public interface UserDao {

    int save(User user);

    User selectById(Integer id);

    int updateById(User user);

    int deleteById(Integer id);

    List<User> queryAll();

}
