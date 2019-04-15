package com.lh.aigou_user_service_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AigouUserService2Application {

    public static void main(String[] args) {
        SpringApplication.run(AigouUserService2Application.class, args);
    }

}
