package com.github.wenbo2018.cloud.controller;

import com.github.wenbo2018.cloud.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by shenwenbo on 2018/6/23.
 */
@RestController
public class UserServiceTestController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/user/loadUser", method = RequestMethod.GET)
    public String loadUserInfo() {
        return userService.loadUser();
    }

}
