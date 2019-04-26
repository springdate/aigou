package com.lh.aigou_user_service.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "user")
public class SysUser {
    private Long sysUserId;
    private String sysUserName;
}
