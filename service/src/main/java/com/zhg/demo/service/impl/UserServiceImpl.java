package com.zhg.demo.service.impl;

import com.zhg.demo.common.responseResult.ResponseResult;
import com.zhg.demo.dao.UserDao;
import com.zhg.demo.pojo.User;
import com.zhg.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public ResponseResult findUserByName(String name) {
        try {
            User user = userDao.findByName(name).orElse(null);
            return ResponseResult.success(user);
        }catch (Exception e){
            return ResponseResult.failure(e.getMessage());
        }
    }
}
