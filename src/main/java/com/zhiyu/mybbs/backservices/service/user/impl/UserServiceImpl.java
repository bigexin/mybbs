package com.zhiyu.mybbs.backservices.service.user.impl;

import com.zhiyu.mybbs.backservices.dao.user.UserMapper;
import com.zhiyu.mybbs.backservices.entities.User;
import com.zhiyu.mybbs.backservices.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryByPk(Integer id, String email) {
        return userMapper.queryByPk(id, email);
    }
}
