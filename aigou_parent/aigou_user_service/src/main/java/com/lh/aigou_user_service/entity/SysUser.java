package com.lh.aigou_user_service.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Data
public class SysUser implements Serializable {

    private static final long serialVersionUID = -1750952296744744851L;

    @TableId
    private Long sysUserId;

    private String sysUserName;

    private String account;
}
