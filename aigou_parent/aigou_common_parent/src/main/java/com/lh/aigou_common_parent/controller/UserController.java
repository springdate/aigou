package com.lh.aigou_common_parent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("getuser")
    public String getMsg(){
        return restTemplate.getForObject("http://aigou-user-service/getuser",String.class);
    }

}
