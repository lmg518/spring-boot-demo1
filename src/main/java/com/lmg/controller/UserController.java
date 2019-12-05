package com.lmg.controller;

import com.lmg.entity.User;
import com.lmg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {

    @Resource
    UserService userService;

    @RequestMapping("/saveUser")
    public String saveUser(User user){
        userService.save(user);
        return "保存成功";
    }
}
