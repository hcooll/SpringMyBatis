package com.hc.web.modules.user.controller;

import com.hc.web.modules.user.entity.User;

import com.hc.web.modules.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/userInfo", method = RequestMethod.GET)
    public User test() {
        return userService.findByAppid("10524782571");
    }

    //-http://localhost:8080/test/add?name=abc&passwd=123&appid=95955542783
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public User save(@RequestParam("name") String name,
                     @RequestParam(value = "passwd", defaultValue = "0") String passwd,
                     @RequestParam(value = "appid", defaultValue = "0") String appid) {
        User user = new User(name, passwd, appid);
        userService.addUser(user);
        return userService.findById(user.getId());
    }


    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public void delete(@RequestParam("id") Integer id) {
        userService.deleteById(id);
    }

}
