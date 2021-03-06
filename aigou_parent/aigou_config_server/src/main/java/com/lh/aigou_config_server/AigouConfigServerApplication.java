package com.lh.aigou_config_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer //启用配置服务端
@EnableDiscoveryClient
public class AigouConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AigouConfigServerApplication.class, args);
    }

}
