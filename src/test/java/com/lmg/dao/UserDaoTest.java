package com.lmg.dao;

import com.lmg.entity.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class UserDaoTest {

    @Autowired
    UserDao userDao;

    @Test
    void save() {
        User user=new User();
        user.setName("李四");
        user.setAge(18);
        userDao.save(user);
    }
}