package com.pjb.springbootjjwt.service;

import com.pjb.springbootjjwt.domain.User;
import com.pjb.springbootjjwt.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public User findByUsername(String name){
        return userMapper.findByUsername(name);
    }

    public User findUserById(String userId) {
        return userMapper.findUserById(userId);
    }

}
