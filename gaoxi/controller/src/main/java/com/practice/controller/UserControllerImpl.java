package com.practice.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.rpc.Result;
import com.practice.service.UserService;

import javax.servlet.http.HttpServletResponse;

public class UserControllerImpl implements UserController {
    @Reference
    private UserService userService;
    @Override
    public Result login(LoginReq loginReq, HttpServletResponse httpRsq) {
        UserEntity userEntity = userService.login(loginReq);
    }
}
