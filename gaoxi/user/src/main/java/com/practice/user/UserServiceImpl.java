package com.practice.user;

import com.alibaba.dubbo.config.annotation.Service;
import com.practice.service.UserService;

@Service(version = "1.0.0")
public class UserServiceImpl implements UserService{

    @Override
    public UserEntity login(LoginReq loginReq) {
        return null;
    }
}
