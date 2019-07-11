package com.zhg.demo.controller;

import com.zhg.demo.common.responseResult.ResponseResult;
import com.zhg.demo.pojo.User;
import com.zhg.demo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Api(value = "/user", tags = { "测试接口user" })
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "通过用户名查询用户信息", response = User.class, httpMethod = "GET", notes = "通过用户名查询用户信息")
    @RequestMapping(value = "/find",method = RequestMethod.GET)
    public ResponseResult findByName(String name){
        return userService.findUserByName(name);
    }
}
