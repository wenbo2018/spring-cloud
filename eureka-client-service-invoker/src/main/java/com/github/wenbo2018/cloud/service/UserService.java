package com.github.wenbo2018.cloud.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by shenwenbo on 2018/6/23.
 */
@FeignClient(value = "user-service")
public interface UserService {

    @RequestMapping(value = "/service/loadUser", method = RequestMethod.GET)
    String loadUser();

}
