package com.lmg.service.impl;

import com.lmg.dao.UserDao;
import com.lmg.entity.User;
import com.lmg.service.UserService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserDao userDao;

    @Override
    public void save(User user) {
        userDao.save(user);
    }
}
