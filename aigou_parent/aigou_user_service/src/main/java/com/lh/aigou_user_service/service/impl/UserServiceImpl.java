package com.lh.aigou_user_service.service.impl;

import com.lh.aigou_user_service.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    @HystrixCommand(fallbackMethod = "error")
    public String getUser() {
        return "漩涡鸣人";
    }

    public String error(){
        return "出错了";
    }
}
