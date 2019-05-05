package com.lh.aigou_user_service;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
@MapperScan("com.lh.aigou_user_service.mapper")
public class AigouUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AigouUserServiceApplication.class, args);
    }

}
