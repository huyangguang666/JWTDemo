package com.pjb.springbootjjwt.mapper;

import com.pjb.springbootjjwt.domain.User;

public interface UserMapper {

    User findByUsername(String name);

    User findUserById(String Id);
}
