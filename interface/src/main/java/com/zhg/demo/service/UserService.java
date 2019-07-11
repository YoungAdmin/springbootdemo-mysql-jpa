package com.zhg.demo.service;

import com.zhg.demo.common.responseResult.ResponseResult;

public interface UserService {

    /**
     * 通过用户昵称查找用户信息
     * @param name
     * @return
     */
    ResponseResult findUserByName(String name);
}
