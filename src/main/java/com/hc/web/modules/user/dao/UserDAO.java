package com.hc.web.modules.user.dao;

import com.hc.web.modules.user.entity.User;

/**
 * DAO接口,mybatis动态完成Impl
 */
public interface UserDAO {

    Integer addUser(User u);

    User findByAppid(String appid);

    User findById(Integer id);

    Integer deleteById(Integer id);
}