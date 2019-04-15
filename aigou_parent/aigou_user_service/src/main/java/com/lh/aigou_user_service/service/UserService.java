package com.lh.aigou_user_service.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.netflix.feign.FeignClient;

public interface UserService {


    String getUser();


}
