package com.lh.aigou_zuul_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class AigouZuulServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AigouZuulServiceApplication.class, args);
    }

}
