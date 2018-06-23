package com.github.wenbo2018.cloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by shenwenbo on 2018/6/23.
 */
@RestController
public class UserController {

    @RequestMapping("/service/loadUser")
    public String loadUser() {
        return "user is shen";
    }

}
