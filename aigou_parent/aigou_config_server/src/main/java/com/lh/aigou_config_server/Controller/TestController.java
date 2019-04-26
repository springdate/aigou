package com.lh.aigou_config_server.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @GetMapping("/hi")
    public String gainConfig(){
        return "===";
    }
}
