package com.lh.aigou_user_service_2.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/getuser")
    public String getuser(){
        return "宇智波·佐助";
    }
}
