package com.hc.web.modules.user.service;

import com.hc.web.modules.user.dao.UserDAO;
import com.hc.web.modules.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDAO userDAO;

    @Override
    public User findByAppid(String s) {
        return userDAO.findByAppid(s);
    }

    @Override
    public void addUser(User user) {
        userDAO.addUser(user);
    }

    @Override
    public User findById(Integer id) {
        return userDAO.findById(id);
    }

    @Override
    public void deleteById(Integer id) {
        userDAO.deleteById(id);
    }
}
