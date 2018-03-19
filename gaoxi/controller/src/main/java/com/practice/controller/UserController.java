package com.practice.controller;

import com.alibaba.dubbo.rpc.Result;

import javax.servlet.http.HttpServletResponse;

public interface UserController {
    public Result login(LoginReq loginReq, HttpServletResponse httpRsq);

}
