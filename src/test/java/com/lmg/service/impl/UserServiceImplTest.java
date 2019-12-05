package com.lmg.service.impl;

import com.lmg.entity.User;
import com.lmg.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@RunWith(SpringRunner.class)
class UserServiceImplTest {

    @Resource
    UserService userService;

    @Test
    void save() {
        User user=new User();
        user.setName("张三");
        user.setAge(20);
        userService.save(user);
    }
}