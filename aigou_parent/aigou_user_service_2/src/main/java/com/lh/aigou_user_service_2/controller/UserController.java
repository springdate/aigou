package com.lh.aigou_user_service_2.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Value("")

    @GetMapping("/getuser")
    public String getuser(){
        return "宇智波·佐助";
    }
}
