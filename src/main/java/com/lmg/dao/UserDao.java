package com.lmg.dao;

import com.lmg.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public void save(User user){
        String sql="insert into user(name,age) values(?,?)";
        jdbcTemplate.update(sql,user.getName(),user.getAge());
    }
}
