package com.lh.aigou_user_service.controller;

import com.lh.aigou_user_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getuser")
    public String getUser(){
        return userService.getUser();
    }
}
