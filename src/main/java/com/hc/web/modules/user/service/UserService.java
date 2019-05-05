package com.hc.web.modules.user.service;

import com.hc.web.modules.user.entity.User;

public interface UserService {


    User findByAppid(String s);

    void addUser(User user);

    User findById(Integer id);

    void deleteById(Integer id);
}
